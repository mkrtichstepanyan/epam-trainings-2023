package homework_18.Vladimir_Vanyan.entity;

public class Address {
    private String address;
    private String street;

    public Address(String address, String street) {
        this.address = address;
        this.street = street;
    }

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String value) {
        address = value;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        Address address2 = (Address) obj;
        return (this.address.equals(address2.address) && this.street.equals(address2.street));
    }

    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Adress" + address + " " + "Street" + street;
    }
}
