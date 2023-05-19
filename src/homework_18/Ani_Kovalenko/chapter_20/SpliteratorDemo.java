package homework_18.Ani_Kovalenko.chapter_20;

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

        System.out.println("Contents of vals: \n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.print(n + " "))) ;
        System.out.println();

        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        System.out.println("Contents of sqrs: \n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
