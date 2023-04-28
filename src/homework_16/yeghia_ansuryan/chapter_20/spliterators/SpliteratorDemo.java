package homework_16.yeghia_ansuryan.chapter_20.spliterators;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Contents of vals:\n");
        Spliterator<Double> splititr = vals.spliterator();
        while (splititr.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        splititr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splititr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        System.out.print("Contents of sqrs:\n");
        splititr = sqrs.spliterator();
        splititr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }

}
