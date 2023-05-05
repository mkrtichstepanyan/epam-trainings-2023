package homework_18.Inesa_Mkrtchyan.entity;

public class Address {
    private String country;
    private String city;
    private String street;
    private int homeNumber;
    public Address(){}

    public Address(String country, String city, String street, int homeNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public int hashCode() {
        int r = country == null ? 0 : country.hashCode();
        r = 31 * r + (city == null ? 0 : city.hashCode());
        r = 31 * r + (street == null ? 0 : street.hashCode());
        r = 31 * r + homeNumber;
        return r;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Address)) return false;
        Address a = (Address) obj;
        return this.country.equals(a.country) &&
                this.city.equals(a.city) &&
                this.street.equals(a.street) &&
                this.homeNumber == a.homeNumber;

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

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }
}
