package homework_17.Ani_Kovalenko.deep_clone_spase;

public class SubSystem implements Cloneable {
    Planet planet;

    SubSystem(Planet planet) {
        this.planet = planet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
