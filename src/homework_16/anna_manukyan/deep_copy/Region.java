package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

import java.util.Objects;

public class Region extends DynamicArray implements Cloneable {
    private String name;

    private City city;

    public Region(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Region(Region region) {
        this.name = region.name;
        this.city = region.city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Region) {
            Region clone = new Region((Region) object);
            clone.city = (City) city.clone(((Region) object).city);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) && Objects.equals(city, region.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
