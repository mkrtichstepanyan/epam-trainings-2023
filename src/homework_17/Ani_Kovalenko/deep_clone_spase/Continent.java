package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Continent implements Cloneable {
    Region region;

    Continent(Region region) {
        this.region = region;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
