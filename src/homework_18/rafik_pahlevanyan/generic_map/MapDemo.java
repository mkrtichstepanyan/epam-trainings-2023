package homework_18.rafik_pahlevanyan.generic_map;

import homework_18.rafik_pahlevanyan.entity.Address;
import homework_18.rafik_pahlevanyan.entity.User;

public class MapDemo {
    public static void main(String[] args) {

        GenericMap<String, Integer> map1 = new GenericMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        System.out.println("map1: " + map1.keySet());

        MyMap<String, Integer> map2 = new MyMap<>();
        map2.put("d", 4);
        map2.put("e", 5);
        map2.put("f", 6);
        System.out.println("map2: " + map2.keySet());

        map1.extend(map2);
        System.out.println("map1 after extend: " + map1.keySet());

        System.out.println("value of 'b' in map1: " + map1.get("b"));
        System.out.println("value of 'e' in map1: " + map1.get("e"));

        System.out.println(map1.get("c"));

        MyMap<User,Integer> usermap = new MyMap<>();
        Address address = new Address("Armenia","Gyumri","Vazgen Sargsyan");
        User user = new User("Rafik","Pahlevanyan","pahlevanyanr@mail.ru","asdf1234", address,26);
        usermap.put(user,20);


    }
}

