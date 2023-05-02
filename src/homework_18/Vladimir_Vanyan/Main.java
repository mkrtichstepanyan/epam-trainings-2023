package homework_18.Vladimir_Vanyan;


import homework_18.Vladimir_Vanyan.entity.Address;
import homework_18.Vladimir_Vanyan.entity.User;

public class Main {
    public static void main(String[] args) {
        GenericMap<User, String> userGenericMap = new GenericMap<>();
        Address address=new Address("Taron 2");
        User user = new User("Vladimir", "Vanyan", 27, address);
        userGenericMap.put(user, "Vladimir");
        System.out.println(userGenericMap.get(user));
    }
}