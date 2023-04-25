package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class Universe implements Cloneable {

    private Galactic galactic;

    Universe(Galactic galactic) {
        this.galactic = galactic;
    }

    public void setGalactic(Galactic galactic) {
        this.galactic = galactic;
    }

    public Galactic getGalactic() {
        return galactic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universe universe = (Universe) o;
        return galactic.equals(universe.galactic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(galactic);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Universe universeCloned = (Universe) super.clone();
        Galactic galacticCloned = (Galactic) this.galactic.clone();
        universeCloned.setGalactic(galacticCloned);
        return universeCloned;
    }
}
