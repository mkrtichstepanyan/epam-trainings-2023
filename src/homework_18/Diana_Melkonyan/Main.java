package homework_18.Diana_Melkonyan;

import homework_18.Diana_Melkonyan.entity.Address;
import homework_18.Diana_Melkonyan.entity.User;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        GenericMap<Integer, String> hashTable = new GenericMap<Integer, String>();
//
//        hashTable.put(1, "123");
//        hashTable.put(2, "222");
//        hashTable.put(3, "333");
//        hashTable.put(4, "444");
//        System.out.println(hashTable);
//        hashTable.put(1,"Hello");
//        System.out.print(hashTable);

//        hashTable.put(5, "555");
//        hashTable.put(6, "123");
//        hashTable.put(7, "222");
//        hashTable.put(8, "333");
//        hashTable.put(9, "444");
//        hashTable.put(10, "555");
//        hashTable.put(11, "222");
//        hashTable.put(12, "333");
//        hashTable.put(13, "444");
//        hashTable.put(14, "555");
//        hashTable.put(15, "222");
//        hashTable.put(16, "333");
//      hashTable.put(17,"444");


//        System.out.print(hashTable);
//        System.out.println()
//        System.out.println(hashTable.get(6));

        GenericMap<User, String> newUser = new GenericMap<>();

        User user = new User("Diana", "Melkonyan", 38, new Address("Tigran Mec"));
        User user1 = new User("Vika", "Simonyan", 10, new Address("Tigran Mec"));
        newUser.put(user, "Diana");
        newUser.put(user1, "Vika");
        System.out.println(newUser.get(user));
        System.out.println(newUser.get(user1));

    }
}



