package homework_17.Lilit_Adamyan.deepClone;
//Ստեղծել Ձեր անբողջական հասցեն ցույց տվող շղթայական կլասսներ
//Class-ների Օրինակ -» Space -> MilkyWay galactic-> Solar System -> Earth planet -> Eurasia mainland -> Asia continent ->
// Caucasus region -> Armenia Country -> Shirak Region -> Gyumri City -> Garegin Njdeh Street -> Apartment
public class Space implements Cloneable {
    private String name;

    public Space(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Space deepClone() throws CloneNotSupportedException {
        Space clone = (Space) super.clone();
        clone.setName(this.getName());
        return clone;
    }



}
