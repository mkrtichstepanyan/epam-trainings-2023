package homework_19.TatevKocharyan.chapter30;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList=new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry","555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("james","555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Merry","555-3333","Merry@HerbSchildt.com"));
        Stream<NamePhone> nameAndPhone=myList.stream().map((a)->new NamePhone(a.name, a.phoneNum));
        List<NamePhone> npList=nameAndPhone.collect(Collectors.toList());
        System.out.println("names and phones in a List");
        for (NamePhone e:npList){
            System.out.println(e.name+": "+e.phoneNum);
        }

        nameAndPhone=myList.stream().map((a)->new NamePhone(a.name, a.phoneNum));
        Set<NamePhone> npSet=nameAndPhone.collect(Collectors.toSet());
        System.out.println("names and phones in a Set");
        for (NamePhone e:npSet){
            System.out.println(e.name+": "+e.phoneNum);
        }
    }
}
