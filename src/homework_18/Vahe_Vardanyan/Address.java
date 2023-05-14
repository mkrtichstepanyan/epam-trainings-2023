package homework_18.Vahe_Vardanyan;

public class Address {

    private String city;
    private String street;
    private int homeNumber;

    public Address(String city, String street, int homeNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(this.getClass().equals(obj.getClass()))) {
            return false;
        }
        Address otherAddress = (Address) obj;

        return this.homeNumber == otherAddress.homeNumber
                && (this.city != null && this.city.equals(otherAddress.city))
                && (this.street != null && this.street.equals(otherAddress.street));
    }

    public int hashCode() {
        int hashCode = (int) homeNumber;
        hashCode = hashCode * 31 + (this.city == null ? 0 : this.city.hashCode());
        hashCode = hashCode * 31 + (this.street == null ? 0 : this.street.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }
}
