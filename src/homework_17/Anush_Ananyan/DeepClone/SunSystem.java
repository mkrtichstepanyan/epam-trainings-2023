package homework_17.Anush_Ananyan.DeepClone;

public class SunSystem implements Cloneable {
    private Planet planet;

    public SunSystem(Planet planet) {
        this.planet = planet;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        SunSystem clonedSystem = (SunSystem) super.clone();
        Planet clonedPlanet = (Planet) this.planet.clone();
        clonedSystem.setPlanet(clonedPlanet);
        return clonedSystem;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
