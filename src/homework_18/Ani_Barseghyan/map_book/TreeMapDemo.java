package homework_18.Ani_Barseghyan.map_book;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("John Doe", 343.34);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jane Baker", 1343.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = treeMap.get("John Doe");
        treeMap.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + treeMap.get("John Doe"));
    }
}
