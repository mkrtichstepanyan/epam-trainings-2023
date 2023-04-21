package homework_18.Varsik_Pijoyan.entity;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.name.equals(user.name) && this.surname.equals(user.surname) &&
                this.email.equals(user.email) && this.password.equals(user.password) &&
                this.age == user.age && this.address.equals(user.address);


    }


    @Override
    public int hashCode() {
        int result = 17;
        return result * (this.name.hashCode() * this.surname.hashCode() * this.email.hashCode()
                * this.password.hashCode() * this.age * this.address.hashCode());
    }

    @Override
    public String toString() {
        return "{" + "Name&Surname: " + name + " " + surname + "}" +
                "," + "{" + "Age: " + age + "}" + ", " + "{" + "Email&Password: " + email +
                " " + "(psw: " + password + ")" + "}" + ", " + "{" + "Address: " + address + "}";

    }
}
