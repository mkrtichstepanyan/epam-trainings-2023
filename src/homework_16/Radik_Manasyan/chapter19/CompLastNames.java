package homework_16.Radik_Manasyan.chapter19;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i;
        int j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
