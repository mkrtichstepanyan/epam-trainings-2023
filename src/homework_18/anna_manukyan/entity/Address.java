package homework_18.anna_manukyan.entity;

import homework_16.anna_manukyan.deep_copy.Country;

import java.util.Objects;

public class Address {
    private Country country;

    public Address(Country country) {
        this.country = country;
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
        Address address = (Address) o;
        return Objects.equals(country.getName(), address.country.getName()) && Objects.equals(country.getRegion(), address.country.getRegion());
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + 37 * country.getName().hashCode() + country.getRegion().hashCode();
        return result;
    }
}
