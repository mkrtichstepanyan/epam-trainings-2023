package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Galactic extends DynamicArray implements Cloneable {
    private String name;

    private Sys sys;

    public Galactic(String name, Sys sys) {
        this.name = name;
        this.sys = sys;
    }

    public Galactic(Galactic galactic) {
        this.name = galactic.name;
        this.sys = galactic.sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSystem() {
        return sys;
    }

    public void setSystem(Sys sys) {
        this.sys = sys;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Galactic) {
            Galactic clone = new Galactic((Galactic) object);
            clone.sys = (Sys) sys.clone(((Galactic) object).sys);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Galactic{" +
                "name='" + name + '\'' +
                ", system=" + sys +
                '}';
    }
}
