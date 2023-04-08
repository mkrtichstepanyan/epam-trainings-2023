package homework_16.Roza_Petrosyan.chapter_20.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        return bStr.compareTo(aStr);
    }
}
