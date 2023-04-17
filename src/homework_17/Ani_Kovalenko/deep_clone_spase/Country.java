package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Country implements Cloneable {

    Province province;

    Country(Province province) {
        this.province = province;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
