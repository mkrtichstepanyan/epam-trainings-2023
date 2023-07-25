package homework_21.Ani_Kovalenko;

import java.util.Iterator;
import java.util.List;

public class Printer {

    static void printFirstLine() {
        System.out.printf("%-14s %-7s%-9s %-7s%-9s %-7s%-9s %-7s%-9s %-7s%-9s %-7s%-9s %-7s%-9s %-7s%-9s",
                "Thread Name", "|", "run 1", "|", "run 2", "|", "run 3", "|", "run 4", "|",
                "min", "|", "max", "|", "avg", "|", "median");
        System.out.println();
    }

    static void print(List<Long> resultsList, List<Long> calsList, int i) {
        String sortName = switch (i) {
            case 0 -> "Bubble";
            case 1 -> "Selection";
            case 2 -> "Merge";
            default -> "Quick";
        };
        System.out.printf("%-15s", sortName);
        Iterator iterator = resultsList.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%-6s %-10s", "|", iterator.next());
        }
        printCals(calsList);
        System.out.println();
    }

    private static void printCals(List<Long> calsList) {
        Iterator iterator = calsList.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%-6s %-10s", "|", iterator.next());
        }
    }
}
