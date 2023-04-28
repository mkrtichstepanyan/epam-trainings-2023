package homework_17.Ani_Barseghyan.linked_list_book;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");

        linkedList.add(1, "A2");
        System.out.println("Original contents of linkedList " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Contents of linkedList after deletion: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList after deleting first and last " + linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val + " Changed");
        System.out.println("linkedList after change: " + linkedList);

        System.out.println(linkedList.get(0));
    }
}
