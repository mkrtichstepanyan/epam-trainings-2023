package homework_17.Lilit_Adamyan.deepClone;

public class CaucasusRegion implements Cloneable{
    private AsiaContinent asiaContinent;

    public CaucasusRegion(AsiaContinent asiaContinent) {
        this.asiaContinent = asiaContinent;
    }

    public AsiaContinent getAsiaContinent() {
        return asiaContinent;
    }

    public void setAsiaContinent(AsiaContinent asiaContinent) {
        this.asiaContinent = asiaContinent;
    }


    public CaucasusRegion deepClone() throws CloneNotSupportedException {
        CaucasusRegion clone = (CaucasusRegion) super.clone();
        clone.setAsiaContinent(this.getAsiaContinent().deepClone());
        return clone;
    }
}
