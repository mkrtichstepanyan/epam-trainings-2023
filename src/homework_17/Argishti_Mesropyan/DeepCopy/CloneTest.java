package homework_17.Argishti_Mesropyan.DeepCopy;

import java.util.*;

public class CloneTest {
    public static void main(String[] args) {
        Address apartament = new Address("21");
        Address street = new Address("Aghayan", apartament);
        Address city = new Address("Vanadzor", street);
        Address countryRegion = new Address("Lori", city);
        Address country = new Address("Armenia", countryRegion);

        Address clonedSp = country.clone();
        List<Address> addressList = new ArrayList<>();
        Address current = clonedSp;
        while (current != null) {
            addressList.add(current);
            current = current.getAddress();
        }
        System.out.println(addressList);

    }
}
