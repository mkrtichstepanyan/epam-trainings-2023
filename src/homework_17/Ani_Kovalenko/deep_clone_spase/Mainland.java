package homework_17.Ani_Kovalenko.deep_clone_spase;

import java.util.Objects;

public class Mainland implements Cloneable {

    private Continent continent;

    Mainland(Continent continent) {
        this.continent = continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mainland mainland = (Mainland) o;
        return continent.equals(mainland.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mainland mainlandCloned = (Mainland) super.clone();
        Continent continentCloned = (Continent) this.continent.clone();
        mainlandCloned.setContinent(continentCloned);
        return mainlandCloned;
    }
}
