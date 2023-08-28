public class TheParentClass {
    private int prop;
    public TheParentClass(int prop) {
        this.prop = prop;
    }
}

class TheChildClass extends TheParentClass {

    private int x;
    private String prop;
    private String anotherProp = "abc";
    public TheChildClass(String prop) {
        super(42);
        this.prop = prop;
    }
    public TheChildClass(int arg1, String arg2) {
        super(arg1);
        this.prop = arg2;
    }
}

