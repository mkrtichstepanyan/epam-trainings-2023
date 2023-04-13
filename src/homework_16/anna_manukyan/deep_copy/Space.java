package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Space extends DynamicArray implements Cloneable {
    private String name;
    private Galactic galactic;

    public Space(String name, Galactic galactic) {
        this.name = name;
        this.galactic = galactic;
    }

    public Space(Space space) {
        this.name = space.name;
        this.galactic = space.galactic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Galactic getGalactic() {
        return galactic;
    }

    public void setGalactic(Galactic galactic) {
        this.galactic = galactic;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Space) {
            Space clone = new Space((Space) object);
            clone.galactic = (Galactic) galactic.clone(((Space) object).galactic);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Space{" +
                "name='" + name + '\'' +
                ", galactic=" + galactic +
                '}';
    }
}
