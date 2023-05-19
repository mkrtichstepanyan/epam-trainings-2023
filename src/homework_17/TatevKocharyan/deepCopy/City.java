package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class City implements Cloneable {
    String name;
    Province province;

    public City(String name, Province province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(province, city.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, province);
    }

    @Override
    public City clone() {
        try {
            City clone = (City) super.clone();
            clone.setProvince(clone.getProvince().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }
}
