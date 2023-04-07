package homework_16.Roza_Petrosyan.chapter_20.user_defined_classes;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}
