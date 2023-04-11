package homework_17.Qnarik_Khachatryan.GenericLinkedList;


import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();

        // add(T value)
        genericLinkedList.add(10);
        genericLinkedList.add(20);
        genericLinkedList.add(30);
        genericLinkedList.add(55);
        genericLinkedList.add(20);
        genericLinkedList.print();


        //add(int index, T value)
        genericLinkedList.add(0, 66); //to head
        genericLinkedList.add(4,44);  // in the middle
        genericLinkedList.add(7,88); //to the end
        // genericLinkedList.add(8,44); // IndexOutOfBoundsException
        genericLinkedList.print();


        //addAll(Collection<T> collection)
        LinkedList<Integer> genericLinkedListToAdd = new LinkedList<>();
        genericLinkedListToAdd.add(444);
        genericLinkedListToAdd.add(555);
        genericLinkedList.addAll(genericLinkedListToAdd);
        genericLinkedList.print();


        //isEmpty()
        System.out.println(genericLinkedList.isEmpty());


        //size()
        System.out.println(genericLinkedList.size());


        //indexOf(T value)
        System.out.println(genericLinkedList.indexOf(88));


        //lastIndexOf(T value)
        System.out.println(genericLinkedList.lastIndexOf(20));


        //get(int index)
        System.out.println(genericLinkedList.get(2));


        //set(int index, T value)
        genericLinkedList.set(2,222);
        genericLinkedList.print();


        //contains(T value)
        System.out.println(genericLinkedList.contains(222));


        //remove(int index)
        genericLinkedList.print();
        genericLinkedList.remove(2);
        genericLinkedList.print();


        //clear()
        // genericLinkedList.clear();
        genericLinkedList.print();
        //System.out.println(genericLinkedList.size()); return 0

        //subList(int fromIndex, int toIndex)
        genericLinkedList.print();
        System.out.println(genericLinkedList.subList(0, 7));
    }
}
