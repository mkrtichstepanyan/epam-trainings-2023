package homework_17.Vahe_Vardanyan;
import java.util.Arrays;

public class LinkedListTest {
    public static void main(String[] args) {
        GenericLinkedList<Integer> genList = new GenericLinkedList<>();
        System.out.println("Added elements");
        genList.add(50);
        genList.add(60);
        genList.add(70);
        genList.add(80);
        System.out.println(genList);

        genList.add(2, 20);
        System.out.println(genList);

        genList.isEmpty();

        System.out.println("Contain element or not? " + 5 + " and " + 70);
        System.out.println(genList.contains(5));
        System.out.println(genList.contains(70));

        System.out.println("List to array");
        Object[] arr = genList.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        GenericLinkedList<String> list = new GenericLinkedList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println(genList);
//        genList.remove(2);
//        System.out.println(genList);

        genList.indexOf(4);
        genList.indexOf(17);

        GenericLinkedList<Integer> newList = new GenericLinkedList<>();
        newList.add(33);
        newList.add(44);
        newList.add(55);

        genList.addAll(newList);
        System.out.println(genList);

        genList.addAll(1, newList);
        System.out.println(genList);

        genList.retainAll(newList);
        System.out.println(genList);

        genList.clear();
        System.out.println(genList);

        genList.add(1);
        genList.add(2);
        genList.add(3);
        genList.add(4);
        genList.add(5);
        System.out.println(genList);
        genList.get(3);
        genList.get(7);

        genList.set(3, 88);
        System.out.println(genList);

        genList.add(1);
        genList.lastIndexOf(1);
        System.out.println(genList);

        genList.subList(1, 3);
        System.out.println(genList);

        GenericLinkedList<Integer> removedEl = new GenericLinkedList<>();
        removedEl.add(2);
        removedEl.add(22);
        System.out.println(genList);
        genList.removeAll(removedEl);
        System.out.println(genList);

        GenericLinkedList<Integer> containsEl = new GenericLinkedList<>();
        containsEl.add(22);
        containsEl.add(5);
        containsEl.add(10);
        genList.containsAll(containsEl);


    }
}