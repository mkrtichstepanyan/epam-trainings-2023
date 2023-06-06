package homework_17.Alina_Mkhoyan;

import java.util.Iterator;

public class LinkedListTest {
    public static void main(String[] args) {
        GenericLinkedList<String> linkedList = new GenericLinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Is list empty? " + linkedList.isEmpty());

        System.out.println("List size: " + linkedList.size());

        System.out.println("Does the list contain 'Banana'? " + linkedList.contains("Banana"));

        System.out.println("List elements:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        linkedList.remove("Banana");

        Object[] array = linkedList.toArray();
        System.out.println("List as array:");
        for (Object element : array) {
            System.out.println(element);
        }
    }
}

