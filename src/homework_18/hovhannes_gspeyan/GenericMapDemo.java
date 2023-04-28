package homework_18.hovhannes_gspeyan;

import homework_18.hovhannes_gspeyan.entity.Address;
import homework_18.hovhannes_gspeyan.entity.User;

public class GenericMapDemo {
    public static void main(String[] args) {
        Address address = new Address("England", "London", "Bond", 15);
        Address address1 = new Address("France", "Paris", "Stone", 20);
        Address address2 = new Address("Portugal", "Lis", "Kent", 14);
        Address address3 = new Address("New Zealand", "Lel", "Vasco", 56);
        Address address4 = new Address("Denmark", "Copenhagen", "Bas", 65);
        Address address5 = new Address("Armenia", "Yerevan", "Ope", 74);
        Address address6 = new Address("USA", "Sacramento", "Yellowstone", 89);

        User user = new User("John", "Smith", 15, "1234", address);
        User user1 = new User("Juan", "Pen", 25, "5678", address1);
        User user2 = new User("Marc", "Antony", 40, "1568", address2);
        User user3 = new User("Antony", "Low", 60, "0897", address3);
        User user4 = new User("Fidel", "Castro", 32, "4796", address4);
        User user5 = new User("Johny", "Dep", 44, "0125", address5);
        User user6 = new User("Rafa", "Marquez", 70, "9651", address6);

        GenericMap<User, String> map = new GenericMap<>();

        map.put(user, "00");
        map.put(user1, "11");
        map.put(user2, "22");
        map.put(user3, "33");
        map.put(user4, "44");
        map.put(user5, "55");
        map.put(user6, "66");
        map.put(user6, "77");

        for (User u : map.keys()) {
            System.out.println(u + " " + map.get(u));
        }
        System.out.println(map.containsKey(user1));
        System.out.println(map.containsValue("100"));
        map.remove(user3);


//        GenericMap<Integer, String> intMap = new GenericMap<>();
//        Key<Integer> key = new Key<>();
//        long start = System.currentTimeMillis();
//        long s = System.currentTimeMillis();
//        for (int i = 0; i < 200_000; i++) {
//            intMap.put(key.of(i), i + "");
//            if(intMap.size() % 1000 == 0){
//                System.out.println(intMap.size() + " " + (System.currentTimeMillis() - s) + " " + (System.currentTimeMillis() - start));
//                s = System.currentTimeMillis();
//            }
//        }
//        System.out.println(System.currentTimeMillis() - start);

//        System.out.println("--------------------------------");
//
//        Key<String> key2 = new Key<>();
//        GenericMap<String, String> map2 = new GenericMap<>();
//        map2.put(key2.of("Hello"), "hi");
//        map2.put(key2.of("increase"), "grow ");
//        map2.put(key2.of("increase"), "extend");
//        map2.put(key2.of("good bye"), "bye bye");
//        map2.put(key2.of("problem"), "task");
//
//        for (String k : map2.keys()) {
//            System.out.println(k + " " + map2.get(k));
//        }
//        System.out.println(map2.containsKey("Hello"));
    }
}
