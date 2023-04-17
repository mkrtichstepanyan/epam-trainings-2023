package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Mainland extends DynamicArray implements Cloneable {
    private String name;
    private Continent continent;

    public Mainland(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    public Mainland(Mainland mainland) {
        this.name = mainland.name;
        this.continent = mainland.continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Mainland) {
            Mainland clone = new Mainland((Mainland) object);
            clone.continent = (Continent) continent.clone(((Mainland) object).continent);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mainland{" +
                "name='" + name + '\'' +
                ", continent=" + continent +
                '}';
    }
}
