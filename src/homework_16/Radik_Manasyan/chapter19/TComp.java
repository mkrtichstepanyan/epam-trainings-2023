package homework_16.Radik_Manasyan.chapter19;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i;
        int j;
        int k;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}
