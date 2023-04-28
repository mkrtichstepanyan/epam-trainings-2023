package homework_18.Nona_Asatryan.genericMap;

import homework_18.Nona_Asatryan.entity.Address;
import homework_18.Nona_Asatryan.entity.User;

public class GenericMapDemo {
    public static void main(String[] args) {
        GenericMap<User, String> genericMap = new GenericMap<>();

        User user = new User("John", "Smith", "johnsmith@gmail.com", "password", 22,
                new Address("Armenia", "Gyumri", "Furmanov"));

        User user2 = new User("Liza", "Smith", "lizasmith@gmail.com", "password", 27,
                new Address("Armenia", "Yerevan", "Proshyan"));

        genericMap.put(user, "user");
        genericMap.put(user2, "user2");
        genericMap.print();

        System.out.println("**********************");
        System.out.println(genericMap.get(user));
        System.out.println(genericMap.get(user2));

        System.out.println("**********************");
        System.out.println(genericMap.remove(user2));
        genericMap.print();

        System.out.println("**********************");
        System.out.println(genericMap.containsKey(user));

        System.out.println("**********************");
        System.out.println(genericMap.containsValue("user2"));

        System.out.println("**********************");
        genericMap.clear();
        genericMap.print();
    }
}
