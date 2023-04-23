package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("John Doe", 4454.46);
        tm.put("Tom Smith", 454054.5);
        tm.put("Jane Baker", 841.24);
        tm.put("Tod Hall", 546.45);
        tm.put("Ralph Smith", -61.45);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
