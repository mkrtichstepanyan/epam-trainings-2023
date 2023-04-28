package homework_17.yeghia_ansuryan.address;

import java.util.Objects;

public class City implements Cloneable {
    private Home home;

    City(Home home) {
        this.home = home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Home getHome() {
        return home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return home.equals(city.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(home);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        City cityCloned = (City) super.clone();
        Home homeCloned = (Home) this.home.clone();
        cityCloned.setHome(homeCloned);
        return cityCloned;
    }
}
