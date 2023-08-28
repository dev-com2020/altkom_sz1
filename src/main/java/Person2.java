//final class Person2 {
//    private int age;
//    private String name;
//    public Person2(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//    public int age() { return age; }
//    public String name() { return name; }
//
//    @Override
//    public boolean equals(Object o){
////        if(o == null) return false;
//    }
//    @Override
//    public int hashCode(){
////        return 0;
//    }
//    @Override
//    public String toString(){
////        return "";
//    }
//}


record Person2(int age, String name) {
    public Person2 {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

