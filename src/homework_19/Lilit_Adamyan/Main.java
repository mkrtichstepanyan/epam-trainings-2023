package homework_19.Lilit_Adamyan;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExtendedList<Integer> numbers = new ExtendedList<>();

        //add some elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //Test the map method
        ExtendedList<String> stringNumbers = numbers.map(Object::toString);
        System.out.println("After mapping: " + stringNumbers);

        //Test the fill method
        numbers.fill(() -> 2, 5);
        System.out.println("After filling: " + numbers);

        //test forAll method
        boolean allPositive = numbers.forAll(n -> n >= 0);
        System.out.println("All positive? " + allPositive);

        //Test the partition method
        List<ExtendedList<Integer>> partitions = numbers.partition(n -> n % 2 == 0);
        System.out.println("Partitions list: " + partitions);

        //Test the reduce method
        int sum = numbers.reduce(Integer::sum, 0);
        System.out.println("Sum: " + sum);
    }
}
