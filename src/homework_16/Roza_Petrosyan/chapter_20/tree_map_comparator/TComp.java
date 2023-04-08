package homework_16.Roza_Petrosyan.chapter_20.tree_map_comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) {
            return aStr.compareToIgnoreCase(bStr);
        } else {
            return k;
        }
    }
}
