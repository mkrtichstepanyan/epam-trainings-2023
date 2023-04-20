package homework_18.Ani_Kovalenko;

public class Run {
    public static void main(String[] args) {

        GenericMap<User, String> userMap = new GenericMap<>();

        Address address1 = new Address("Address1", 1);
        Address address2 = new Address("Address2", 2);
        Address address3 = new Address("Address3", 3);
        Address address4 = new Address("Address4", 4);

        User user1 = new User(address1, "User1", "user1@gmail.com", "User1User1.2023", 1);
        User user2 = new User(address2, "User2", "user2@gmail.com", "User2User2.2023", 2);
        User user3 = new User(address3, "User3", "user3@gmail.com", "User3User3.2023", 3);
        User user4 = new User(address4, "User4", "user4@gmail.com", "User4User4.2023", 4);
        User userB = new User(address1, "User1", "user1@gmail.com", "User1User1.2023", 1);
        User userC = new User(address1, "User1", "user1@gmail.com", "User1User1.2023", 1);

        callPutGet(userMap, user1, user2, user3, user4);

        valueOverriding(userMap, user1);

        checkRequirementsForEqualsMethod(user1, user2, userB, userC);

        checkHashCode(userB, userC);
    }

    private static void checkHashCode(User userB, User userC) {
        System.out.println("--------------");
        System.out.println("a = b -> " + userB.equals(userC));
        System.out.println("a.hashCode = b.hashCode -> " + userB.hashCode() + " " + userC.hashCode());
    }

    private static void valueOverriding(GenericMap<User, String> userMap, User user1) {
        System.out.println("--------------");
        System.out.println("User1 overriding");
        userMap.put(user1, "User4");
        System.out.println(userMap.get(user1));
    }

    private static void callPutGet(GenericMap<User, String> userMap, User user1, User user2, User user3, User user4) {
        userMap.put(user1, "User1");
        userMap.put(user2, "User2");
        userMap.put(user3, "User3");
        userMap.put(user4, "User4");

        System.out.println(userMap.get(user1));
        System.out.println(userMap.get(user2));
        System.out.println(userMap.get(user3));
        System.out.println(userMap.get(user4));
    }

    private static void checkRequirementsForEqualsMethod(User user1, User user2, User userB, User userC) {
        System.out.println("--------------");
        System.out.println("Reflexivity: a = a -> " + user1.equals(user1));

        System.out.println("Symmetry: a = b means b = a -> " + user1.equals(userB) + " " + userB.equals(user1));
        System.out.println("Transitivity: a = b, b = c, so a = c -> " + user1.equals(userB) + " " +
                userB.equals(userC) + " " + user1.equals(userC));
        System.out.println("Consistency: ");
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user2));
    }
}
