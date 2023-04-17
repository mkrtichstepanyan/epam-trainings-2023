package homework_17.Ani_Kovalenko.deep_clone_spase;

public class City implements Cloneable {
    Home home;

    City(Home home) {
        this.home = home;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
