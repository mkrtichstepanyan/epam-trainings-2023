package homework_17.yeghia_ansuryan.address;

public class Test {
    public static void main(String[] args) {
        Home home = new Home("Broom  Street", 308304);
        City newYork = new City(home);
        Province nY = new Province(newYork);
        Country usa = new Country(nY);
        Region usaRegion = new Region(usa);
        Continent northAmerica = new Continent(usaRegion);
        Mainland america = new Mainland(northAmerica);
        Planet earth = new Planet(america);
        SunSystem solarSystem = new SunSystem(earth);
        Galactic snickers = new Galactic(solarSystem);
        Universe address = new Universe(snickers);

        try {
            Home homeCloned = (Home) home.clone();
            City newYorkCloned = (City) newYork.clone();
            Province nYCloned = (Province) nY.clone();
            Country usaCloned = (Country) usa.clone();
            Region usaRegionCloned = (Region) usaRegion.clone();
            Continent northAmericaCloned = (Continent) northAmerica.clone();
            Mainland americaCloned = (Mainland) america.clone();
            Planet earthCloned = (Planet) earth.clone();
            SunSystem solarSystemCloned = (SunSystem) solarSystem.clone();
            Galactic snickersCloned = (Galactic) snickers.clone();
            Universe addressCloned = (Universe) address.clone();

            print(home, newYork, address, homeCloned, newYorkCloned, addressCloned);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

    private static void print(Home home, City newYork, Universe address, Home homeCloned, City newYorkCloned, Universe addressCloned) {
        System.out.println(address == addressCloned);
        System.out.println(address.equals(addressCloned));

        System.out.println("==========================");

        System.out.println(home == homeCloned);
        System.out.println(home.equals(homeCloned));

        System.out.println("==========================");

        Home anotherHome = new Home("Kort", 7894526);
        newYorkCloned.setHome(anotherHome);
        System.out.println("Home in the original City. " + newYork.getHome().toString());
        System.out.println("Home in the cloned City. " + newYork.getHome().toString());
        System.out.println(newYork == newYorkCloned);
        System.out.println(newYork.equals(newYorkCloned));
    }

}
