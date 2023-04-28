package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Region implements Cloneable {
    private Country country;

    Region(Country country) {
        this.country = country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return country.equals(region.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Region regionCloned = (Region) super.clone();
        Country countryCloned = (Country) this.country.clone();
        regionCloned.setCountry(countryCloned);
        return regionCloned;
    }
}
