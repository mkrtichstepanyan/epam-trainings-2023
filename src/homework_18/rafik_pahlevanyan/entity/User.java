package homework_18.rafik_pahlevanyan.entity;


import java.util.Objects;

public final class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final Address address;
    private final int age;

    public User(String name, String surname, String email, String password, Address address, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.address = new Address(address.getStreet(), address.getCity(), address.getCountry());
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity(), address.getCountry());
    }

    public int getAge() {
        return age;
    }


    public boolean equals(Object o) {
        return o instanceof User user
                && age == user.age
                && Objects.equals(name, user.name)
                && Objects.equals(surname, user.surname)
                && Objects.equals(email, user.email)
                && Objects.equals(password, user.password)
                && Objects.equals(address, user.address);
    }


    public int hashCode() {
        return Objects.hash(name, surname, email, password, address, age);
    }
}
