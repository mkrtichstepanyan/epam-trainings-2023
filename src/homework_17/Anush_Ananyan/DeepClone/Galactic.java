package homework_17.Anush_Ananyan.DeepClone;

public class Galactic implements Cloneable {
    private SunSystem system;

    public Galactic(SunSystem solarSystem) {
        this.system = solarSystem;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Galactic clonedGalactic = (Galactic) super.clone();
        SunSystem clonedSystem = (SunSystem) this.system.clone();
        clonedGalactic.setSystem(clonedSystem);
        return clonedGalactic;
    }

    public SunSystem getSystem() {
        return system;
    }

    public void setSystem(SunSystem solarSystem) {
        this.system = solarSystem;
    }
}
