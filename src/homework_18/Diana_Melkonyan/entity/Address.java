package homework_18.Diana_Melkonyan.entity;

public class Address{
    private String address;
    private String street;

    public Address(String address, String street) {
        this.address = address;
        this.street = street;

    }
    public Address(String address) {
        this.address=address;
    }


    public String getAddress() {
        return address;
    }

    public String getStreet() {
        return street;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        Address address1 = (Address) o;
        return (this.address.equals(address1.address) && this.street.equals(address1.street));
    }

    public int hashCode() {

        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;

    }
    public String toString(){
        return "Adress + =" + address + " " +
                "street + = "+ street + " ";
    }
}
