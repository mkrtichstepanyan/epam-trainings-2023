package homework_18.Anush_Ananyan.entity;

import java.util.Objects;

public final class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private int age;
    private Address address;


    public User(String name, String surname, String email, String password, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof User) {
            User test = (User) obj;
            if (Objects.equals(this.name, test.name)
                    && Objects.equals(this.surname, test.surname)
                    && Objects.equals(this.email, test.email)
                    && Objects.equals(this.password, test.password)
                    && Objects.equals(this.age, test.age)
                    && Objects.equals(this.address, test.address)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 7;
        h = 31 * h + Objects.hashCode(this.name) +
                Objects.hashCode(this.surname) +
                Objects.hashCode(this.email) +
                Objects.hashCode(this.password) +
                this.age +
                Objects.hashCode(this.address);
        return h;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address.toString() +
                '}';
    }
}
