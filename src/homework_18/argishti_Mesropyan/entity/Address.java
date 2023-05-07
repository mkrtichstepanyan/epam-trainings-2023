package homework_18.argishti_Mesropyan.entity;

import java.util.Objects;

public class Address {
    private final String country;
    private final String city;
    private final String street;
    private final int home;


    public Address(String country, String city, String street, int home) {
        this.country = Objects.requireNonNull(country);
        this.city = Objects.requireNonNull(city);
        this.street = Objects.requireNonNull(street);
        this.home = home;
    }


    public String getCountry() {
        return country;
    }


    public String getCity() {
        return city;
    }


    public String getStreet() {
        return street;
    }


    public int getHome() {
        return home;
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
