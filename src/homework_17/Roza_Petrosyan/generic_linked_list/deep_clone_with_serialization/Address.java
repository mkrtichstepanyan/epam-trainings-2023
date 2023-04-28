package homework_17.Roza_Petrosyan.generic_linked_list.deep_clone_with_serialization;

import java.io.Serializable;

public class Address implements Serializable {
    private String region;
    private String country;
    private String regionName;
    private String city;
    private String street;
    private int apartmentNumber;

    public Address(String region, String country, String regionName, String city, String street, int apartmentNumber) {
        this.region = region;
        this.country = country;
        this.regionName = regionName;
        this.city = city;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
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

    @Override
    public String toString() {
        return "Address{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", regionName='" + regionName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}
