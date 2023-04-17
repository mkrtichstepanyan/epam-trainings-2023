package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Planet implements Cloneable {
    Mainland mainland;

    Planet(Mainland mainland) {
        this.mainland = mainland;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
