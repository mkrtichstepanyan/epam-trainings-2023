package homework_18.TatevKocharyan.entity;

import java.util.Objects;

public final class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int age;


    public User(String name, String surname, String email, String password, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
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
}
