package homework_16.Roza_Petrosyan.generic_dynamic_array_task.users_deep_clone;

public class User implements Cloneable{
    private String name;
    private String surName;
    private int age;
    private Address address;
    public User(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
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
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            user = new User(this.getName(), this.getSurName(),this.getAge(), this.getAddress());
        }
        user.address = (Address) this.address.clone();
        return user;
    }
}
