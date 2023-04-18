package homework_18.Diana_Melkonyan.entity;

public final class User {
    private final String name;
    private final String surname;
    private final int age;
    private Address adress;


    public User(String name, String surname, int age, Address adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
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

    public Address getAdress() {
        return adress;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        User user = (User) o;
        if (this.name.equals(user.name) && (this.surname.equals(user.surname))
                && this.age == age) ;
        return true;
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);

        return result;
    }
    public String toString(){
        return "name  = " + name + " " +
                "surname = " + surname + " " +
                "age = " + age + " " +
                "adress =" + adress + " ";


    }
}
