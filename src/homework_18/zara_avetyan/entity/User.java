package homework_18.zara_avetyan.entity;


import java.util.Objects;

public final class User {
    private final String name;
    private final String lastname;
    private final String email;
    private final Address address;
    private final int age;

    public User(String name, String surname, String email, Address address, int age) {
        this.name = name;
        this.lastname = surname;
        this.email = email;
        this.address = new Address(address.getStreet(), address.getCityOrVillage(), address.getCountry());
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof User){
            User user  = (User) o;
            return age == user.age
                    && Objects.equals(name, user.name)
                    && Objects.equals(lastname, user.lastname)
                    && Objects.equals(email, user.email)
                    && Objects.equals(address, user.address);
        }
        return false;

    }

    public int hashCode() {
        return Objects.hash(name, lastname, email, address, age);
    }
}
