package homework_18.Anush_Ananyan.GenericMap;

import homework_18.Anush_Ananyan.entity.Address;
import homework_18.Anush_Ananyan.entity.User;

public class Demo {
    public static void main(String[] args) {

        GenericMap<String, Integer> genMap = new GenericMap<>();
        GenericMap<User, Integer> genMapUser = new GenericMap<>();

        genMap.put("Anna", 25);
        genMap.put("Karen", 35);
        genMap.put("Anna",40);


        System.out.println(genMap.get("Karen"));
        System.out.println(genMap.get("Anna"));

        Address address = new Address("Armenia", "Tumanyan", 11);
        Address address2 = new Address("Armenia", "Tumanyan", 15);
        User user = new User("name1", "surname1", "email1@gmail.com", "111", 19, address);
        User user2 = new User("name1", "surname1", "email1@gmail.com", "111", 19, address2);

        genMapUser.put(user, 100);
        genMapUser.put(user2, 1000);
        genMapUser.put(user, 200);

        System.out.println(genMapUser.get(user));
        System.out.println(genMapUser.get(user2));
    }
}
