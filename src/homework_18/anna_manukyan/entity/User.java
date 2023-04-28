package homework_18.anna_manukyan.entity;

import homework_10.anna_manukyan.pizzeria.annotations.NotNull;
import homework_9.anna_manukyan.annotations.Email;
import homework_9.anna_manukyan.annotations.Min;

import java.util.Objects;

public final class User {
    private final String name;
    private final String surname;
    @Email
    @NotNull
    private final String email;
    private transient final String password;
    @Min
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
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = (result * 31) + (7 * name.hashCode()) + 11 * surname.hashCode() + 13 * email.hashCode() + 17 * address.hashCode();
        return result;
    }
}
