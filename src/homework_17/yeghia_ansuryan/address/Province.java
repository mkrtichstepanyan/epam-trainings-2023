package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Province implements Cloneable {
    private City city;

    Province(City city) {
        this.city = city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Province province = (Province) o;
        return city.equals(province.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Province provinceCloned = (Province) super.clone();
        City cityCloned = (City) this.city.clone();
        provinceCloned.setCity(cityCloned);
        return provinceCloned;
    }
}
