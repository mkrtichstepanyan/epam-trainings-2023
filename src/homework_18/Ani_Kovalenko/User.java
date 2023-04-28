package homework_18.Ani_Kovalenko;

public final class User {

    private final Address address;
    private final String name;
    private final String email;
    private final String password;
    private final Integer age;

    User(Address address, String name, String email, String password, int age) {
        this.address = address;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public boolean equals(Object objectToCheck) {
        if (this == objectToCheck) {
            return true;
        }
        if (objectToCheck instanceof User userToCheck) {
            if (this.name == null || userToCheck.name == null ||
                    this.email == null || userToCheck.email == null ||
                    this.password == null || userToCheck.password == null) {
                return false;
            }
            return this.address.equals((userToCheck).address) &&
                    this.name.equals(userToCheck.name) && this.email.equals(userToCheck.email) &&
                    this.password.equals(userToCheck.password) && this.age.equals(userToCheck.age);
        }
        return false;
    }

    public int hashCode() {
        int result = 0;
        result = 31 * result + address.hashCode();
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (email == null ? 0 : email.hashCode());
        result = 31 * result + (age == null ? 0 : age);
        return result;
    }
}
