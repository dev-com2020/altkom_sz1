public class MyApp {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getProp());
        a.setProp("new value");
        System.out.println(a.getProp());
        System.out.println(a.getDouble());
    }
}
