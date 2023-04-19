package homework_18.araksya_ghazaryan;

import homework_18.araksya_ghazaryan.entity.Address;
import homework_18.araksya_ghazaryan.entity.User;

public class HashMapTest {
    public static void main(String[] args) {
        GenMap<User, Integer> genericMap = new GenMap<>();
        Address address = new Address("Armenia","Ejmiadzin", "62");

        User user1 = new User("Gor", "Grigoryan","gor@gmail","*****", 25,address);
        User user2 = new User("Maria", "Petrosyan","maria@gmail.com","***", 12,address);
        User user3 = new User("Nare", "Sargsyan","nare@gmail.com","*****", 20,address);

        genericMap.put(user1, 4579);
        genericMap.put(user2, 1234);
        genericMap.put(user3, 2003);
        System.out.println(genericMap.toString());
        System.out.println(user1.equals(user2));
        System.out.println( "hashCode is " + user1.hashCode());
        System.out.println( "hashCode is " + user2.hashCode());
        System.out.println(genericMap.get(user3));

    }
}