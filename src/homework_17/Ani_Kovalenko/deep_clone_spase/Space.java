package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Space implements Cloneable {

    private Galactic galactic;

    Space(Galactic galactic) {
        this.galactic = galactic;
    }

    public void setGalactic(Galactic galactic) {
        this.galactic = galactic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return galactic.equals(space.galactic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(galactic);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Space spaceCloned = (Space) super.clone();
        Galactic galacticCloned = (Galactic) this.galactic.clone();
        spaceCloned.setGalactic(galacticCloned);
        return spaceCloned;
    }
}
