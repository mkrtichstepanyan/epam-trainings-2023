package homework_18.Davit_Poghosyan.entity;

public class User {
    private String name;
    private String surName;
    private String email;
    private Address address;
    private String password;
    private int age;

    public User(String name, String surName, String email, Address address, String password, int age) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
