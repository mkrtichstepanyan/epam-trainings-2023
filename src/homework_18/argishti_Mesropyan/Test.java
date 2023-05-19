package homework_18.argishti_Mesropyan;

import homework_18.argishti_Mesropyan.entity.Address;
import homework_18.argishti_Mesropyan.entity.User;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Armenia", "Vanadzor", "Aghayan", 7);
        Address address2 = new Address("Germany", "Strasburger", "Hotline", 333);
        Address address3 = new Address("France", "Lydovic", "SweetHome", 9);

        User user = new User("Argishti", "Mesropyan", "Argoo17@Mail.ru", "www", 30, address);
        User user2 = new User("Artem", "Mesropyan", "Artem17@Mail.ru", "nnn", 19, address2);
        User user3 = new User("Anush", "Mesropyan", "Anush17@Mail.ru", "wnw", 29, address3);

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
