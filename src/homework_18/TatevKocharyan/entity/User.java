package homework_18.TatevKocharyan.entity;

import java.util.Objects;

public final class User {

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
        this.address=new Address(address.getCityName(),address.getStreet(),address.getHomeNumber());
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
        return new Address(address.getCityName(),address.getStreet(),address.getHomeNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        if (age == user.age
                && name.equals(user.name)
                && surname.equals(user.surname)
                && email.equals(user.email)
                && password.equals(user.password)) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, age);
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
