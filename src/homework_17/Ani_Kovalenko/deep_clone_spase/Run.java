package homework_17.Ani_Kovalenko.deep_clone_spase;

public class Run {

    public static void main(String[] args) {
        Home home = new Home("Garegin Njdeh Street", 17);
        City gyumri = new City(home);
        Province shirak = new Province(gyumri);
        Country armenia = new Country(shirak);
        Region caucasus = new Region(armenia);
        Continent asia = new Continent(caucasus);
        Mainland eurasia = new Mainland(asia);
        Planet earth = new Planet(eurasia);
        SubSystem solarSystem = new SubSystem(earth);
        Galactic milkyWay = new Galactic(solarSystem);
        Space address = new Space(milkyWay);


        try {
            Home homeCloned = (Home) home.clone();
            City gyumriCloned = (City) gyumri.clone();
            Province shirakCloned = (Province) shirak.clone();
            Country armeniaCloned = (Country) armenia.clone();
            Region caucasusCloned = (Region) caucasus.clone();
            Continent asiaCloned = (Continent) asia.clone();
            Mainland eurasiaCloned = (Mainland) eurasia.clone();
            Planet earthCloned = (Planet) earth.clone();
            SubSystem solarSystemCloned = (SubSystem) solarSystem.clone();
            Galactic milkyWayCloned = (Galactic) milkyWay.clone();
            Space addressCloned = (Space) address.clone();

            print(home, address, homeCloned, addressCloned, gyumri, gyumriCloned);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    private static void print(Home home, Space address, Home homeCloned, Space addressCloned, City city, City cityCloned) {
        System.out.println(address == addressCloned);
        System.out.println(address.equals(addressCloned));

        System.out.println("---------------");

        System.out.println(home == homeCloned);
        System.out.println(home.equals(homeCloned));

        System.out.println("---------------");

        Home anotherHome = new Home("Sayat Nova", 5);
        cityCloned.setHome(anotherHome);
        System.out.println("Home in the original City: " + city.getHome().toString());
        System.out.println("Home in the cloned City: " + cityCloned.getHome().toString());
        System.out.println(city == cityCloned);
        System.out.println(city.equals(cityCloned));
    }
}
