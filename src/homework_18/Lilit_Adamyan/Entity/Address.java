package homework_18.Lilit_Adamyan.Entity;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        Address other = (Address) obj;
        if (this.street.equals(other.street)
                && this.city.equals(other.city)
                && this.country.equals(other.country)) {
        }
        return true;
    }

    @Override
    public int hashCode() {
        int k = 31;
        return k * this.street.hashCode()
                + k * this.city.hashCode()
                + k * this.country.hashCode();

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + country + '\'' +
                '}';
    }
}
