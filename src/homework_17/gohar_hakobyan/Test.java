package homework_17.gohar_hakobyan;

import homework_17.gohar_hakobyan.model.Address;
import homework_17.gohar_hakobyan.model.User;

public class Test {
    public static void main(String[] args) {
        //Create GenericLinked list for integers
        GenericLinkedList<Integer> integersList = new GenericLinkedList<>();

        //Create Generic LinkedList User objects
        GenericLinkedList<User> usersList = new GenericLinkedList<>();


        integersList.add(5);
        integersList.add(155);
        integersList.add(15);
        integersList.add(415);
        integersList.print();

//        integersList.remove(2);
        integersList.print();

//        integersList.add(2, 802);
        integersList.print();

        integersList.toArray();

        integersList.subList(1,2).print();

        //check contains, contains all
        System.out.println(integersList.contains(15));
        System.out.println(integersList.contains(1115));
        System.out.println(integersList.containsAll(55, 155, 15, 415));


//        integersList.removeAll(5,155,15,415);

        System.out.println(integersList.size());

        integersList.clone();

        //Create user objects for LikedList testing
        Address address1 = new Address("P.Sevak", 7);
        Address address2 = new Address("Sayat-Nova", 12);
        User user1 = new User("Poghos", "Poghosyan", 25, address1);
        User user2 = new User("Petros", "Petrosyan", 31, address2);


        User[] users = usersList.addAll(user1, user2);
        for (User user : users) {
            System.out.println(user.getName());
        }
        usersList.remove(users);
        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println(usersList.contains(user1));
        System.out.println(usersList.indexOf(user2));
        System.out.println(usersList.lastIndexOf(1));


        System.out.println(usersList.size());
        usersList.add(1, new User("G", "Hyan", 28, address1));

        usersList.clear();


    }
}
