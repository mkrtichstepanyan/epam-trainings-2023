package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Mainland implements Cloneable {

    Continent continent;

    Mainland(Continent continent) {
        this.continent = continent;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
