package homework_17.Roza_Petrosyan.generic_linked_list.deep_clone_with_serialization;

import homework_17.Roza_Petrosyan.generic_linked_list.GenericLinkedList;

public class DemoSpace {
    public static void main(String[] args) throws CloneNotSupportedException {
        GenericLinkedList<Space> space = new GenericLinkedList<>();
        space.add(new Space("MilkyWay", "Solar",
                "Earth", "Eurasia", "Asia",
                new Address("Caucasus", "Armenia", "Shirak", "Gyumri", "Gayi", 15 / 2)));

        GenericLinkedList<Space> cloned = new GenericLinkedList<>();
        for (int i = 0; i < space.size(); i++) {
            if(space.get(i) != null){
                cloned.add(space.get(i).deepClone());
            }
        }
        space.get(0).setPlanet("Venera");
        space.get(0).setAddress(new Address("OtherRegion", "OtherCountry", "Other", "OtherCity", "OtherStreet", 5));
        System.out.println(space);
        System.out.println(cloned);
    }
}
