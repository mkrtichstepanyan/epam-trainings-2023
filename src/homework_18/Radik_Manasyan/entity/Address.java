package homework_18.Radik_Manasyan.entity;

public final class Address {
    private final String city;
    private final String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass().equals(obj.getClass())) {
            return false;
        }
        Address address = (Address) obj;
        return (this.city + this.street).equals(address.city + address.street);
    }

    public int hashCode() {
        return 31 * (city.hashCode() + street.hashCode());
    }

    public String toString() {
        return String.format("{address:[city=%s, street=%s]}", city, street);
    }
}
