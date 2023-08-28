public class Start{
    public static void main(String[] args) {
//        Ukrywanie.method();
//        System.out.println(Ukrywanie2.NAME);
//        Ukrywanie2.method();

//        System.out.println(E.NAME);
//        E.method();
//
//        D obj = new E();
//        System.out.println(obj.NAME);
//        System.out.println(((E) obj).NAME);
//        System.out.println(obj.name1);
//        System.out.println(((E) obj).name1);

        Person2 p1 = new Person2(10, "Jan");
        System.out.println(p1);
//        Person2 p2 = new Person2(-50, "Jan");
//        System.out.println(p2);

        System.out.println(p1.age());


    }
}
