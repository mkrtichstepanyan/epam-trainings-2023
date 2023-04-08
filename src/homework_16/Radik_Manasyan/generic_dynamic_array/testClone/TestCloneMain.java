package homework_16.Radik_Manasyan.generic_dynamic_array.testClone;

import homework_16.Radik_Manasyan.generic_dynamic_array.GenericDynamicArray;

import java.util.Comparator;


public class TestCloneMain {
    public static void main(String[] args) {
        GenericDynamicArray<User> usersList = new GenericDynamicArray<>();
        UserAddress userAddress = new UserAddress("Here", "this path");
        User user1 = new User("B", "UserOne", 11, userAddress);
        User user2 = new User("A", "UserTwo", 2, userAddress);

        usersList.add(user1);
        usersList.add(user2);

        usersList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        GenericDynamicArray<User> clone = usersList.cloneObjects();
        clone.get(0).setAge(111);
        clone.get(0).setName("Clone");
        clone.get(0).getUserAddress().setCountry("USA");

        clone.print();
        System.out.println("________________________________");
        usersList.print();


    }
}
