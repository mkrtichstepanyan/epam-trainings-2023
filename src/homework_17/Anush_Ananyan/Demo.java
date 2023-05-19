package homework_17.Anush_Ananyan;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();

        list.addFromHead(5);
        list.addFromHead(6);
        Integer[] values = {66, 55, 77};
        Integer[] values2 = {99, 36, 87};
        Integer[] values3 = {-5, 101, 37};


        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());

        System.out.print("The List contains 5 -");
        System.out.println(list.contains(5));
        System.out.print("The List contains 7 -");
        System.out.println(list.contains(7));
        System.out.println();

        list.addAll(values);
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());
        System.out.println();

        System.out.print("The sub list is: ");
        System.out.println(list.subList(1, 3).toString());
        System.out.println();

        System.out.print("The List contains values - ");
        System.out.println(list.containsAll(values));
        System.out.print("The List contains values2 - ");
        System.out.println(list.containsAll(values2));
        System.out.println();


        list.addAllByIndex(3, values2);
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());
        System.out.println();

        System.out.print("The value of element with 3 index is - ");
        System.out.println(list.get(3));
        // System.out.println(list.get(9));
        //System.out.println(list.get(-1));
        System.out.println();

        System.out.print("the replaced element is: ");
        System.out.println(list.set(3, 100));
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.println();

        System.out.print("The element with 100 value is removed: ");
        System.out.println(list.remove(100));
        System.out.print("The element with 6 value is removed: ");
        System.out.println(list.remove(6));
        System.out.print("The element with 1000 value is removed: ");
        System.out.println(list.remove(1000));
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());
        System.out.println();

        System.out.println(list.removeByIndex(3));
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());

        System.out.print("array 'values' removed -");
        System.out.println(list.removeAll(values));
        System.out.print("array 'values3' removed -");
        System.out.println(list.removeAll(values3));
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("The size of list is: ");
        System.out.println(list.getSize());
        System.out.println();

        System.out.print("the index of element with 300 value is: ");
        System.out.println(list.indexOf(300));
        System.out.print("the index of element with 36 value is: ");
        System.out.println(list.indexOf(36));
        System.out.println();

        list.addFromHead(5);
        System.out.print("The list values are: ");
        System.out.println(list.toString());
        System.out.print("the last index of element with 5 value is: ");
        System.out.println(list.lastIndexOf(5));
        System.out.print("the last index of element with 25 value is: ");
        System.out.println(list.lastIndexOf(25));

        System.out.println(Arrays.toString(list.toArray()));

    }
}
