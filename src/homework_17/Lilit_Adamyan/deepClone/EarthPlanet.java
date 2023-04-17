package homework_17.Lilit_Adamyan.deepClone;

public class EarthPlanet implements Cloneable{
    private SolarSystem solarSystem;

    public EarthPlanet(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    public EarthPlanet deepClone() throws CloneNotSupportedException {
        EarthPlanet clone = (EarthPlanet) super.clone();
        clone.setSolarSystem(this.getSolarSystem().deepClone());
        return clone;
    }
}
