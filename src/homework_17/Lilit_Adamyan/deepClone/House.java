package homework_17.Lilit_Adamyan.deepClone;

import homework_7.garik_gharibyan.exceptions.NameException;

public class House {
    private NarekatsiStreet narekatsiStreet;

    public House(NarekatsiStreet narekatsiStreet) {
        this.narekatsiStreet = narekatsiStreet;
    }

    public NarekatsiStreet getNarekatsiStreet() {
        return narekatsiStreet;
    }

    public void setNarekatsiStreet(NarekatsiStreet narekatsiStreet) {
        this.narekatsiStreet = narekatsiStreet;
    }

    public House deepClone() throws CloneNotSupportedException {
        House clone = (House) super.clone();
        clone.setNarekatsiStreet(this.getNarekatsiStreet().deepClone());
        return clone;
    }



}
