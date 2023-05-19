package homework_18.Anush_Ananyan.entity;

public class Demo {
    public static void main(String[] args) {

        Address address1 = new Address("Armenia", "Tumanyan", 11);
        Address address2 = new Address("Armenia", "Tumanyan", 11);
        Address address3 = new Address("Armenia", "Tumanyan", 15);

        User user1 = new User("name1", "surname1", "email1@gmail.com", "111", 19, address1);
        User user2 = new User("name1", "surname1", "email1@gmail.com", "111", 19, address2);
        User user3 = new User("name3", "surname3", "email3@gmail.com", "333", 19, address3);

        System.out.println(address1.toString());
        System.out.println(address2.toString());
        System.out.println(address3.toString());
        System.out.println(address1.equals(address2));
        System.out.println(address1.equals(address3));
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
        System.out.println(address3.hashCode());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());

    }
}
