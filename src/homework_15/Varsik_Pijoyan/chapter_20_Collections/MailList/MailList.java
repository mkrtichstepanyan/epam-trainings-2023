package homework_15.Varsik_Pijoyan.chapter_20_Collections.MailList;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();
        ml.add(new Address("J.W. West", "Oak Ave", "Urbana",
                "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lana", "Mahomet",
                "IL", "61853"));
        ml.add(new Address("Tom Carltor", "867 Elm St.", "Champaign",
                "IL", "61820"));

        for (Address elements : ml) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }
}
