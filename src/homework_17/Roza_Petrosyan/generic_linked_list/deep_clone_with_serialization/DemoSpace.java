package homework_17.Roza_Petrosyan.generic_linked_list.deep_clone_with_serialization;

import homework_17.Roza_Petrosyan.generic_linked_list.GenericLinkedList;

import java.io.*;
import java.util.Objects;

public class DemoSpace {
    public static void main(String[] args) {
        GenericLinkedList<Space> space = new GenericLinkedList<>();
        space.add(new Space("MilkyWay", "Solar",
                "Earth", "Eurasia", "Asia",
                new Address("Caucasus", "Armenia", "Shirak", "Gyumri", "Gayi", 15 / 2)));

        Space deepClone = space.get(0).deepClone();
        space.get(0).setPlanet("Venera");
        space.get(0).setAddress(new Address("OtherRegion", "OtherCountry", "Other", "OtherCity", "OtherStreet", 5));
        System.out.println(space);
        System.out.println(deepClone);
    }
}
