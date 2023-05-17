package homework_21.anna_manukyan.utility;

import java.util.ArrayList;

public class PrintUtility {
    public static void printLine() {
        System.out.println();
        System.out.println("----------------------------");
    }

    public static void printList(ArrayList<Long> elements) {
        for (Long element : elements) {
            System.out.print(element + ", ");
        }
    }
}
