package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Province implements Cloneable {

    City city;

    Province(City city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
