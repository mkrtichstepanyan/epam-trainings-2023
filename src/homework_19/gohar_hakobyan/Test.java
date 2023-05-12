package homework_19.gohar_hakobyan;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        ExtendedList<Integer> list =
                new ExtendedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(28);

        Optional<ExtendedList<Integer>> mappedList = list.map(num -> num * 2);

        mappedList.ifPresent(System.out::println);


        list.fill(() -> 15, 7);
        System.out.println(list);
        System.out.println(list.forAll(num -> num > 0));

        Integer sum = list.reduce(Integer::sum, 0);
        System.out.println(sum);


        ExtendedList<String> fruitsList = new ExtendedList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("cherry");
        fruitsList.add("lemon");
        fruitsList.add("blueberries");
        fruitsList.add("orange");

        boolean result = fruitsList.forAll(fruit -> fruit.startsWith("a"));
        System.out.println("All fruits start with 'a ': " + result);

        List<ExtendedList<String>> partitions =
                fruitsList.partition(str -> str.length() == 6);
        System.out.println(partitions.get(0));
        System.out.println(partitions.get(1));


    }
}
