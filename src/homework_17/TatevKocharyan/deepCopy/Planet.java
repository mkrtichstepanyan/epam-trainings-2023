package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class Planet implements Cloneable {
    String name;
    SolarSystem solarSystem;

    public Planet(String name, SolarSystem solarSystem) {
        this.name = name;
        this.solarSystem = solarSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name) && Objects.equals(solarSystem, planet.solarSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, solarSystem);
    }

    @Override
    public Planet clone() {
        try {
            Planet clone = (Planet) super.clone();
            clone.setSolarSystem(clone.getSolarSystem().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
