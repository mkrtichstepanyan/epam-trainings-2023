package homework_18.gohar_hakobyan.entity;

public final class User {

    private String name;
    private String surname;
    private String email;
    private String password;
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
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        if (this == o) {
            return true;
        }

        User otherUser = (User) o;
        return this.name.equals(otherUser.name) &&
                this.surname.equals(otherUser.surname) &&
                this.password.equals(otherUser.password) &&
                this.email.equals(otherUser.email) &&
                this.age == otherUser.age &&
                this.address.equals(otherUser.address);
    }


    @Override
    public int hashCode() {
        int result = 17;
        return result * (this.name.hashCode() * this.surname.hashCode()
                * this.email.hashCode() * this.password.hashCode()
                * this.age * this.address.hashCode());
    }

}
