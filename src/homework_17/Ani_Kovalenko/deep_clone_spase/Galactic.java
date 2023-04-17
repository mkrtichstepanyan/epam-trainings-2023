package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Galactic implements Cloneable {
    SubSystem subSystem;

    Galactic(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
