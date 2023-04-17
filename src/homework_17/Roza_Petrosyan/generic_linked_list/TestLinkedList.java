package homework_17.Roza_Petrosyan.generic_linked_list;

import java.util.Arrays;
import java.util.Iterator;

public class TestLinkedList {
    public static void main(String[] args) throws CloneNotSupportedException{
        GenericLinkedList<Integer> linkedList = new GenericLinkedList<>();
        linkedList.add(12);
        linkedList.add(-1);
        linkedList.add(8);
        linkedList.add(25);
        System.out.println("GenericLinkedList after add() method:");
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after toArray() method:");
        System.out.println(Arrays.toString(linkedList.toArray()));

        System.out.println("GenericLinkedList after indexOf(25) method:");
        System.out.println(linkedList.indexOf(25));

        System.out.println("GenericLinkedList after get(1) method:");
        System.out.println(linkedList.get(1));

        System.out.println("GenericLinkedList after size() method:");
        System.out.println(linkedList.size());

        System.out.println("GenericLinkedList after isEmpty() method:");
        System.out.println(linkedList.isEmpty());

        System.out.println("GenericLinkedList after contains(6) method:");
        System.out.println(linkedList.contains(6));

        System.out.println("GenericLinkedList after lastIndexOf(25) method:");
        System.out.println(linkedList.lastIndexOf(25));

        System.out.println("GenericLinkedList after clone() method:");
        System.out.println(linkedList.clone());

        System.out.println("GenericLinkedList after remove(Integer.valueOf(8)) method:");
        System.out.println(linkedList.remove(Integer.valueOf(8)));
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after remove(2) method:");
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);

        GenericLinkedList<Integer> linkedListForAddAll = new GenericLinkedList<>();
        linkedListForAddAll.add(1);
        linkedListForAddAll.add(-6);
        linkedListForAddAll.add(95);

        System.out.println("GenericLinkedList after addAll(linkedListForAddAll) method:");
        linkedList.addAll(linkedListForAddAll);
        System.out.println(linkedList);

        GenericLinkedList<Integer> linkedListForAddAllIndex = new GenericLinkedList<>();
        linkedListForAddAllIndex.add(22);
        linkedListForAddAllIndex.add(99);
        linkedListForAddAllIndex.add(44);
        System.out.println("GenericLinkedList after containsAll() method:");
        System.out.println(linkedList.containsAll(linkedListForAddAllIndex));

        System.out.println("GenericLinkedList after (1,linkedListForAddAllIndex) method:");
        linkedList.addAll(1, linkedListForAddAllIndex);
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after removeAll() method:");
        linkedList.removeAll(linkedListForAddAllIndex);
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after subList(1,3) method:");
        System.out.println(linkedList.subList(1, 3));

        System.out.println("GenericLinkedList after add(4,455) method:");
        linkedList.add(4, 455);
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after set(2,887) method:");
        linkedList.set(2, 887);
        System.out.println(linkedList);

        System.out.println("GenericLinkedList after iterator() method:");
        Iterator<Integer> iterator = linkedList.iterator();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("GenericLinkedList after clear() method:");
        linkedList.clear();
        System.out.println(linkedList);
    }
}
