package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Home implements Cloneable {
    private String street;
    private int homeNumber;

    Home(String street, int homeNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return homeNumber == home.homeNumber && street.equals(home.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, homeNumber);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Home homeCloned = (Home) super.clone();
        homeCloned.setHomeNumber(homeCloned.homeNumber);
        homeCloned.setStreet(homeCloned.street);
        return homeCloned;
    }
}
