package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

import java.util.Objects;

public class Continent extends DynamicArray implements Cloneable {
    private String name;

    private Country country;

    public Continent(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public Continent(Continent continent) {
        this.name = continent.name;
        this.country = continent.country;
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
    public Object clone(Object object) {
        if (object instanceof Continent) {
            Continent clone = new Continent((Continent) object);
            clone.country = (Country) country.clone(((Continent) object).country);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(name, continent.name) && Objects.equals(country, continent.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
