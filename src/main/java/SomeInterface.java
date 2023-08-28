public interface SomeInterface {
    void method1();
    String method2(int i);

    default int method3() {
        return 3;
    }
    default int method4() {
        return getNumber() + 22;
    }

    private int getNumber(){
        return 2;
    }
}
