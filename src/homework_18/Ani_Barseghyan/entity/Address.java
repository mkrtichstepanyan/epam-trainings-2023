package homework_18.Ani_Barseghyan.entity;

import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !this.getClass().equals(o.getClass())) return false;

        Address otherAddress = (Address) o;
        return this.country.equals(otherAddress.country) &&
                this.city.equals((otherAddress.city)) &&
                this.street.equals(otherAddress.street);
    }

    @Override
    public int hashCode() {
        int k = 7;
        return k * this.country.hashCode() + k * this.city.hashCode() + k * this.street.hashCode();
    }

    @Override
    public String toString() {
        return "street= '" + street + '\'' +
                ", city= '" + city + '\'' +
                ", country= '" + country + '\'';
    }
}
