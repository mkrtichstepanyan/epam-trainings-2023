package homework_18.yeghia_ansuryan;

public class Test {
    public static void main(String[] args) {

        GenericMap<User, Number> userMap = new GenericMap<>();

        Address address1 = new Address("Address1", 1);
        Address address2 = new Address("Address2", 2);
        Address address3 = new Address("Address3", 3);
        Address address4 = new Address("Address4", 4);

        User user1 = new User(address1, "User1", "user1@gmail.com", "user1.2001", 1);
        User user2 = new User(address2, "User2", "user2@gmail.com", "user2.2002", 2);
        User user3 = new User(address3, "User3", "user3@gmail.com", "user3.2003", 3);
        User user4 = new User(address4, "User4", "user4@gmail.com", "user4.2004", 4);
        User userG = new User(address1, "User1", "user1@gmail.com", "user1.2001", 1);
        User userP = new User(address1, "User1", "user1@gmail.com", "user1.2001", 1);

        callPutGet(userMap, user1, user2, user3, user4);

        valueOverriding(userMap, user1);

        checkEquals(user1, user4, userG, userP);

        checkHashCode(userG, userP);
    }

    private static void checkHashCode(User userG, User userP) {
        System.out.println("============================");
        System.out.println("a = b ->> " + userG.equals(userP));
        System.out.println("a.hashCode = b.hashCode ->> " + userG.hashCode() + " " + userP.hashCode());
    }

    private static void checkEquals(User user1, User user4, User userG, User userP) {
        System.out.println("=====================");
        System.out.println("Reflexivity: a = a ->> " + user1.equals(user1));
        System.out.println("Symmetry: a = b means b = a ->> " + user1.equals(userG) + " " + userG.equals(user1));
        System.out.println("Transitivity: a = b, b = c, a = c ->> " + user1.equals(userG) +
                " " + userG.equals(userP) + " " + user1.equals(userP));
        System.out.println("Consistency!! ");
        System.out.println(user1.equals(user4));
        System.out.println(user1.equals(user4));
        System.out.println(user1.equals(user4));
        System.out.println(user1.equals(user4));
    }

    private static void valueOverriding(GenericMap<User, Number> userMap, User user1) {
        System.out.println("================");
        System.out.println("User1 overriding");
        userMap.put(user1, 444);
        System.out.println(userMap.get(user1));
    }

    private static void callPutGet(GenericMap<User, Number> userMap, User user1, User user2, User user3, User user4) {
        userMap.put(user1, 111);
        userMap.put(user2, 222);
        userMap.put(user3, 333);
        userMap.put(user4, 444);

        System.out.println(userMap.get(user1));
        System.out.println(userMap.get(user2));
        System.out.println(userMap.get(user3));
        System.out.println(userMap.get(user4));
    }
}
