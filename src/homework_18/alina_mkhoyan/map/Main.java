package homework_18.alina_mkhoyan.map;

import homework_18.alina_mkhoyan.entity.Address;
import homework_18.alina_mkhoyan.entity.User;

public class Main {
    public static void main(String[] args) {
        GenericMap<User, String> map = new GenericMap<>();

        User user1 = new User("John", "Doe", "johndoe@example.com", "password1", 30, new Address("123 Main St", "Anytown", "CA", "12345"));
        User user2 = new User("Jane", "Smith", "janesmith@example.com", "password2", 25, new Address("456 Elm St", "Othertown", "NY", "67890"));
        User user3 = new User("Antony", "Low", "antonylow@gmail.com", "password3", 60, new Address("3678 street", "Mayama", "CA", "31160"));
        User user4 = new User("Fidel", "Castro", "fidelcastro22@gmail.com", "password4", 22, new Address("87654 street", "Boston", "CA", "31170"));
        User user5 = new User("Johny", "Dep", "johnydeep99@gmail.com", "password5", 55, new Address("456 street", "Moscow", "MS", "31760"));

        map.put(user1, "value1");
        map.put(user2, "value2");
//        map.put(user3, "value3");
        map.put(user4, "value4");
        map.put(user5, "value5");
        map.put(user3, "value3");


        System.out.println(map.get(user1)); // prints "value1"
        System.out.println(map.get(user2)); // prints "value2"
        System.out.println(map.get(user3));
        System.out.println(map.get(user4));
        System.out.println(map.get(user5));

        for (User user : map.keys()) {
            map.get(user);
            System.out.println("User " + " -" + " " + user.getName()
                    + " " + user.getSurname() + ":" + " Age -" + user.getAge() + ", "
                    + "Email: " + user.getEmail());
        }

        System.out.println("-----------------");
        GenericMap<String, Integer> map1 = new GenericMap<>();

        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        System.out.println(map1.get("one")); // prints 1
        System.out.println(map1.get("three")); // prints 2
        System.out.println(map1.get("two")); // prints 3
        map1.put("two", 22);
        System.out.println(map1.get("two")); // prints 22


        for (int i = 0; i < 100; i++) {
            map1.put("key" + i, i);
        }

        System.out.println(map1.get("key50")); // 50
        System.out.println(map1.get("key99")); // 99


    }
}