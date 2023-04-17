package homework_16.Radik_Manasyan.chapter19;

import java.util.Comparator;

public class CompThenByFirsName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i;
        int j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
