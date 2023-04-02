package homework_16.Roza_Petrosyan.chapter_20.then_comparing;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
