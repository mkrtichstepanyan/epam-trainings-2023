package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Region implements Cloneable {
    Country country;

    Region(Country country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
