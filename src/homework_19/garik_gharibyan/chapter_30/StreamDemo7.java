package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phone;

    String email;

    NamePhoneEmail1(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

}

class NamePhone1 {
    String name;
    String phone;

    NamePhone1(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

}

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Larry", " 555-5555", "Larry@Gamil.com"));
        myList.add(new NamePhoneEmail1("James", " 555-4444", "James@Gamil.com"));
        myList.add(new NamePhoneEmail1("Mary", " 555-3333", "Mary@Gamil.com"));

        Stream<NamePhone1> namePhone1Stream = myList.stream()
                .map(n -> new NamePhone1(n.name, n.phone));
        List<NamePhone1> collect = namePhone1Stream.collect(Collectors.toList());

        System.out.println("Name and phone numbers in a List: ");
        for (NamePhone1 n : collect) {
            System.out.println(n.name + ":" + n.phone);
        }

        namePhone1Stream = myList.stream()
                .map(n -> new NamePhone1(n.name, n.phone));
        final Set<NamePhone1> collect1 = namePhone1Stream.collect(Collectors.toSet());
        System.out.println("Name and phone numbers in a Set: ");
        for (NamePhone1 n : collect1) {
            System.out.println(n.name + ":" + n.phone);
        }
    }
}
