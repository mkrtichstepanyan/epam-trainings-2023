package homework_16.yeghia_ansuryan.chapter_20.storingUserDefinedClasses;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {

        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlot", "867 Elm St",
                "Champaign", "IL", "61820"));

        for (Address element : ml) {
            System.out.println(element + "\n");
        }
        System.out.println();

    }
}
