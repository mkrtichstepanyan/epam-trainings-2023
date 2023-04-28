package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Continent implements Cloneable{
    String name;
    Mainland mainland;

    public Continent(String name, Mainland mainland) {
        this.name = name;
        this.mainland = mainland;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(name, continent.name) && Objects.equals(mainland, continent.mainland);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mainland);
    }

    @Override
    public Continent clone() {
        try {
            Continent clone = (Continent) super.clone();
            clone.setMainland(clone.getMainland().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
