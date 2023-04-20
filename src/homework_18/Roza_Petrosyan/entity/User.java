package homework_18.Roza_Petrosyan.entity;

public final class User {
    private final String name;
    private final String surName;
    private final int age;
    private final Address address;

    public User(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        User obj = (User) o;
        return (this.name != null && this.name.equals(obj.name)) && (this.surName != null && this.surName.equals(obj.surName))
                && (this.age > 0 && this.age == obj.age) && (this.address != null && this.address.equals(obj.address));

    }

    @Override
    public int hashCode() {
        Object[] fields = {this.name,this.surName,this.age, this.address};
        int hash = 1;
        for (Object field : fields) {
            if(field instanceof Integer){
                hash = 31 * hash + (int) field;
            } else {
                hash = 31 * hash + (field == null ? 0 : field.hashCode());
            }
        }
        if (hash < 0) {
            hash *= -1;
        }
        return hash;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
