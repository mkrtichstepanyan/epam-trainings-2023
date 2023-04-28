package homework_17.Nona_Asatryan.genericLinkedList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList <Integer> list = new GenericLinkedList<>();
        Integer[] array = {87, 6, 45, 32, 5, 11};
        Integer[] array1 = {2, 1, 8, 5};

        list.addAll(array);
        System.out.println(list.print());

        list.add(77);
        list.add(8);
        list.add(43);
        System.out.println(list.print());

        list.add(2, 9);
        System.out.println(list.print());

        list.addAll(3, array1);
        System.out.println(list.print());

        System.out.println(list.get(6));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.set(3, 88);
        System.out.println(list.print());

        System.out.println(list.contains(5));

        System.out.println(list.containsAll(8, 32, 45, 6));

        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list.indexOf(77));

        System.out.println(list.lastIndexOf(32));

        list.clone();
        System.out.println(list.print());

        System.out.println(list.subList(2, 5));

        System.out.println(list.removeByIndex(1));

        System.out.println(list.remove(45));

        System.out.println(list.removeAll(array1));

        list.clear();
        System.out.println(list.print());
    }
}
