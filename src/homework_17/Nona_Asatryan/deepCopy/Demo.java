package homework_17.Nona_Asatryan.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address apartment = new Address("Apartment");
        Address furmanovStreet = new Address("Furmanov Street", apartment);
        Address gyumriCity = new Address("Gyumri City", furmanovStreet);
        Address shirakRegion = new Address("Shirak Region", gyumriCity);
        Address armeniaCountry = new Address("Armenia Country", shirakRegion);
        Address caucasusRegion = new Address("Caucasus region", armeniaCountry);
        Address asiaContinent = new Address("Asia continent", caucasusRegion);
        Address eurasiaMainland = new Address("Eurasia mainland", asiaContinent);
        Address earthPlanet = new Address("Earth planet", eurasiaMainland);
        Address solarSystem = new Address("Solar System", earthPlanet);
        Address milkyWayGalactic = new Address("MilkyWay galactic", solarSystem);
        Address space = new Address("Space", milkyWayGalactic);

        // Deep clone the chain
        Address cloneSpace = (Address) space.clone();

        // Print the chain from the cloned object
        List<String> addressList = new ArrayList<>();
        Address current = cloneSpace;
        while (current != null) {
            addressList.add(current.toString());
            current = current.getNext();
        }
        System.out.println(String.join(" -> ", addressList));
    }
}
