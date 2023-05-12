package homework_17.zara_avetyan.deep_clone;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address apartment = new Address("3");
        Address street = new Address("Taterakan Street", apartment);
        Address city = new Address("Vanadzor City", street);
        Address region = new Address("Lori Region", city);
        Address country = new Address("Armenia Country", region);
        Address continent = new Address("Asia continent", country);
        Address mainland = new Address("Eurasia mainland", continent);
        Address planet = new Address("Earth planet", mainland);
        Address system = new Address("Solar System", planet);
        Address space = new Address("MilkyWay galactic", system);

        List<String> list = new LinkedList<>();
        Address clone = (Address) space.clone();
        while (clone != null) {
            list.add(clone.toString());
            clone = clone.getNext();
        }
        System.out.println(list);
    }
}
