package homework_18.Radik_Manasyan.entity;

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
        this.address = address;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass().equals(o.getClass())) return false;

        User user = (User) o;
        return this.password.equals(user.password);
    }

    public int hashCode() {
        return 31 * (password.hashCode() + age);
    }

    public String toString() {
        String pass = "";
        for (int i = 0; i < password.trim().length(); i++) {
            if (password.charAt(i) != ' ') {
                pass += "*";
            }
        }
        String userData = String.format("{name=%s, surname=%s, email=%s, password=%s, age=%d address=%s",
                name, surname, email, pass, age, address);
        return userData;
    }
}
