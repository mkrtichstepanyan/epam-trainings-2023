package homework_18.aram_mehrabyan.Entity;

public final class User {
    private final String name;
    private final String surname;
    private final String email;
    private final Address address;
    private final  int age;

    public User(final String name,final String surname,
                final String email,final int age,final Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
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

        User otherUser = (User) obj;

        return this.name.equals(otherUser.name) &&
                this.surname.equals(otherUser.surname) &&
                this.email.equals(otherUser.email) &&
                this.age == otherUser.age &&
                this.address.equals(otherUser.address);
    }
    @Override
    public int hashCode() {
        return 31 * (name.hashCode() + surname.hashCode() +
                email.hashCode() +
                age + address.hashCode());
    }
}
