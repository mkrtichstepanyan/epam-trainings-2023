package homework_18.Anush_Ananyan.entity;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int homeNumber;

    public Address(String city, String street, int homeNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Address) {
            Address test = (Address) obj;
            if (Objects.equals(this.city, test.city)
                    && Objects.equals(this.street, test.street)
                    && Objects.equals(this.homeNumber, test.homeNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 7;
        h = 31 * h + Objects.hashCode(this.city) +
                Objects.hashCode(this.street) +
                this.homeNumber;
        return h;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
    public int getHomeNumber() {
        return homeNumber;
    }
}
