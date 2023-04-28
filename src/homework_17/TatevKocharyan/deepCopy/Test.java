package homework_17.TatevKocharyan.deepCopy;

public class Test {
    public static void main(String[] args) {
        Space space = new Space("Space");
        MilkyWayGalactic milkyWayGalactic = new MilkyWayGalactic("MilkyWay galactic", space);
        SolarSystem solarSystem = new SolarSystem("Solar System", milkyWayGalactic);
        Planet planet = new Planet(" Earth planet", solarSystem);
        Mainland mainland = new Mainland("Eurasia mainland", planet);
        Continent continent = new Continent("Asia continent", mainland);
        Region region = new Region("Caucasian region", continent);
        Country country = new Country("Armenia Country", region);
        Province province = new Province("Shirak Region", country);
        City city = new City("Gyumri City", province);
        Street street = new Street("Garegin Njdeh Street", city);
        House house = new House("house number 1", street);
        House clone = house.clone();


       // clone.setHouseNumber("2");
        System.out.println(clone.getStreet());
        System.out.println(house.getStreet());
    }
}
