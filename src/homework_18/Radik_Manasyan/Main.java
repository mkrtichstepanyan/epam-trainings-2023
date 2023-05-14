package homework_18.Radik_Manasyan;

import homework_18.Radik_Manasyan.entity.Address;
import homework_18.Radik_Manasyan.entity.User;


public class Main {
    public static void main(String[] args) {
        Address address = new Address("London", "Here");
        User user = new User("I", "My", "I+My@.class",
                "myPass", 5, address);
        User user1 = new User("I", "My", "I+My@.class",
                "myPassTwo", 5, address);

        GenericMap<User, String> mapUsers = new GenericMap<>();

        mapUsers.put(user, "user");
        mapUsers.put(user1, "user1");
        System.out.println(mapUsers);

    }
}
