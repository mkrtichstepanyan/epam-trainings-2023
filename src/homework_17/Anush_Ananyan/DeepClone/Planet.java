package homework_17.Anush_Ananyan.DeepClone;

public class Planet implements Cloneable {
    private Mainland mainland;

    public Planet(Mainland mainland) {
        this.mainland = mainland;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Planet clonedPlanet = (Planet) super.clone();
        Mainland clonedMain = (Mainland) this.mainland.clone();
        clonedPlanet.setMainland(clonedMain);
        return clonedPlanet;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }
}
