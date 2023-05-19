package homework_18.TatevKocharyan.entity;

public class Test {
    public static void main(String[] args) {
        User user=new User("Poxos","Poxosyan","poxos@gmail.com","555555",15,
                new Address("Gyumri","Lusavorich","2"));

        user.getAddress().setStreet("Garegin Njdeh");

        System.out.println(user);


    }
}
