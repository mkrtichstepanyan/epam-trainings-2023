package homework_16.yeghia_ansuryan.chapter_20.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {

        return bStr.compareTo(aStr);
    }

}
