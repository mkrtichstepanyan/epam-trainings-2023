package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Country implements Cloneable {
    private Province province;

    Country(Province province) {
        this.province = province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return province.equals(country.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(province);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Country countryCloned = (Country) super.clone();
        Province provinceCloned = (Province) this.province.clone();
        countryCloned.setProvince(provinceCloned);
        return countryCloned;
    }
}
