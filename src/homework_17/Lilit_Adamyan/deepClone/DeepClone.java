package homework_17.Lilit_Adamyan.deepClone;

public class DeepClone {
    public static void main(String[] args) {

        Space space = new Space("Milky Way");
        MilkyWayGalactic galactic = new MilkyWayGalactic(space);
        SolarSystem system = new SolarSystem(galactic);
        EarthPlanet planet = new EarthPlanet(system);
        EurasiaMainland mainland = new EurasiaMainland(planet);
        AsiaContinent continent = new AsiaContinent(mainland);
        CaucasusRegion region = new CaucasusRegion(continent);
        ArmeniaCountry country = new ArmeniaCountry(region);
        LoriRegion loriRegion = new LoriRegion(country);
        VanadzorCity vanadzorCity = new VanadzorCity(loriRegion);
        NarekatsiStreet street = new NarekatsiStreet(vanadzorCity);
        House house = new House(street);


        try {
            House clonedHouse = house.deepClone();
            System.out.println(house.equals(clonedHouse));
            System.out.println(house.getNarekatsiStreet() == clonedHouse.getNarekatsiStreet());
            System.out.println(house.getNarekatsiStreet().getVanadzorCity() == clonedHouse.getNarekatsiStreet().getVanadzorCity());
            System.out.println(house.getNarekatsiStreet().getVanadzorCity().getLoriRegion() == clonedHouse.getNarekatsiStreet().getVanadzorCity().getLoriRegion());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
