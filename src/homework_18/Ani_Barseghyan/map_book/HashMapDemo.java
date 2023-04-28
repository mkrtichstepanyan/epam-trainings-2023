package homework_18.Ani_Barseghyan.map_book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("John Doe", 343.34);
        hashMap.put("Tom Smith", 123.22);
        hashMap.put("Jane Baker", 1343.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hashMap.get("John Doe");
        hashMap.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hashMap.get("John Doe"));
    }
}
