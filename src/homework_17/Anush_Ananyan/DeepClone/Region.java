package homework_17.Anush_Ananyan.DeepClone;

public class Region implements Cloneable {
    private Country country;

    public Region(Country country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Region clonedRegion = (Region) super.clone();
        Country clonedCountry = (Country) this.country.clone();
        clonedRegion.setCountry(clonedCountry);
        return clonedRegion;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
