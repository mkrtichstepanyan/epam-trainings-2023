package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

import java.util.Objects;

public class City extends DynamicArray implements Cloneable {
    private String name;

    private Street street;

    public City(City city) {
        this.name = city.name;
        this.street = city.street;
    }
    public City(String name, Street street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Object clone(Object object) {
        if (object instanceof City) {
            City clone = new City((City) object);
            clone.street = (Street) street.clone(((City) object).street);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", street=" + street +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(street, city.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, street);
    }
}
