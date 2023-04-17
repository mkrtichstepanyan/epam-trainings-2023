package homework_17.Lilit_Adamyan.deepClone;

public class MilkyWayGalactic implements Cloneable{
    private Space space;

    public MilkyWayGalactic(Space space) {
        this.space = space;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }


    public MilkyWayGalactic deepClone() throws CloneNotSupportedException {
        MilkyWayGalactic clone = (MilkyWayGalactic) super.clone();
        clone.setSpace(this.getSpace().deepClone());
        return clone;
    }
}
