package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
