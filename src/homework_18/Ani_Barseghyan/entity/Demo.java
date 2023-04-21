package homework_18.Ani_Barseghyan.entity;

import homework_18.Ani_Barseghyan.generic_map.GenericMap;

public class Demo {
    public static void main(String[] args) {
        Address address = new Address("Khorenatsi", "Yerevan", "Armenia");
        User user = new User("A", "A", 1, address);


        Address address2 = new Address("Isahakyan", "Yerevan", "Armenia");
        User user2 = new User("B", "B", 3, address2);


        GenericMap<String, User> userGenericMap = new GenericMap<>();
        userGenericMap.put(user.getName(), user);
        userGenericMap.put(user2.getName(), user2);

        System.out.println(userGenericMap.get("B"));
    }
}
