package homework_18.argishti_Mesropyan.entity;

import java.util.Objects;

public class Address {
    private String country;
    private String city;
    private String street;
    private int home;


    public Address(String country, String city, String street, int home) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.home = home;
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

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public Address() {
        super();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return home == address.home
                && country.equals(address.country)
                && city.equals(address.city)
                && street.equals(address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, street, home);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                '}';
    }
}
