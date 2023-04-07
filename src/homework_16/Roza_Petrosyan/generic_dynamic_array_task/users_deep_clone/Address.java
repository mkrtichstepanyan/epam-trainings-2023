package homework_16.Roza_Petrosyan.generic_dynamic_array_task.users_deep_clone;

public class Address implements Cloneable{
    private String country;
    private String street;
    private String homeNumber;

    public Address(String country, String street, String homeNumber) {
        this.country = country;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address(this.street, this.getHomeNumber(), this.getCountry());
        }
    }
}
