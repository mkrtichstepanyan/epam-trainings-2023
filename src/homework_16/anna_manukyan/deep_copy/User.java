package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class User extends DynamicArray implements Cloneable {
    private String name;
    private String surname;
    private String phoneNumber;
    private Address address;

    public User(String name, String surname, String phoneNumber, Address address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(User user) {
        this.name = user.name;
        this.surname = user.surname;
        this.phoneNumber = user.phoneNumber;
        this.address = user.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof User) {
            User clone = new User((User) object);
            clone.address = (Address) address.clone(((User) object).address);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
