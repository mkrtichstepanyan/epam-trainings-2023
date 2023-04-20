package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Home implements Cloneable {
    private String street;
    private int apartment;

    Home(String street, int apartment) {
        this.street = street;
        this.apartment = apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                ", apartment=" + apartment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return apartment == home.apartment && street.equals(home.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, apartment);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Home homeCloned = (Home) super.clone();
        homeCloned.setApartment(homeCloned.apartment);
        homeCloned.setStreet(homeCloned.street);
        return homeCloned;
    }
}
