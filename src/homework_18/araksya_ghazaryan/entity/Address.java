package homework_18.araksya_ghazaryan.entity;

public  class Address {
    private String country;
    private String city;
    private String homeNumber;


    public Address(String country, String city, String homeNumber) {
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

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
    
}
