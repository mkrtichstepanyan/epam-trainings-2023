package homework_18.qnarik_khachatryan.entity;

public class Address {

    private String country;
    private String city;
    private String street;
    private int apartment;

    public Address(String country, String city, String street, int apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.apartment = apartment;
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

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //reflexive - an object must equal itself
            return true;
        }
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }

        Address newAddress = (Address) obj;

        return this.country.equals(newAddress.country) &&
                this.city.equals(newAddress.city) &&
                this.street.equals(newAddress.street) &&
                this.apartment == newAddress.apartment;
    }

    @Override
    public int hashCode() {
        int countryHash = this.country.hashCode();
        int cityHash = this.city.hashCode();
        int streetHash = this.street.hashCode();

        return 13 * (countryHash + cityHash + streetHash + this.apartment); //using prime number 13 to avoid duplicates
    }
}
