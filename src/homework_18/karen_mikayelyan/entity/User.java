package homework_18.karen_mikayelyan.entity;

public final class User {
    private final String name;
    private final String surName;
    private final String email;
    private final String password;
    private final int age;
    private final Address address;

    public User(String name, String surName, String email, String password, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = new Address(address.getCity(), address.getStreet(), address.getHomeNumber());
    }

    public String getName() {
        return name;
    }


    public String getSurName() {
        return surName;
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


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(this.getClass().equals(obj.getClass()))) {
            return false;
        }
        User otherUser = (User) obj;

        return this.age == otherUser.age
                && (this.name != null && this.name.equals(otherUser.name))
                && (this.surName != null && this.surName.equals(otherUser.surName))
                && (this.email != null && this.email.equals(otherUser.email))
                && (this.password != null && this.password.equals(otherUser.password))
                && (this.address != null && this.address.equals(otherUser.address));
    }

    public int hashCode() {
        int hashCode = (int) age;
        hashCode = hashCode * 31 + (this.name == null ? 0 : this.name.hashCode());
        hashCode = hashCode * 31 + (this.surName == null ? 0 : this.surName.hashCode());
        hashCode = hashCode * 31 + (this.email == null ? 0 : this.email.hashCode());
        hashCode = hashCode * 31 + (this.password == null ? 0 : this.password.hashCode());
        hashCode = hashCode * 31 + (this.address == null ? 0 : this.address.hashCode());
        return hashCode;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
