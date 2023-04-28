package homework_18.Varsik_Pijoyan.entity;

public class Address {
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return this.country.equals(address.country) && this.city.equals(address.city);
    }

    @Override
    public int hashCode() {
        int result = 17;
        return result * (this.country.hashCode() * this.city.hashCode());
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

    @Override
    public String toString() {
        return country + ", " + city;
    }
}
