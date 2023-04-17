package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Country extends DynamicArray implements Cloneable {
    private String name;

    private Region region;

    public Country(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public Country(Country country) {
        this.name = country.name;
        this.region = country.region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Country) {
            Country clone = new Country((Country) object);
            clone.region = (Region) region.clone(((Country) object).region);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", region=" + region +
                '}';
    }
}
