package homework_17.Ani_Barseghyan.linked_list_book;

import homework_17.Ani_Barseghyan.GenericLinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        GenericLinkedList<Integer> linkedList = new GenericLinkedList<>();

        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(3);
        System.out.println(linkedList.size());
        //System.out.println(linkedList.get(0));
        //System.out.println(linkedList.contains(5));
        System.out.println(linkedList.lastIndexOf(4));
     while (linkedList.iterator().hasNext()){
         System.out.println();
     }
    }
}
