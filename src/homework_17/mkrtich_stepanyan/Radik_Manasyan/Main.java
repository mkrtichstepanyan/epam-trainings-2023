package homework_17.mkrtich_stepanyan.Radik_Manasyan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();
        genericLinkedList.add(5);
        genericLinkedList.add(15);
        System.out.println("genericLinkedList.isEmpty() " + genericLinkedList.isEmpty());
        System.out.println("genericLinkedList.contains(5) " + genericLinkedList.contains(5));
        System.out.println(Arrays.toString(genericLinkedList.toArray()));
        genericLinkedList.add(666);
        Integer i = 666;
        genericLinkedList.add(25);
        genericLinkedList.remove(i);
        genericLinkedList.add(2);
        genericLinkedList.remove(0);

        System.out.println(genericLinkedList.get(1));
        genericLinkedList.set(0, 125);
        System.out.println(genericLinkedList);
        genericLinkedList.add(0, 222);

        List<Integer> list = new LinkedList<>();
        list.add(555);
        list.add(999);

        genericLinkedList.addAll(list);
        genericLinkedList.addAll(0, list);

        System.out.println("genericLinkedList.indexOf(125) " + genericLinkedList.indexOf(125));
        System.out.println("genericLinkedList.containsAll(list) " + genericLinkedList.containsAll(list));

        GenericLinkedList<Integer> comapreGenericLinkedList = new GenericLinkedList<>();
        comapreGenericLinkedList.add(25);
        comapreGenericLinkedList.add(555);
        comapreGenericLinkedList.add(259);

        System.out.println(genericLinkedList.compareTo(comapreGenericLinkedList));

        comapreGenericLinkedList.clear();
        System.out.println(comapreGenericLinkedList.size());

    }
}
