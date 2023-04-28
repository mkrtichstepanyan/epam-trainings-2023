package homework_16.yeghia_ansuryan.chapter_20.algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll, r);

        System.out.print("List sorted in reverse: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(ll);
        System.out.print("List shuffled: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}
