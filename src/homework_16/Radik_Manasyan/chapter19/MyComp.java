package homework_16.Radik_Manasyan.chapter19;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return bStr.compareTo(aStr);
    }
}
