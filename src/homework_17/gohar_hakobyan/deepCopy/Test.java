package homework_17.gohar_hakobyan.deepCopy;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address Apartment = new Address("15");
        Address Street = new Address("P. Sevak", Apartment);
        Address City = new Address("Gyumri", Street);
        Address Region = new Address("Shirak", City);
        Address Country = new Address("Armenia", Region);
        Address region = new Address("Caucasus", Country);
        Address continent = new Address("Asia", region);
        Address mainland = new Address("Eurasia", continent);
        Address planet = new Address("Earth", mainland);
        Address system = new Address("Solar", planet);
        Address space = new Address("MilkyWay galactic", system);

        Address clonedSpace = (Address) space.clone();
        List<String> list = new LinkedList<>();
        Address curr = clonedSpace;
        while (curr != null) {
            list.add(curr.toString());
            curr = curr.getNext();
        }
        System.out.println(list);
    }
}
