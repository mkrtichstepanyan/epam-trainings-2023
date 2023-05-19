package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Continent implements Cloneable {
    private Region region;

    Continent(Region region) {
        this.region = region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return region.equals(continent.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Continent continentCloned = (Continent) super.clone();
        Region regionCloned = (Region) this.region.clone();
        continentCloned.setRegion(regionCloned);
        return continentCloned;
    }
}
