package homework_18.Nelli_Poghosyan;

import homework_18.Nelli_Poghosyan.entity.Address;
import homework_18.Nelli_Poghosyan.entity.User;

public class Test {
    public static void main(String[] args) {
        GenericMap<Integer, String> map = new GenericMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        map.display();

        Address address = new Address("Charenc street", "Gyumri", "Armenia");

        User user = new User("John", "Smith", "john@gmail.com", address, "1234", 22);

        GenericMap<User, Integer> userMap = new GenericMap<>();
        userMap.put(user, 1);
        System.out.println(userMap.get(user));


    }
}