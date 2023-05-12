package homework_18.qnarik_khachatryan;

import homework_18.qnarik_khachatryan.entity.Address;
import homework_18.qnarik_khachatryan.entity.User;

public class Demo {
    public static void main(String[] args) {
        GenericMap<Integer, String> genericMap = new GenericMap<>(6);
        genericMap.put(30, "one");
        genericMap.put(60, "two");
        genericMap.put(120, "three");
        genericMap.put(20, "four");
        genericMap.put(35, "five");

        System.out.println(genericMap.get(120));
        System.out.println(genericMap.get(60));
        System.out.println(genericMap.get(20));


        //using User class as key
        Address address = new Address("Armenia", "Gyumri", "Sundukyan", 565);
        User user = new User("Alina", "Ananyan", 32, address);
        GenericMap<User, Integer> genericMap1 = new GenericMap<>(6);
        genericMap1.put(user, 1);
        System.out.println(genericMap1.get(user));
    }
}
