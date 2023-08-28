import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Plik {
    private static final String EXPECTED = "Expected";

    public static void main(String[] args) {
        try {
            Set<String> cities = new HashSet<>();
            Set<String> states = new HashSet<>();
            Set<Integer> zips = new HashSet<>();
            Map<Integer, Integer> oldestByZip = new HashMap<>();
            Map<Integer, String> oldestNameByZip = new HashMap<>();

            URL url = Plik.class.getClassLoader().getResource("input.csv");
            File file = new File(url.toURI());
            List<Person3> list = getInputPersonList(file);
            list.stream().parallel().forEach(p -> {
                cities.add(p.getCity());
                states.add(p.getState());
                zips.add(p.getZip());
                int age = oldestByZip.getOrDefault(p.getZip(), 0);
                if (p.getAge() > age) {
                    oldestByZip.put(p.getZip(), p.getAge());
                    oldestNameByZip.put(p.getZip(), p.getAge() + ": " + p.getName());
                } else if (p.getAge() == age) {
                    oldestNameByZip.put(p.getZip(), oldestNameByZip.get(p.getZip()) + ", " + p.getName());
                }
            });

            System.out.println("cities: " + cities.stream().sorted().collect(Collectors.joining(", ")));
            System.out.println("states: " + states.stream().sorted().collect(Collectors.joining(", ")));
            System.out.println("zips: " + zips.stream().sorted().map(i -> String.valueOf(i)).collect(Collectors.joining(", ")));
            System.out.println("Oldest in each zip: " + oldestNameByZip.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(e -> e.getKey() + ": " + e.getValue()).collect(Collectors.joining(", ")));
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().startsWith(EXPECTED)) {
                System.out.println("Input Error: " + e.getMessage());
            } else {
                e.printStackTrace();
            }

        }
    }

    private static List<Person3> getInputPersonList(File file) throws IOException {
        return Files.lines(file.toPath())
                .skip(1)
                .parallel()
                .map(Plik::validLine)
                .map(l -> {
                    Person3 person = new Person3(Integer.parseInt(l.get(2)), l.get(1), l.get(0));
                    person.setAddress(l.get(3), l.get(4), l.get(5), Integer.parseInt(l.get(6)));
                    return person;
                }).toList();
    }

    private static List<String> validLine(String line) {
        String[] arr = line.split(",");
        if(arr.length != 7) {
            throw new RuntimeException(EXPECTED + " 7 columns, found " + arr.length + " in line: " + line);
        }
        List<String> values = Arrays.stream(arr).parallel().map(s -> {
            String val = s.trim();
            if (val.isEmpty()){
                throw new RuntimeException(EXPECTED + " non-empty value, found empty in line: " + line);
            }
            return val;
        }).toList();

        try {
            Integer.valueOf(values.get(2));
            Integer.valueOf(values.get(6));

        } catch (Exception e) {
            throw new RuntimeException(EXPECTED + " integer value, found non-integer in line: " + line);
        }
        if (values.get(6).length() != 5) {
            throw new RuntimeException(EXPECTED + " 5 digit zip, found " + values.get(6).length() + " in line: " + line);
        }
        return values;

    }
}