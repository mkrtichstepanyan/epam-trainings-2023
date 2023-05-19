package homework_18.Lilit_Adamyan;

import homework_18.Lilit_Adamyan.Entity.Address;
import homework_18.Lilit_Adamyan.Entity.User;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Abovyan","Yerevan","Armenia");
        User user = new User("Karen","Makaryan",address,25,"karenAdamyan@gmail.com");

        Address address2 = new Address("Tumanyan","Yerevan","Armenia");
        User user2 = new User("Armen","Avetyan",address2,21,"armenAvetyan@gmail.com");

        Map<String,User> userMap = new HashMap<>();

        userMap.put(user.getEmail(),user);
        userMap.put(user2.getEmail(),user2);


        User retrievedUser = userMap.get("armenAvetyan@gmail.com");
        System.out.println("Retrieved user : " + retrievedUser);
    }
}
