package homework_19.Nona_Asatryan;

import java.util.List;

public class ExtendedListDemo {
    public static void main(String[] args) {
        ExtendedList<Integer> myList = new ExtendedList<>();

        myList.fill(() -> (int) (Math.random() * 100) + 1, 10);

        System.out.println("Original list: " + myList);

        ExtendedList<Integer> squaredList = myList.map(x -> x * x);
        System.out.println("Squared list: " + squaredList);

        boolean allPositive = myList.forAll(x -> x > 0);
        System.out.println("All elements are positive: " + allPositive);

        List<ExtendedList<Integer>> partitions = myList.partition(x -> x % 2 == 0);
        System.out.println("Partitioned lists: " + partitions);

        int sum = myList.reduce(Integer::sum, 0);
        System.out.println("Sum of elements: " + sum);
    }
}
