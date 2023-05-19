package homework_18.Varsik_Pijoyan.genericMap;

import homework_18.Varsik_Pijoyan.entity.Address;
import homework_18.Varsik_Pijoyan.entity.User;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        GenericMap<Integer, String> myMap = new GenericMap<>();
        myMap.put(1, "A");
        myMap.put(4, "B");
        myMap.put(2, "D");
        myMap.put(3, "C");
        myMap.display();
        System.out.println();
        // GenericMap<User, Integer> users = new GenericMap<>();

        HashMap<User, Integer> users = new HashMap<>();
        users.put(new User("Liam", "Miller", "lm@gmail.com", "******",
                23, new Address("USA", "Los Angeles, California")), 2);
        users.put(new User("Olivia", "Johnson", "oj@gmail.com", "*****",
                24, new Address("USA", "Houston, Texas")), 1);
        users.put(new User("Sophia", "Lee", "slee@gmail.com", "*****",
                21, new Address("UK", "London")), 3);

        Set<User> user = users.keySet();
        System.out.println("------------------Users list------------------------------");
        for (User userList : user) {
            System.out.println(userList.toString());
        }
    }
}
