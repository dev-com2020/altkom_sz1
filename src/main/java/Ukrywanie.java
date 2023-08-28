public interface Ukrywanie {
    String NAME = "Ukrywanie";
    static void method(){
        System.out.println("Ukrywanie");
    }
}
interface Ukrywanie2 extends Ukrywanie {
    String NAME = "Ukrywanie2";
    static void method(){
        System.out.println("Ukrywanie2");
    }
}