public class C {
    int m(String s) {
        return s.length();
    }
    int m(String s, double d) {
        return s.length() + (int) d;
    }
    static int m(String s,double d, int i) {
        return s.length() + (int) d + i;
    }
}
