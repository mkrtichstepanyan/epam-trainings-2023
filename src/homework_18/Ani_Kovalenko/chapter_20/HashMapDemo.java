package homework_18.Ani_Kovalenko.chapter_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Doe", 351.215);
        hm.put("Tom Smith", 5495.15);
        hm.put("Jane Baker", 51.6254);
        hm.put("Tos Hall", 99.22);
        hm.put("Ralph Smith", -15.54);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
