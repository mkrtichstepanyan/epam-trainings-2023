package homework_16.anna_manukyan.deep_copy;

public class Test {
    public static void main(String[] args) {
        User[] originalUsersList = new User[2];

        Apartment apartment1 = new Apartment("12/3");
        Apartment apartment2 = new Apartment("12/1");

        Street street1 = new Street("Garegin Njdeh", apartment1);
        Street street2 = new Street("Chinga", apartment2);

        City city1 = new City("Gyumri", street1);
        City city2 = new City("Gyumri-urish", street2);

        Region region1 = new Region("Shirak", city1);
        Region region2 = new Region("Shirak-urish", city2);

        Country country1 = new Country("Armenia", region1);
        Country country2 = new Country("Armenia-urish", region2);

        Continent continent1 = new Continent("Asia", country1);
        Continent continent2 = new Continent("Asia-urish", country2);

        Mainland mainland1 = new Mainland("Eurasia", continent1);
        Mainland mainland2 = new Mainland("Eurasia-urish", continent2);

        Planet planet1 = new Planet("Earth", mainland1);
        Planet planet2 = new Planet("PA-99-N2", mainland2);


        Sys sys1 = new Sys("Solar", planet1);
        Sys sys2 = new Sys("Vaucouleurs–Sandage", planet2);

        Galactic galactic1 = new Galactic("Milky Way", sys1);
        Galactic galactic2 = new Galactic("Andromeda", sys2);

        Space space1 = new Space("Our spase", galactic1);
        Space space2 = new Space("Our spase", galactic2);

        Address address1 = new Address(space1);
        Address address2 = new Address(space2);

        User user1 = new User("Valod", "Posoxyan", "+374098000000", address1);
        User user2 = new User("Poxos", "Posoxyan", "+374098999999", address2);


        originalUsersList[0] = user1;
        originalUsersList[1] = user2;

        for (User user : originalUsersList) {
            System.out.println(user.toString());
        }
        System.out.println();

        User[] cloneUserList = new User[originalUsersList.length];
        Object clone1 = originalUsersList[0].clone(originalUsersList[0]);
        Object clone2 = originalUsersList[1].clone(originalUsersList[1]);
        cloneUserList[0] = (User) clone1;
        cloneUserList[1] = (User) clone2;

        for (User user : cloneUserList) {
            System.out.println(user.toString());
        }

        System.out.println(originalUsersList[0].equals(cloneUserList[0]));
        System.out.println(originalUsersList[0] == (cloneUserList[0]));

        //Write in file
        Serialization.write(originalUsersList);
        Serialization.write(cloneUserList);
    }
}
