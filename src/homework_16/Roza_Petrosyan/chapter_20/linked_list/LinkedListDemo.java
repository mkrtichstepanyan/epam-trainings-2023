package homework_16.Roza_Petrosyan.chapter_20.linked_list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Original contents of ll: " + ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " Changed");
        System.out.println("ll after change: " + ll);
    }
}
