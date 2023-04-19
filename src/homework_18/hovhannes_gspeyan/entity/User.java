package homework_18.hovhannes_gspeyan.entity;

import java.util.Objects;

public final class User {

    private final String name;
    private final String surname;
    private final int age;
    private final String password;
    private final Address address;

    public User(String name, String surname, int age, String password, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name)
                && Objects.equals(surname, user.surname)
                && Objects.equals(password, user.password)
                && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        int hashCode = this.age;
        hashCode = hashCode * 31 + (this.name == null ? 0 : this.name.hashCode());
        hashCode = hashCode * 31 + (this.surname == null ? 0 : this.surname.hashCode());
        hashCode = hashCode * 31 + (this.password == null ? 0 : this.password.hashCode());
        hashCode = hashCode * 31 + (this.address == null ? 0 : this.password.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
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
    public String getPassword() {
        return password;
    }
    public Address getAddress() {
        return address;
    }
}
