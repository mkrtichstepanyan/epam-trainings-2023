package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> min = myStream.min(Integer::compareTo);
        if (min.isPresent()) System.out.println("Minimum value is: " + min.get());

        myStream = myList.stream();
        Optional<Integer> max = myStream.max(Integer::compare);
        if (max.isPresent()) System.out.println("Maximum value is: " + max.get());

        Stream<Integer> sorted = myList.stream().sorted();
        System.out.print("Sorted stream: " );
        sorted.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        Stream<Integer> integerStream = myList.stream().sorted().filter(integer -> integer % 2 != 0);
        System.out.print("Odd values: ");
        integerStream.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        Stream<Integer> integerStream1 = myList.stream().sorted()
                .filter(integer -> integer % 2 != 0)
                .filter(integer -> integer > 5);
        System.out.print("Odd values greater then 5: ");
        integerStream1.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
