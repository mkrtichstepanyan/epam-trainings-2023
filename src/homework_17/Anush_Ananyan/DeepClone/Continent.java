package homework_17.Anush_Ananyan.DeepClone;

public class Continent implements Cloneable {
    private Region region;

    public Continent(Region region) {
        this.region = region;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Continent clonedCont = (Continent) super.clone();
        Region clonedRegion = (Region) this.region.clone();
        clonedCont.setRegion(clonedRegion);
        return clonedCont;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

}
