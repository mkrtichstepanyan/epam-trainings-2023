package homework_19.rafik_pahlevanyan;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        ExtendedList<Integer> numbers = new ExtendedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ExtendedList<String> strings = numbers.map(n -> "Number " + n);
        strings.forEach(System.out::println);

        ExtendedList<String> list = new ExtendedList<>();

        list.fill(() -> "Hello", 5);
        System.out.println(list);



        boolean allEven = numbers.forAll(n -> n % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);


        ExtendedList<String> words = new ExtendedList<>();

        words.add("apple");
        words.add("mango");
        words.add("pineapple");
        words.add("banana");

        List<ExtendedList<String>> partitions = words.partition(word -> word.startsWith("a"));

        System.out.println("Words that start with 'a': " + partitions.get(0));
        System.out.println("Words that don't start with 'a': " + partitions.get(1));



        int sum = numbers.reduce(Integer::sum, 0);
        System.out.println("Sum: " + sum);

    }
}
