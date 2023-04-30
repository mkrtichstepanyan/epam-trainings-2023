package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
