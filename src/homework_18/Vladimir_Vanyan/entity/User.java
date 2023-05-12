package homework_18.Vladimir_Vanyan.entity;

public class User {
    private String name;
    private String surname;
    private int age;
    private Address adress;

    public User(String name, String surname, int age, Address adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = new Address(adress.getAddress(), adress.getStreet());
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
        return new Address(adress.getAddress(), adress.getStreet());
    }

    public boolean equals(Object obj) {
        if (this == (User) obj) {
            return true;
        }
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        User user = (User) obj;
        if (this.name.equals(user.name) && (this.surname.equals(user.surname))
                && this.age == age && this.adress.equals(user.adress)) ;
        {
            return true;
        }
    }

    public int getHashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
    public String toString(){
        return "name "+name+" "+
                "surname "+surname+" "+
                "age "+age+" "+
                "adress "+adress+" ";
    }
}