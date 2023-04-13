package homework_17.Roza_Petrosyan.generic_linked_list.deep_clone_with_serialization;

import java.io.*;

public class Space implements Cloneable, Serializable {
    private String galactic;
    private String system;
    private String planet;
    private String mainland;
    private String continent;
    private Address address;

    public Space(String galactic, String system, String planet, String mainland, String continent, Address address) {
        this.galactic = galactic;
        this.system = system;
        this.planet = planet;
        this.mainland = mainland;
        this.continent = continent;
        this.address = address;
    }

    public String getGalactic() {
        return galactic;
    }

    public String getSystem() {
        return system;
    }

    public String getPlanet() {
        return planet;
    }

    public String getMainland() {
        return mainland;
    }

    public String getContinent() {
        return continent;
    }

    public Address getAddress() {
        return address;
    }

    public void setGalactic(String galactic) {
        this.galactic = galactic;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setMainland(String mainland) {
        this.mainland = mainland;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Space{" +
                "galactic='" + galactic + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                ", mainland='" + mainland + '\'' +
                ", continent='" + continent + '\'' +
                ", address=" + address +
                '}';
    }

    public Space deepClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Space) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            return null;
        }
    }

}
