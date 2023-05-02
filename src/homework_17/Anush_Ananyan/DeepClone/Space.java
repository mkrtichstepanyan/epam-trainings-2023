package homework_17.Anush_Ananyan.DeepClone;

/*
Ստեղծել Ձեր անբողջական հասցեն ցույց տվող շղթայական կլասսներ
Class-ների Օրինակ -» Space -> MilkyWay galactic-> Solar System ->
 Earth planet -> Eurasia mainland -> Asia continent ->
  Caucasus region -> Armenia Country -> Shirak Region ->
  Gyumri City -> Garegin Njdeh Street -> Apartment
 */

public class Space implements Cloneable {
    private Galactic galactic;

    public Space(Galactic galactic) {
        this.galactic = galactic;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Space clonedSpace = (Space) super.clone();
        Galactic clonedGalactic = (Galactic) this.galactic.clone();
        clonedSpace.setGalactic(clonedGalactic);
        return clonedSpace;
    }

    public Galactic getGalactic() {
        return galactic;
    }

    public void setGalactic(Galactic galactic) {
        this.galactic = galactic;
    }
}
