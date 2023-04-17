package homework_16.Radik_Manasyan.generic_dynamic_array.testClone;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String surName;
    private int age;
    private UserAddress userAddress;

    public User(String name, String surName, int age, UserAddress userAddress) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.userAddress = userAddress;
    }

    public User(User user) {
        this.name = user.name;
        this.surName = user.surName;
        this.age = user.age;
        this.userAddress = user.userAddress;


    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", userAddress=" + userAddress +
                '}';
    }
}
