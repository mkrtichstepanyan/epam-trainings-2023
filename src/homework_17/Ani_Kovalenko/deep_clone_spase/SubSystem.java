package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class SubSystem implements Cloneable {
    private Planet planet;

    SubSystem(Planet planet) {
        this.planet = planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubSystem subSystem = (SubSystem) o;
        return planet.equals(subSystem.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planet);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SubSystem subSystemCloned = (SubSystem) super.clone();
        Planet planetCloned = (Planet) this.planet.clone();
        subSystemCloned.setPlanet(planetCloned);
        return subSystemCloned;
    }
}
