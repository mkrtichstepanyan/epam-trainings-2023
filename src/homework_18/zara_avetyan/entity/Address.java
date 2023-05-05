package homework_18.zara_avetyan.entity;

public class Address {
    private String country;
    private String cityOrVillage;
    private String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.cityOrVillage = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCityOrVillage() {
        return cityOrVillage;
    }

    public String getStreet() {
        return street;
    }
}
