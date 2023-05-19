package homework_18.argishti_Mesropyan.entity;

import java.util.Objects;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int age;
    private final Address address;

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


    public String getSurname() {
        return surname;
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

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age
                && name.equals(user.name)
                && surname.equals(user.surname)
                && email.equals(user.email)
                && password.equals(user.password)
                && address.equals(user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, age, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
