package homework_18.karen_mikayelyan;


import homework_18.karen_mikayelyan.entity.Address;
import homework_18.karen_mikayelyan.entity.User;

public class Test {
    public static void main(String[] args) {
//        GenericMap<String, String> map = new GenericMap<>();
//        map.put("1", "11");
//        map.put("2", "22");
//        map.put("3", "33");
//        for (String k : map.keys()) {
//            System.out.println(k + " " + map.get(k));
//        }
//        System.out.println(map.containsKey("2"));
//
//
//        GenericMap<Integer, String> genericMap = new GenericMap<>();
//        for (int i = 0; i < 25; i++) {
//            System.out.print(genericMap.put(i, " $"));
//        }
//        System.out.println();


        GenericMap<User, Integer> userMap = new GenericMap<>();
        Address address = new Address("Gyumri", "Sayat Nova", 26);
        User user = new User("Karen", "Mikayelyan", "mikkar89@mail.ru", "abcdef777", 33, address);
        userMap.put(user, 25);
        System.out.println(userMap.get(user));

    }
}
