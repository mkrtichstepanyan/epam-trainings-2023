package homework_17.Ani_Barseghyan.generic_linked_list;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        GenericLinkedList<Integer> linkedList = new GenericLinkedList<>();
        Integer[] addArr = {51, 61, 71, 81};
        Integer[] newArr = {11, 21, 31, 41};

        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(3);


        System.out.print("Size of linked List -> ");
        System.out.println(linkedList.size());

        System.out.print("Is empty -> ");
        System.out.println(linkedList.isEmpty());

        System.out.print("Find last index of 4 -> ");
        System.out.println(linkedList.lastIndexOf(4));

        System.out.print("Fins index of 3 -> ");
        System.out.println(linkedList.indexOf(3));


        System.out.print("Add all -> ");
        linkedList.addAll(List.of(addArr));
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println();

        System.out.print("Contains element 5? -> ");
        System.out.println(linkedList.contains(5));

        System.out.print("Contains all -> ");
        System.out.println(linkedList.containsAll(List.of(newArr)));

        System.out.print("Add all from index 2 -> ");
        linkedList.addAll(2, List.of(newArr));
        System.out.println(Arrays.toString(linkedList.toArray()));

        //linkedList.remove(0);
        //linkedList.remove(Integer.valueOf(11));
        //linkedList.removeAll(List.of(newArr));

        System.out.print("Add 88 from index 1 -> ");
        linkedList.add(1, 88);

        linkedList.set(0,33);
        System.out.println(Arrays.toString(linkedList.toArray()));
        //linkedList.clear();
    }
}
