package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class House implements Cloneable {
    String houseNumber;
    Street street;

    public House(String houseNumber, Street street) {
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(houseNumber, house.houseNumber) && Objects.equals(street, house.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, street);
    }

    @Override
    public House clone() {
        try {
            House clone = (House) super.clone();
            clone.setStreet(clone.getStreet().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
