package homework_17.TatevKocharyan.deepCopy;

import java.util.Objects;

public class SolarSystem implements Cloneable {
    String name;
    MilkyWayGalactic milkyWayGalactic;

    public SolarSystem(String name, MilkyWayGalactic milkyWayGalactic) {
        this.name = name;
        this.milkyWayGalactic = milkyWayGalactic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MilkyWayGalactic getMilkyWayGalactic() {
        return milkyWayGalactic;
    }

    public void setMilkyWayGalactic(MilkyWayGalactic milkyWayGalactic) {
        this.milkyWayGalactic = milkyWayGalactic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolarSystem that = (SolarSystem) o;
        return Objects.equals(name, that.name) && Objects.equals(milkyWayGalactic, that.milkyWayGalactic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, milkyWayGalactic);
    }

    @Override
    public SolarSystem clone() {
        try {
            SolarSystem clone = (SolarSystem) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
