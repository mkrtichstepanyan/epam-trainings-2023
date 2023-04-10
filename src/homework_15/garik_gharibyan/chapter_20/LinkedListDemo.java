package homework_15.garik_gharibyan.chapter_20;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");  // or offerFirst
        ll.addFirst("A");
        ll.add(2,"A2");
        System.out.println("Original contents of ll: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents ll after delete: " + ll);

        ll.removeFirst();  // or pollFirst
        ll.removeLast();
        System.out.println("Contents ll after delete first and last element: " + ll);

        String val = ll.get(2);  // or peekFirst()
        ll.set(2,val + " Changed");
        System.out.println("ll after changed: " + ll);


    }
}
