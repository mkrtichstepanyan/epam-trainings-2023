package homework_17.Anush_Ananyan.DeepClone;

public class Province implements Cloneable {
    private City city;

    public Province(City city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Province clonedProv = (Province) super.clone();
        City clonedCity = (City) this.city.clone();
        clonedProv.setCity(clonedCity);
        return clonedProv;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
