package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return bStr.compareTo(aStr);
    }
}
