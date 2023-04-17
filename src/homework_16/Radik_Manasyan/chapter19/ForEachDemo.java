package homework_16.Radik_Manasyan.chapter19;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("Contents of vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        int sum = 0;
        for (int v : vals) {
            sum += v;
        }

        System.out.println("Sum of values: " + sum);
    }
}
