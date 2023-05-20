package homework_18.Eduard_Eghiazaryan;

import homework_18.Eduard_Eghiazaryan.entity.Address;
import homework_18.Eduard_Eghiazaryan.entity.User;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Armenia", "Vanadzor", "Aghayan", 7);
        Address address2 = new Address("Germany", "Strasburger", "Hotline", 333);
        Address address3 = new Address("France", "Lydovic", "SweetHome", 9);

        User user = new User("Eduard", "Eghiazaryan", "egiazaryaneduard3@gmail.com",
                "www", 16, address);
        User user2 = new User("Aram", "Eghiazaryan", "egiazaryanaram3@gmail.com",
                "nnn", 19, address2);
        User user3 = new User("Vardan", "Eghiazaryan", "egiazaryanvardan3@gmail.com",
                "wnw", 20, address3);

        GenericMap<User, String> users = new GenericMap<>();

        users.put(user, user.getName());
        users.put(user2,  user2.getEmail());
        users.put(user3, "9");


        System.out.println("------------------------------");

        for (String value : users.values()) {
            System.out.println(value);
        }

        System.out.println("------------------------------");
        System.out.println(user);
        System.out.println("------------------------------");
        System.out.println(address2);
    }
}
