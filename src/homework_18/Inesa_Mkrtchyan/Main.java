package homework_18.Inesa_Mkrtchyan;
import homework_18.Inesa_Mkrtchyan.entity.Address;
import homework_18.Inesa_Mkrtchyan.entity.User;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Armenia","Vanadzor","Tumanyan",22);
        User user = new User("Ani","Markosyan","AM@mail.ru","Aa123+",22,address);
        GenericMap<User,String> users = new GenericMap<>();
        users.put(user,"Ani");
        System.out.println(users.get(user));
    }
}
