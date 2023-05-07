package homework_19.Ani_Barseghyan;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ExtendedList<String> mappedList = list.map(x -> "Value " + x);
        System.out.println(mappedList);

        list.fill(() -> (int) (Math.random() * 10), 3);
        System.out.println(list);

        boolean lessThanNumber = list.forAll(x -> x < 10);
        System.out.println(lessThanNumber);

        List<ExtendedList<Integer>> partition = list.partition(x -> x > 5);
        System.out.println(partition);

        int sum = list.reduce(Integer::sum, 0);
        System.out.println(sum);
    }
}
