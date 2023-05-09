package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phone;

    String email;

    NamePhoneEmail(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

}

class NamePhone {
    String name;
    String phone;

    NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", " 555-5555", "Larry@Gamil.com"));
        myList.add(new NamePhoneEmail("James", " 555-4444", "James@Gamil.com"));
        myList.add(new NamePhoneEmail("Mary", " 555-3333", "Mary@Gamil.com"));

        System.out.println("Original my list: ");
        myList.stream().forEach(n -> System.out.println(n.name + " " + n.phone + " " + n.email));
        System.out.println();

        Stream<NamePhone> namePhoneStream = myList.stream().map(n -> new NamePhone(n.name, n.phone));
        System.out.println("List names of phone: ");
        namePhoneStream.forEach(n -> System.out.println(n.name + " " + n.phone));

    }
}
