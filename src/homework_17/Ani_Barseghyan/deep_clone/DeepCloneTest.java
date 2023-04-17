package homework_17.Ani_Barseghyan.deep_clone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeepCloneTest {
    public static void main(String[] args) {
        Address apartment = new Address("23");
        Address street = new Address("Khorenatsi", apartment);
        Address city = new Address("Yerevan", street);
        Address countryRegion = new Address("Yerevan", city);
        Address country = new Address("Armenia", countryRegion);
        Address region = new Address("Caucasus", country);
        Address continent = new Address("Asia", region);
        Address mainland = new Address("Eurasia", continent);
        Address planet = new Address("Earth", mainland);
        Address system = new Address("Solar system", planet);
        Address space = new Address("Milky way", system);

        Address clonedSpace = space.clone();

        List<Address> addressList = new ArrayList<>();
        Address current = clonedSpace;
        while (current != null) {
            addressList.add(current);
            current = current.getAddress();
        }
        System.out.println(addressList);
    }
}
