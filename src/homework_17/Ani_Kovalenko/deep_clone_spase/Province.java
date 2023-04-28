package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Province implements Cloneable {

    private City city;

    Province(City city) {
        this.city = city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Province{" +
                "city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object objectToCheck) {
        if (this == objectToCheck) {
            return true;
        }
        if (objectToCheck == null || getClass() != objectToCheck.getClass()) {
            return false;
        }
        return this.city.equals(((Province) objectToCheck).city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        City cityCloned = (City) this.city.clone();
        Province provinceCloned = (Province) super.clone();
        provinceCloned.setCity(cityCloned);
        return provinceCloned;
    }

}
