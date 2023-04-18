package homework_18.garik_gharibyan.entity;

public class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String password;

    private final Address address;
    private final int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public User(String name, String surname, String email, String password, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        User newUser = (User) obj;

        return this.name.equals(newUser.name) &&
                this.surname.equals(newUser.surname) &&
                this.password.equals(newUser.password) &&
                this.email.equals(newUser.email) &&
                this.age == newUser.age &&
                this.address.equals(newUser.address);
    }

    @Override
    public int hashCode() {
        return 31 * (name.hashCode() + surname.hashCode() +
                password.hashCode() + email.hashCode() +
                age + address.hashCode());
    }

    @Override
    public String toString() {
        return "{name: " + name + ", surname: "+ surname + ", age: " + age+ "}";
    }
}
