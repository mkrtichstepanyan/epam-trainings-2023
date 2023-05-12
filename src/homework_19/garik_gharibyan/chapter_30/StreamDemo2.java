package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original list: " + myList);

        final Optional<Integer> reduce = myList.stream().reduce((integer, integer2) -> integer * integer2);
        if (reduce.isPresent()) System.out.println("Product is Optional: " + reduce.get());

        int product = myList.stream().reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(product);
    }
}
