package homework_18.hovhannes_gspeyan.entity;

import java.util.Objects;

public final class User {

    private String name;
    private String surname;
    private int age;
    private String password;
    private Address address;

    public User(String name, String surname, int age, String password, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.address = address;
    }

    public User() {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
