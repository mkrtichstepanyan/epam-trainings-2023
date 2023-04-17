package homework_16.Radik_Manasyan.generic_dynamic_array.testClone;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private String street;
    private String country;

    public UserAddress(String street, String country) {
        this.street = street;
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
