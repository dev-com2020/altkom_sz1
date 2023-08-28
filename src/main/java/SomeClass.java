public class SomeClass implements SomeInterface{
    int prop1;
    private String prop2;

    public void method1() {
        System.out.println("method1");
    }

    public String method2(int i) {
        return "method2";
    }

    public int method3() {
        return 444;
    }
    static String someMethod(){
        return "someMethod";
    }

    public static String staticProp = "staticProp";

    public SomeClass(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public SomeClass(String prop2) {
        this.prop2 = prop2;
    }
}
