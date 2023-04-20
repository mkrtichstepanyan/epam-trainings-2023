package homework_18.gohar_hakobyan;

import homework_18.gohar_hakobyan.entity.Address;
import homework_18.gohar_hakobyan.entity.User;

public class Demo {
    public static void main(String[] args) {
        GenericMap.Node<User, Integer> map
                = new GenericMap.Node<>();
        User user = new User("G", "H", "g@mail.ru", "123456",
                28, new Address("Gyumri", "P.Sevak", 25));
        User user2 = new User("A", "Yan", "a@mail.ru", "55555",
                33, new Address("Gyumri", "P.Sevak", 25));
        User user3 = new User("O", "H", "o@mail.ru", "7788888",
                27, new Address("Gyumri", "Sayat-Nova", 25));
        User user4 = new User("T", "Ian", "t@mail.ru", "7777788",
                28, new Address("Gyumri", "P.Sevak", 45));
        User user5 = new User("L", "L", "l@mail.ru", "7788445",
                28, new Address("Gyumri", "P.Sevak", 31));


        map.put(user, 1);
        map.put(user2, 2);
        map.put(user3, 3);
        map.put(user4, 4);
        map.put(user5, 5);


        System.out.println(map.get(user5));
        System.out.println(map.get(user4));
        System.out.println(map.get(user5));
        System.out.println(map.get(user));
        System.out.println(map.get(user2));
        System.out.println(map.get(user3));

    }
}
