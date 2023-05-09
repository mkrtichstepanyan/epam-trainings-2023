package homework_19.garik_gharibyan.extended_list;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> myList = new ExtendedList<>();
        myList.add(1);
        myList.add(4);
        myList.add(7);
        myList.add(2);
        myList.add(5);
        myList.add(8);

        System.out.println(myList);

        Iterator<Integer> iterator = myList.iterator();
        System.out.print("[");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if (iterator.hasNext()) System.out.print(", ");
        }
        System.out.println("]");

        ExtendedList<Integer> map = myList.map(n -> n * 10);
        System.out.println(map);
        final List<ExtendedList<Integer>> partition = myList.partition(n -> n % 2 == 0);
        System.out.println(partition);
    }
}
