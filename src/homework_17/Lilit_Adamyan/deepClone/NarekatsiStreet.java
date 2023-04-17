package homework_17.Lilit_Adamyan.deepClone;

import homework_11.Karen_Sargsyan.chapter_13.instance_of.C;
import homework_7.garik_gharibyan.exceptions.NameException;
import jdk.jshell.VarSnippet;

public class NarekatsiStreet implements Cloneable {
    private VanadzorCity vanadzorCity;

    public NarekatsiStreet(VanadzorCity vanadzorCity) {
        this.vanadzorCity = vanadzorCity;
    }

    public VanadzorCity getVanadzorCity() {
        return vanadzorCity;
    }

    public void setVanadzorCity(VanadzorCity vanadzorCity) {
        this.vanadzorCity = vanadzorCity;
    }

    protected NarekatsiStreet deepClone() throws CloneNotSupportedException {
        NarekatsiStreet clone = (NarekatsiStreet) super.clone();
        clone.setVanadzorCity(this.getVanadzorCity().deepClone());
        return clone;
    }
}
