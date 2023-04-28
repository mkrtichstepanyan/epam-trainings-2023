package homework_18.alina_mkhoyan.entity;

import java.util.Objects;

public class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Address)) {
            return false;
        }

        Address other = (Address) obj;

        return Objects.equals(street, other.street) &&
                Objects.equals(city, other.city) &&
                Objects.equals(state, other.state) &&
                Objects.equals(zipCode, other.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zipCode);
    }

}
