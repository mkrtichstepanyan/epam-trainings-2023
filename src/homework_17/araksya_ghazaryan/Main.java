package homework_17.araksya_ghazaryan;


public class Main {
    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();
        System.out.println("Added elements");
        genericLinkedList.add(1);
        genericLinkedList.add(6);
        genericLinkedList.add(9);
        genericLinkedList.add(3);
        genericLinkedList.add(8);
        genericLinkedList.add(7);
        System.out.println("get size");
        genericLinkedList.size();
        System.out.println(genericLinkedList.size());
        System.out.println("is empty");
        System.out.println(genericLinkedList.isEmpty());
        System.out.println("contain element");
        System.out.println(genericLinkedList.contains(10));
        System.out.println(genericLinkedList.contains(9));
        System.out.println("list to array");
        for (Object o : genericLinkedList.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();
        System.out.println("removing element " + Integer.valueOf(1));
        System.out.println(genericLinkedList.remove(Integer.valueOf(1)));
        for (Object o : genericLinkedList.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();
        System.out.println("get element by index: ");
        System.out.println("by 1 index it is " + genericLinkedList.get(1));
        System.out.println("set element by index");
        System.out.println(genericLinkedList.set(1, 5));
        for (Object o : genericLinkedList.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();
        System.out.println("add collection in list");

        GenericLinkedList<Integer> addingList = new GenericLinkedList<>();
        addingList.add(5);
        addingList.add(2);
        addingList.add(6);
        addingList.add(8);
        addingList.add(3);
        genericLinkedList.clear();
        System.out.println(genericLinkedList.addAll(addingList));
        for (Object o : genericLinkedList.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();
        System.out.println("last index of");
        System.out.println(genericLinkedList.lastIndexOf(2));
    }
}