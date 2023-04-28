package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Country implements Cloneable{
    String name;
    Region region;

    public Country(String name, Region region) {
        this.name = name;
        this.region = region;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(region, country.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region);
    }

    @Override
    public Country clone() {
        try {
            Country clone = (Country) super.clone();
           clone.setRegion(clone.getRegion().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
