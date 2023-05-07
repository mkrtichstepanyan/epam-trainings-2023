package homework_19.Alina_Mkhoyan;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ExtendedList<String> mappedList = list.map(x -> "Element " + x);
        System.out.println(mappedList);  // Output: [Element 1, Element 2, Element 3]

        list.fill(() -> (int) (Math.random() * 100), 5);
        System.out.println(list);  // Output: [1, 2, 3, 21, 65, 7, 89]

        boolean allLessThan100 = list.forAll(x -> x < 100);
        System.out.println(allLessThan100);  // Output: true

        List<ExtendedList<Integer>> partitions = list.partition(x -> x % 2 == 0);
        System.out.println(partitions);  // Output: [[2], [1, 3, 21, 65, 7, 89]]

        int sum = list.reduce((x, y) -> x + y, 0);
        System.out.println(sum);  // Output: 188
    }
}
