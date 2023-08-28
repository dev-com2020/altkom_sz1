import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyApp {
    public static void main(String[] args) {
        A a = new A();
        SomeClass sc = new SomeClass(1, "prop2");
        sc.method3();
        System.out.println(sc.method3());
        System.out.println(a.getProp());
        a.setProp("new value");
        System.out.println(a.getProp());
        System.out.println(a.getDouble());
        System.out.println(sc.prop1);
        System.out.println(SomeClass.staticProp);
        System.out.println(SomeClass.someMethod());

        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);
        List<String> names = Arrays.asList("John", "Freddy", "Samuel");
        Stream<Person> stream = names.stream().map(Person::new);
        List<Person> people = stream.toList();
    }
}
