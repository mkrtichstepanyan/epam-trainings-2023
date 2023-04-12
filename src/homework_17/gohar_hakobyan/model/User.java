package homework_17.gohar_hakobyan.model;

public class User {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public User(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
