package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Sys extends DynamicArray implements Cloneable {
    private String name;

    private Planet planet;

    public Sys(String name, Planet planet) {
        this.name = name;
        this.planet = planet;
    }

    public Sys(Sys sys) {
        this.name = sys.name;
        this.planet = sys.planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Sys) {
            Sys clone = new Sys((Sys) object);
            clone.planet = (Planet) planet.clone(((Sys) object).planet);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "System{" +
                "name='" + name + '\'' +
                ", planet=" + planet +
                '}';
    }
}
