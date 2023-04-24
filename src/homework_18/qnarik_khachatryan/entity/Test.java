package homework_18.qnarik_khachatryan.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        ArrayList<Object> arrayListAddresses = new ArrayList<>(); // to store all hashes
        Set<Object> mySetAddresses = new HashSet<>(); // to store unique hashes

        for (int i = 0; i < 1000000; i++) {
            Address address1 = new Address("Armenia", "Gyumri", "Levon Madoyan", i);
            arrayListAddresses.add(address1.hashCode());
            mySetAddresses.add(address1.hashCode());
        }
        System.out.println(arrayListAddresses.size());  //1000000
        System.out.println(mySetAddresses.size());   // 1000000


        Address address = new Address("Armenia", "Gyumri", "Sundukyan", 1110);
        ArrayList<Object> usersArrayList = new ArrayList<>(); // to store all hashes
        Set<Object> usersSet = new HashSet<>(); // to store unique hashes

        for (int i = 0; i < 1000000; i++) {
            User user1 = new User("Arina", "Ananyan", i, address);
            usersArrayList.add(user1.hashCode());
            usersSet.add(user1.hashCode());
        }
        System.out.println(usersArrayList.size());  //1000000
        System.out.println(usersSet.size());   // 1000000
    }
}
