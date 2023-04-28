package homework_17.Lilit_Adamyan.deepClone;

public class ArmeniaCountry implements Cloneable{
    private CaucasusRegion caucasusRegion;

    public ArmeniaCountry(CaucasusRegion caucasusRegion) {
        this.caucasusRegion = caucasusRegion;
    }

    public CaucasusRegion getCaucasusRegion() {
        return caucasusRegion;
    }

    public void setCaucasusRegion(CaucasusRegion caucasusRegion) {
        this.caucasusRegion = caucasusRegion;
    }


    public ArmeniaCountry deepClone() throws CloneNotSupportedException {
       ArmeniaCountry clone = (ArmeniaCountry) super.clone();
       clone.setCaucasusRegion(this.getCaucasusRegion().deepClone());
       return clone;
    }
}
