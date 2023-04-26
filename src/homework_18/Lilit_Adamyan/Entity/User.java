package homework_18.Lilit_Adamyan.Entity;

public class User {
    private final String name;
    private final String surName;
    private final Address address;
    private final int age;
    private final String email;

    public User(String name, String surName, Address address, int age, String email) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Address getAddress() {
        return address;
    }


    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass().equals(obj.getClass())) {
            return false;
        }
        User other = (User) obj;
        if (this.name.equals(other.name) && this.surName.equals(other.surName)
                && this.address.equals(other.address)
                && this.age == other.age
                && this.email.equals(other.email)) {

        }
        return true;
    }

    @Override
    public int hashCode() {
        int k = 31;
        return k * this.name.hashCode() +
                k * this.surName.hashCode() +
                k * this.age +
                k * this.address.hashCode() +
                k * this.email.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


}
