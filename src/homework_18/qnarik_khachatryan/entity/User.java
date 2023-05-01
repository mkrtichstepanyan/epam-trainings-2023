package homework_18.qnarik_khachatryan.entity;

public class User {

    private String name;
    private String surname;
    private int age;
    private Address address;

    public User(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //reflexive - an object must equal itself
            return true;
        }
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }

        User newUser = (User) obj;

        return this.name.equals(newUser.name) &&
                this.surname.equals(newUser.surname) &&
                this.age == newUser.age &&
                this.address.equals(newUser.address);
    }

    @Override
    public int hashCode() {
        int nameHash = this.name.hashCode();
        int addressHash = this.address.hashCode();

        return 7 * (nameHash + addressHash + this.age); //using prime number 7 to avoid duplicates
    }
}
