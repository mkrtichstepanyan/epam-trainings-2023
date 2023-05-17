package homework_18.TatevKocharyan.entity;

import java.util.Objects;

public class Address {
    String cityName;
    String street;
    String homeNumber;

    public Address(String cityName, String street, String homeNumber) {
        this.cityName = cityName;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(cityName, address.cityName) && Objects.equals(street, address.street) && Objects.equals(homeNumber, address.homeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, street, homeNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }
}
