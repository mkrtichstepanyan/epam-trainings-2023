package homework_17.Anush_Ananyan.DeepClone;

public class Mainland implements Cloneable {
    private Continent continent;

    public Mainland(Continent continent) {
        this.continent = continent;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mainland clonedMain = (Mainland) super.clone();
        Continent clonedCont = (Continent) this.continent.clone();
        clonedMain.setContinent(clonedCont);
        return clonedMain;
    }
    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}