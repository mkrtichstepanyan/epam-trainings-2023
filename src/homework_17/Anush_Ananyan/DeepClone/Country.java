package homework_17.Anush_Ananyan.DeepClone;

public class Country implements Cloneable {
    private Province province;

    public Country(Province province) {
        this.province = province;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Country clonedCountry = (Country) super.clone();
        Province clonedProv = (Province) this.province.clone();
        clonedCountry.setProvince(clonedProv);
        return clonedCountry;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

}
