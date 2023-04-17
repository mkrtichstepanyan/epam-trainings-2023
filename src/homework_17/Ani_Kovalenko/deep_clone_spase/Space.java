package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Space implements Cloneable {

    Galactic galactic;

    Space(Galactic galactic) {
        this.galactic = galactic;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
