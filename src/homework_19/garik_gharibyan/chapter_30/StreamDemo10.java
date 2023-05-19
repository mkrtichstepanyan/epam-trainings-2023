package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Predicate;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");

        Spliterator<String> spliterator = myList.stream().spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        if (spliterator2 != null) {
            System.out.println("Spliterator2: ");
            spliterator2.forEachRemaining(n -> System.out.println(n));
        }
        System.out.println();

        System.out.println("Spliterator");
        spliterator.forEachRemaining(n -> System.out.println(n));
        final long count = myList.stream().count();
        System.out.println(count);
    }
}
