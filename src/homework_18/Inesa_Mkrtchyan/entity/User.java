package homework_18.Inesa_Mkrtchyan.entity;

public class User {
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

    public User() {
    }

    @Override
    public int hashCode() {
        int r = name != null ? name.hashCode() : 0;
        r = 31 * r + age;
        r = 31 * r + (surname == null ? 0 : surname.hashCode());
        r = 31 * r + (email == null ? 0 : email.hashCode());
        r = 31 * r + address.hashCode();
        return r;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User u = (User) o;
        return this.name.equals(u.name) &&
                this.surname.equals(u.surname) &&
                this.password.equals(u.password) &&
                this.email.equals(u.email) &&
                this.address.equals(u.address) &&
                this.age == u.age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
