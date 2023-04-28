package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Street implements Cloneable {
    String StreetName;
    City city;

    public Street(String streetName, City city) {
        StreetName = streetName;
        this.city = city;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(StreetName, street.StreetName) && Objects.equals(city, street.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StreetName, city);
    }

    @Override
    public Street clone() {
        try {
            Street clone = (Street) super.clone();
           clone.setCity(clone.getCity().clone());
           return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
