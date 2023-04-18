package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Planet implements Cloneable {
    private Mainland mainland;

    Planet(Mainland mainland) {
        this.mainland = mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return mainland.equals(planet.mainland);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainland);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Planet planetCloned = (Planet) super.clone();
        Mainland mainlandCloned = (Mainland) this.mainland.clone();
        planetCloned.setMainland(mainlandCloned);
        return planetCloned;
    }
}
