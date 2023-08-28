public interface AB {
    default void method() {
        System.out.println("AB");
    }
}

interface BC extends AB{
    @Override
    default void method() {
        System.out.println("BC");
    }
}
class CD implements AB, BC {
    public void method() {
        System.out.println("CD");
    }
}

class Main {
    public static void main(String[] args) {
        AB ab = new CD();
        ab.method();
    }
}