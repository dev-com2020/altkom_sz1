public interface Over {
    int m(String s);
    int m(String s, double d);
    default int m(String s, double d, int i) {
        return 0;
    }
    static int m(String s, double d, int i, long l) {
        return 1;
    }
}
