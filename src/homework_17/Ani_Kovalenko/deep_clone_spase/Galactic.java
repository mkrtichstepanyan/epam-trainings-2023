package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Galactic implements Cloneable {
    private SubSystem subSystem;

    Galactic(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    public void setSubSystem(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galactic galactic = (Galactic) o;
        return subSystem.equals(galactic.subSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subSystem);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Galactic galacticCloned = (Galactic) super.clone();
        SubSystem subSystemCloned = (SubSystem) this.subSystem.clone();
        galacticCloned.setSubSystem(subSystemCloned);
        return galacticCloned;
    }
}
