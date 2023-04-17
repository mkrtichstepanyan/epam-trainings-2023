package homework_17.Lilit_Adamyan.deepClone;

public class LoriRegion implements Cloneable{
    private ArmeniaCountry armeniaCountry;

    public LoriRegion(ArmeniaCountry armeniaCountry) {
        this.armeniaCountry = armeniaCountry;
    }

    public ArmeniaCountry getArmeniaCountry() {
        return armeniaCountry;
    }

    public void setArmeniaCountry(ArmeniaCountry armeniaCountry) {
        this.armeniaCountry = armeniaCountry;
    }


    protected LoriRegion deepClone() throws CloneNotSupportedException {
       LoriRegion clone = (LoriRegion) super.clone();
       clone.setArmeniaCountry(this.getArmeniaCountry().deepClone());
       return clone;
    }
}
