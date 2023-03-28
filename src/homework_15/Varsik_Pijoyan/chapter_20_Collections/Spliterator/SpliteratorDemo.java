package homework_15.Varsik_Pijoyan.chapter_20_Collections.Spliterator;

import java.util.*;
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<Double>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Contents of vals:\n");

        Spliterator<Double> splitr = vals.spliterator();

        while (splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        splitr = vals.spliterator();

        ArrayList<Double> sqrs = new ArrayList<Double>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        System.out.println("Contents of sqrs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
