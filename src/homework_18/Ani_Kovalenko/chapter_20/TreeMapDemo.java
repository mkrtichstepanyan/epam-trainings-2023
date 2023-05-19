package homework_18.Ani_Kovalenko.chapter_20;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("John Doe", 234.55);
        tm.put("TomSmith", 541.155);
        tm.put("Jane Baker", 84951.1541);
        tm.put("Tod Hall", 46351350.545);
        tm.put("Ralph Smith", -454.524);


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
