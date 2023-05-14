package homework_18.Vahe_Vardanyan;
import homework_18.Vahe_Vardanyan.Address;
import homework_18.Vahe_Vardanyan.User;

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
        Address address = new Address("Gyumri", "9", 53);
        User user = new User("Vahe", "Vardanyan", "vahe.vardanyan.0808@gmail.com", "123*789*", 20, address);
        userMap.put(user, 25);
        System.out.println(userMap.get(user));

    }
}