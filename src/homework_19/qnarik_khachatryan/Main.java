package homework_19.qnarik_khachatryan;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> myList = new ExtendedList<>();
        myList.add(10);
        myList.add(8);
        myList.add(6);
        myList.add(9);
        myList.add(5);
        System.out.println(myList);
        System.out.println();

        //map
        Function<Integer, Integer> function = (a) -> (a * 5);
        System.out.println(myList.map(function));
        System.out.println();

        // fill
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        myList.fill(supplier, 5);
        System.out.println(myList);
        System.out.println();

        //forAll
        Predicate<Integer> predicate = (n) -> (n > 5);
        System.out.println(myList.forAll(predicate));
        System.out.println();

        //partition
        Predicate<Integer> predicate1 = (n) -> (n % 2 == 0);
        System.out.println(myList.partition(predicate1));
        System.out.println();

        //reduce
        BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy((a, b) -> a.compareTo(b));
        System.out.println(myList.reduce(binaryOperator, 0));

    }
}
