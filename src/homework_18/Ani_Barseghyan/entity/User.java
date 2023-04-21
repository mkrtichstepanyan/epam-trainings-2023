package homework_18.Ani_Barseghyan.entity;

final class User {
    private final String name;
    private final String surname;
    private final int age;
    private final Address address;

    public User(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
        if (o == null || !this.getClass().equals(o.getClass())) return false;

        User otherUser = (User) o;
        return (this.name.equals(otherUser.name) &&
                this.surname.equals(otherUser.surname) &&
                this.age == otherUser.age);
    }

    @Override
    public int hashCode() {
        int k = 13;
        return k * this.name.hashCode() + k * this.surname.hashCode() + k * this.age;
    }

    @Override
    public String toString() {
        return "User: " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", address: " + address;
    }
}
