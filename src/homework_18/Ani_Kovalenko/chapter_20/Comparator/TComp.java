package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) {
            return aStr.compareToIgnoreCase(bStr);
        } else {
            return k;
        }
    }
}
