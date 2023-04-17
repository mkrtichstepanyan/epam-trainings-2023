package homework_17.Lilit_Adamyan.deepClone;

public class VanadzorCity implements Cloneable{
    private LoriRegion loriRegion;

    public VanadzorCity(LoriRegion loriRegion) {
        this.loriRegion = loriRegion;
    }

    public LoriRegion getLoriRegion() {
        return loriRegion;
    }

    public void setLoriRegion(LoriRegion loriRegion) {
        this.loriRegion = loriRegion;
    }


    protected VanadzorCity deepClone() throws CloneNotSupportedException {
       VanadzorCity clone = (VanadzorCity) super.clone();
       clone.setLoriRegion(this.getLoriRegion().deepClone());
       return  clone;
    }
}
