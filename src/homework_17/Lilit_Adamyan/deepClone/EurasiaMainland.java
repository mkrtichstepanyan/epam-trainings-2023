package homework_17.Lilit_Adamyan.deepClone;

public class EurasiaMainland implements Cloneable{
    private EarthPlanet earthPlanet;

    public EurasiaMainland(EarthPlanet earthPlanet) {
        this.earthPlanet = earthPlanet;
    }

    public EarthPlanet getEarthPlanet() {
        return earthPlanet;
    }

    public void setEarthPlanet(EarthPlanet earthPlanet) {
        this.earthPlanet = earthPlanet;
    }


    protected EurasiaMainland deepClone() throws CloneNotSupportedException {
        EurasiaMainland clone = (EurasiaMainland) super.clone();
        clone.setEarthPlanet(this.getEarthPlanet().deepClone());
        return clone;
    }
}
