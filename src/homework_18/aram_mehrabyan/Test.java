package homework_18.aram_mehrabyan;
import homework_18.aram_mehrabyan.Entity.Address;
import homework_18.aram_mehrabyan.Entity.User;

public class Test {

    public static void main(String[] args) {
        //GenericMap<Integer,String> map=new GenericMap<>();
       // map.put(1,"A");
       // map.put(2,"B");
      //  map.put(3,"C");
      //  System.out.println(map.get(3));
Address address1=new Address("Armenia","Vanadzor","Agayan",80);
        Address address2=new Address("Armenia","Vanadzor","Tigran Mec",42);
User user1=new User("Aram","Mehrabyan","aram_mehrabyan@gmail.com",47,address1);
        User user2=new User("Armen","Vardanyan","armen_vardannyan@gmail.com",35,address2);
        GenericMap<User,String> map=new GenericMap<>();
        map.put(user1,"100");
        map.put(user2,"200");

        System.out.println(map.get(user2));
    }

}
