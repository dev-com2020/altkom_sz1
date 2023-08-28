public class Person3 {
    private int age, zip;
    private String fName, lName, street, city, state;

    public Person3(int age, String fName, String lName) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }


    public int getZip() {
        return zip;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String street, String city, String state, int zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}
