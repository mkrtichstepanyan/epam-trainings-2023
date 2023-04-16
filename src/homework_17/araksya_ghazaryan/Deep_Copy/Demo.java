package homework_17.araksya_ghazaryan.Deep_Copy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address apartment = new Address("Apartment");
        Address raffiStreet = new Address("Ruffi Street", apartment);
        Address vanadzorCity = new Address("Vanadzor City", raffiStreet);
        Address loriRegion = new Address("Lori Region", vanadzorCity);
        Address armeniaCountry = new Address("Armenia Country", loriRegion);
        Address caucasusRegion = new Address("Caucasus region", armeniaCountry);
        Address asiaContinent = new Address("Asia continent", caucasusRegion);
        Address eurasiaMainland = new Address("Eurasia mainland", asiaContinent);
        Address earthPlanet = new Address("Earth planet", eurasiaMainland);
        Address solarSystem = new Address("Solar System", earthPlanet);
        Address milkyWayGalactic = new Address("MilkyWay galactic", solarSystem);
        Address space = new Address("Space", milkyWayGalactic);



        Address Space = (Address) space.clone();
        List<String> addressList = new ArrayList<>();
        Address current = Space;
        while (current != null) {
            addressList.add(current.toString());
            current = current.getNext();
        }
        System.out.println(addressList);
    }
}