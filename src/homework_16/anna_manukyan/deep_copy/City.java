package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

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
}
