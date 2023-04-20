package homework_18.alina_mkhoyan.entity;


import java.util.Objects;

public final class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int age;
    private final Address address;

    public User(String name, String surname, String email, String password, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof User)) {
            return false;
        }

        User other = (User) obj;

        return Objects.equals(name, other.name) &&
                Objects.equals(surname, other.surname) &&
                Objects.equals(email, other.email) &&
                Objects.equals(password, other.password) &&
                age == other.age &&
                Objects.equals(address, other.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, age, address);
    }
}