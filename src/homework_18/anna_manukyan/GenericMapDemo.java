package homework_18.anna_manukyan;

import homework_16.anna_manukyan.deep_copy.*;

public class GenericMapDemo {
    public static void main(String[] args) {
        GenericMap<homework_18.anna_manukyan.entity.User, String> userGenericMap = new GenericMap<>();
        Apartment apartment1 = new Apartment("12/3");
        Apartment apartment2 = new Apartment("12/1");
        Apartment apartment3 = new Apartment("111");

        Street street1 = new Street("Garegin Njdeh", apartment1);
        Street street2 = new Street("Komitas", apartment2);
        Street street3 = new Street(" SAINT MARKS", apartment2);

        City city1 = new City("Gyumri", street1);
        City city2 = new City("Erevan", street2);
        City city3 = new City("New-York", street3);

        Region region1 = new Region("Shirak", city1);
        Region region2 = new Region("Ararat", city2);
        Region region3 = new Region(" Northeastern United States", city3);

        Country country1 = new Country("Armenia", region1);
        Country country2 = new Country("Armenia", region2);
        Country country3 = new Country("USA", region3);

        homework_18.anna_manukyan.entity.Address address1 = new homework_18.anna_manukyan.entity.Address(country1);
        homework_18.anna_manukyan.entity.Address address2 = new homework_18.anna_manukyan.entity.Address(country2);
        homework_18.anna_manukyan.entity.Address address3 = new homework_18.anna_manukyan.entity.Address(country3);

        homework_18.anna_manukyan.entity.User user1 = new  homework_18.anna_manukyan.entity.User("Poxos", "Poxosyan", "poxos11@gmail.com","00000000.",25,address1);
        homework_18.anna_manukyan.entity.User user2 = new  homework_18.anna_manukyan.entity.User("Petros", "Petrosyan", "petros11@gmail.com","00000t00.",50,address2);
        homework_18.anna_manukyan.entity.User user3 = new  homework_18.anna_manukyan.entity.User("Mark", "Markyan", "mark11@gmail.com","000l0000.",18,address3);

        System.out.println("***Put elements***");

        userGenericMap.put(user1,"Bnakvum e Hayastanum");
        userGenericMap.put(user2,"Bnakvum e Rusastanum");
        userGenericMap.put(user3,"Bnakvum e Americayum");

        userGenericMap.print();
        System.out.println("***Get value by key ***" + user2.getName());
        String value = userGenericMap.get(user2);
        System.out.println("Value is: " + value);
        System.out.println("***Check if contains value***");
        System.out.println(userGenericMap.containsValue("C"));
        System.out.println("***Check if contains key***");
        System.out.println(userGenericMap.containsKey(apartment3));
        System.out.println("***Elements count***");
        System.out.println(userGenericMap.size());
        System.out.println("***Is empty map or not***");
        System.out.println(userGenericMap.isEmpty());

        System.out.println("***Clear***");
        userGenericMap.clear();
        userGenericMap.print();
    }
}
