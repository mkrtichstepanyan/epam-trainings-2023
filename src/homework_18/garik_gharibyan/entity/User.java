package homework_18.garik_gharibyan.entity;

public final class User {

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

    public String getPassword() {
        return password;
    }

    public User(final String name, final String surname,
                final String email, final String password,
                final int age, final Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }

        User newUser = (User) obj;

        if (this.name != null && !this.name.equals(newUser.name)) {
            return false;
        }
        if (this.name == null && newUser.name != null) {
            return false;
        }
        if (this.surname != null && !this.surname.equals(newUser.surname)) {
            return false;
        }
        if (this.surname == null && newUser.surname != null) {
            return false;
        }
        if (this.password != null && !this.password.equals(newUser.password)) {
            return false;
        }
        if (this.password == null && newUser.password != null) {
            return false;
        }
        if (this.email != null && !this.email.equals(newUser.email)) {
            return false;
        }
        if (this.email == null && newUser.email != null) {
            return false;
        }
        if (this.address != null && !this.address.equals(newUser.address)) {
            return false;
        }
        if (this.address == null && newUser.address != null) {
            return false;
        }

        return this.age == newUser.age;
    }

    @Override
    public int hashCode() {
        int nameHashCode = name != null ? name.hashCode() : 0;
        int surnameHashCode = surname != null ? surname.hashCode() : 0;
        int emailHashCode = email != null ? email.hashCode() : 0;
        int passwordHashCode = password != null ? password.hashCode() : 0;
        int addressHashCode = address != null ? address.hashCode() : 0;

        return 31 * (nameHashCode + surnameHashCode +
                emailHashCode + passwordHashCode +
                age + addressHashCode);

    }

    @Override
    public String toString() {
        return "{name: " + name + ", surname: " + surname + ", age: " + age + "}";
    }
}
