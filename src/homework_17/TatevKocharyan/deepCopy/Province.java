package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Province implements Cloneable {
    String name;
    Country country;

    public Province(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Province province = (Province) o;
        return Objects.equals(name, province.name) && Objects.equals(country, province.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public Province clone() {
        try {
            Province clone = (Province) super.clone();
            clone.setCountry(clone.getCountry().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
