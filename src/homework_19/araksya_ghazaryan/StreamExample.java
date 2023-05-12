package homework_19.araksya_ghazaryan;

import java.util.Iterator;

public class StreamExample {
    public static void main(String[] args) {
        ExtendedList<Integer> integer = new ExtendedList<>();
        ExtendedList<String> str = new ExtendedList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);

        Iterator<Integer> iterator = integer.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(integer.forAll(num -> num > 0));
        Integer sum = integer.reduce(Integer::sum, 0);
        System.out.println(sum);

        str.fill(() -> "one  ", 1);
        str.fill(() -> "two ", 2);
        str.fill(() -> "three ", 3);
        System.out.println(str);
        ExtendedList colorsList = new ExtendedList();
        colorsList.add("yellow");
        colorsList.add("green");
        boolean result = str.forAll(colors -> colors.startsWith("y"));
        System.out.println("All start with 'y ': " + result);
        System.out.println(str.partition((n) -> n.endsWith("e")));
    }
}