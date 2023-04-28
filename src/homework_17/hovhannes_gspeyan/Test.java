package homework_17.hovhannes_gspeyan;

public class Test {

    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();
        Integer[] arr = {26, 15, 45};
        Integer[] arr1 = {36, 54, 84};

        Integer i = 15;
        Integer c = 25;
        Integer a = 30;
        Integer b = 10;

        genericLinkedList.add(i);
        genericLinkedList.add(c);
        genericLinkedList.add(a);
        genericLinkedList.add(b);
        genericLinkedList.printList();

        genericLinkedList.addAll(arr);
        genericLinkedList.printList();

        genericLinkedList.get(2);

        genericLinkedList.addAll(3, arr1);
        genericLinkedList.printList();

        genericLinkedList.removeByValue(30);
        genericLinkedList.printList();

        genericLinkedList.removeByIndex(7);
        genericLinkedList.printList();

        genericLinkedList.removeAll(arr1);
        genericLinkedList.printList();

        genericLinkedList.contains(26);
        genericLinkedList.containsAll(15,25,89);

        genericLinkedList.set(3,54);
        genericLinkedList.printList();

        genericLinkedList.toArray();
        System.out.println();

        genericLinkedList.addAll(arr1);
        genericLinkedList.printList();

        genericLinkedList.subList(1,6);
        System.out.println();

        genericLinkedList.indexOf(54);

        genericLinkedList.clone();
    }
}
