package homework_16.Roza_Petrosyan.generic_dynamic_array_task.users_deep_clone;

import homework_16.Roza_Petrosyan.generic_dynamic_array_task.DynamicArray;

public class DeepCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        DynamicArray<User> users = new DynamicArray<>(2);
        users.add(new User("John","Doe",25,
                new Address("America","5th Avenue","78")));
        users.add(new User("Tom","Smith",27,
                new Address("England","2nd Avenue","58/9")));

        DynamicArray<User> clonedUsers = new DynamicArray<>(2);
        for (int i = 0; i < users.getSize(); i++) {
            clonedUsers.add((User) users.get(i).clone());
        }

        users.get(0).setAddress(new Address("Canada","5th street","45/2"));
        users.get(0).setName("Johnson");
        System.out.println("Users array list after modification:");
        System.out.println(users);
        System.out.println();
        System.out.println("Cloned users array list after modification:");
        System.out.println(clonedUsers);
    }
}
