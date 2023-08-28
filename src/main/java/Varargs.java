public class Varargs {
    public static void main(String... args) {
        someMethod("hello", 1, 2.0, 3.0, 4.0);
        someMethod("hello", 1, 2.0, 3.0, 4.0, 5.0, 6.0);
    }

    private static String someMethod(String s, int i, double ...arr) {
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        return s;
    }
}
