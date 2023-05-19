package homework_18.Ani_Kovalenko.chapter_20;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {

    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        Enumeration<String> names;
        String str;
        double bal;

        balance.put("John Doe", 4521.54);
        balance.put("Tom Smith", 541.65);
        balance.put("Jane Baker", 4512.54);
        balance.put("Tod Hall", 963.15);
        balance.put("Ralph Smith", 463.656);

        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("John Doe's new balance " + balance.get("John Doe"));
    }
}
