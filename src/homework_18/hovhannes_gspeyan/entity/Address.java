package homework_18.hovhannes_gspeyan.entity;

import java.util.Objects;

public class Address {
    private String country;
    private String city;
    private String street;
    private int apartmentNumber;

    public Address(String country, String city, String street, int apartmentNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
    }

    public Address() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return apartmentNumber == address.apartmentNumber
                && Objects.equals(country, address.country)
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        int hashCode = this.apartmentNumber;
        hashCode = hashCode * 31 + (this.country == null ? 0 : this.country.hashCode());
        hashCode = hashCode * 31 + (this.city == null ? 0 : this.city.hashCode());
        hashCode = hashCode * 31 + (this.street == null ? 0 : this.city.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
