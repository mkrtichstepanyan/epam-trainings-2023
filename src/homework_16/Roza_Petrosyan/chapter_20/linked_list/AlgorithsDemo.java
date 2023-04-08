package homework_16.Roza_Petrosyan.chapter_20.linked_list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("List sorted in reverse: ");
        for (int i : ll) {
            System.out.println(i + " ");
        }
        System.out.println();
        Collections.shuffle(ll);
        System.out.println("List shuffled: ");
        for (int i : ll) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Maximum: " + Collections.max(ll));
        System.out.println("Minimum: " + Collections.min(ll));
    }
}
