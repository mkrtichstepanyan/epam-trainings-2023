package homework_18.Ani_Kovalenko.chapter_20;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;

        balance.put("John Doe", 4521.54);
        balance.put("Tom Smith", 541.65);
        balance.put("Jane Baker", 4512.54);
        balance.put("Tod Hall", 963.15);
        balance.put("Ralph Smith", 463.656);

        Set<String> set = balance.keySet();

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("John Doe's new balance: " + balance.get("John Doe"));
    }
}
