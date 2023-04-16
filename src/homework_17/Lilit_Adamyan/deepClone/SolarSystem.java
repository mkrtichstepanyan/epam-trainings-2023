package homework_17.Lilit_Adamyan.deepClone;

public class SolarSystem implements Cloneable{
    private MilkyWayGalactic milkyWayGalactic;

    public SolarSystem(MilkyWayGalactic milkyWayGalactic) {
        this.milkyWayGalactic = milkyWayGalactic;
    }

    public MilkyWayGalactic getMilkyWayGalactic() {
        return milkyWayGalactic;
    }

    public void setMilkyWayGalactic(MilkyWayGalactic milkyWayGalactic) {
        this.milkyWayGalactic = milkyWayGalactic;
    }

    public SolarSystem deepClone() throws CloneNotSupportedException {
        SolarSystem clone = (SolarSystem) super.clone();
        clone.setMilkyWayGalactic(this.getMilkyWayGalactic().deepClone());
        return clone;
    }
}
