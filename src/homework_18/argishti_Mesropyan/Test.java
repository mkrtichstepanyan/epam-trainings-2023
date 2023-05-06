package homework_18.argishti_Mesropyan;

import homework_18.argishti_Mesropyan.entity.Address;
import homework_18.argishti_Mesropyan.entity.User;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Armenia", "Vanadzor", "Aghayan", 7 );
        User user = new User("Argishti", "Mesropyan","Argoo17@Mail.ru", "www", 30, address);
        GenericMap<User, String> users = new GenericMap<>();

        users.put(user, user.toString());

        System.out.println(address);

        System.out.println(users.hashCode());
        System.out.println(users.get(user));


    }
}
