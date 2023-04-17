package homework_16.Radik_Manasyan.chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> lItr = al.listIterator();
        while (lItr.hasNext()) {
            String element = lItr.next();
            lItr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");

        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Modified list backwards: ");
        itr = al.iterator();
        while (lItr.hasPrevious()) {
            String element = lItr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
