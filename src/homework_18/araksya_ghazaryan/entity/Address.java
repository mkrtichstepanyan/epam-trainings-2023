package homework_18.araksya_ghazaryan.entity;

import java.util.Objects;

public  class Address {
    private String country;
    private String city;
    private int homeNumber;

    public Address(String country, String city, int homeNumber) {
        this.country = country;
        this.city = city;
        this.homeNumber = homeNumber;
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

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || !this.getClass().equals(o.getClass())) return false;
        Address address = (Address) o;
        return country == address.country &&
                Objects.equals(city, address.city) &&
                Objects.equals(homeNumber, address.homeNumber);
    }
    @Override
    public int hashCode() {
        int hashCode = this.homeNumber;
        hashCode = hashCode * 31 + (this.country == null ? 0 : this.country.hashCode());
        hashCode = hashCode * 31 + (this.city == null ? 0 : this.city.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }
}
