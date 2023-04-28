package homework_16.Anush_Ananyan.Chapter_20;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList <Address> ml= new LinkedList<Address>();

        ml.add(new Address("West", "11 Oak Ave",
                "Urbana" , "IL", "62155" ));
        ml.add(new Address("Ralph", "1142 Maple",
                "Mahomet" , "IL", "68965" ));
        ml.add(new Address("Tom", "759 Elm St",
                "Champaign" , "IL", "65665" ));

        for (Address element : ml){
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
