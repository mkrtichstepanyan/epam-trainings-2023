package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Galactic implements Cloneable {
    private SunSystem sunSystem;

    Galactic(SunSystem sunSystem) {
        this.sunSystem = sunSystem;
    }

    public void setSunSystem(SunSystem sunSystem) {
        this.sunSystem = sunSystem;
    }

    public SunSystem getSunSystem() {
        return sunSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galactic galactic = (Galactic) o;
        return sunSystem.equals(galactic.sunSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sunSystem);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Galactic galacticCloned = (Galactic) super.clone();
        SunSystem sunSystemCloned = (SunSystem) this.sunSystem.clone();
        galacticCloned.setSunSystem(sunSystemCloned);
        return galacticCloned;
    }
}
