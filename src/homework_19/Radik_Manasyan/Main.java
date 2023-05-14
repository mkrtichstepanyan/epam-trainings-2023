package homework_19.Radik_Manasyan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> myList = new ExtendedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        ExtendedList<Integer> map = myList.map(Integer::valueOf);
        System.out.println(map);

        Integer reduce = myList.reduce((a, b) -> a * b, 1);
        System.out.println(reduce);

        List<ExtendedList<Integer>> partition = myList.partition((n) -> n % 2 == 0);
        System.out.println(partition);

        boolean b = myList.forAll((n) -> n > 4);
        System.out.println(b);

        myList.fill(() -> 55, 5);
        System.out.println(myList);
    }
}
