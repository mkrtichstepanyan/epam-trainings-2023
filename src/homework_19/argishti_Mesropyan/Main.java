package homework_19.argishti_Mesropyan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> arrayList = new ExtendedList<>();

        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(21);
        arrayList.add(111);

        ExtendedList<String> list = arrayList.map(s -> "String Number " + s);
        System.out.println(list);

        System.out.println("------------------------------------");

        arrayList.fill(() -> 2000, 5);
        System.out.println(arrayList);

        System.out.println("------------------------------------");

        arrayList.fill(() -> (int) (Math.random() * 100), 3);
        System.out.println(arrayList);

        System.out.println("------------------------------------");

        boolean forAllInteger = arrayList.forAll(i -> i < 2001);
        System.out.println(forAllInteger);

        System.out.println("------------------------------------");

        List<ExtendedList<Integer>> partitions = arrayList.partition(s -> s * 2 == 14);
        System.out.println(partitions);

        System.out.println("------------------------------------");

        Integer reduce = arrayList.reduce(Integer::sum,0);
        System.out.println(reduce);
    }
}
