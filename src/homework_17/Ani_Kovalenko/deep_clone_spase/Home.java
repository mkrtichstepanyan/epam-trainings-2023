package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Home implements Cloneable {
    String street;
    int apartment;

    Home(String street, int apartment) {
        this.street = street;
        this.apartment = apartment;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
