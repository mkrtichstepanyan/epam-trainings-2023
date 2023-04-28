package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class SunSystem implements Cloneable{
    private Planet planet;

    SunSystem(Planet planet) {
        this.planet = planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Planet getPlanet() {
        return planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SunSystem sunSystem = (SunSystem) o;
        return planet.equals(sunSystem.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planet);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SunSystem sunSystemCloned = (SunSystem) super.clone();
        Planet planetCloned = (Planet) this.planet.clone();
        sunSystemCloned.setPlanet(planetCloned);
        return sunSystemCloned;
    }
}
