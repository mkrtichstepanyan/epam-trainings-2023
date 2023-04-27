package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Mainland implements Cloneable{
    String name;
    Planet planet;

    public Mainland(String name, Planet planet) {
        this.name = name;
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mainland mainland = (Mainland) o;
        return Objects.equals(name, mainland.name) && Objects.equals(planet, mainland.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet);
    }

    @Override
    public Mainland clone() {
        try {
            Mainland clone = (Mainland) super.clone();
            clone.setPlanet(clone.getPlanet().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
