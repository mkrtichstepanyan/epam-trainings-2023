package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Planet extends DynamicArray implements Cloneable {
    private String name;

    private Mainland mainland;

    public Planet(String name, Mainland mainland) {
        this.name = name;
        this.mainland = mainland;
    }

    public Planet(Planet planet) {
        this.name = planet.name;
        this.mainland = planet.mainland;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Planet) {
            Planet clone = new Planet((Planet) object);
            clone.mainland = (Mainland) mainland.clone(((Planet) object).mainland);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mainland=" + mainland +
                '}';
    }
}
