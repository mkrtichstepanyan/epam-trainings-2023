package homework_17.Anush_Ananyan.DeepClone;

public class City implements Cloneable {

    private Apartment apartment;

    public City(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        City clonedCity = (City) super.clone();
        Apartment clonedAp = (Apartment) this.apartment.clone();
        clonedCity.setApartment(clonedAp);
        return clonedCity;
    }


    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
