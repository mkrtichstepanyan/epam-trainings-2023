package homework_17.Varsik_Pijoyan;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<String> list = new GenericLinkedList<>();
        System.out.println("1. addFirst() and addLast() methods");
        list.addFirst("D");
        list.addFirst("A");
        list.addFirst("C");
        list.addFirst("B");
        list.addLast("E");
        list.addLast("G");
        list.addLast("F");
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("2. contains() method");
        System.out.println("Answer:");
        list.contains("F");
        System.out.println("---------------------------------------");

        System.out.println("3. Sort() method");
        list.sort();
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("4. add() method to add data into index");
        list.add(8, "H");
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("5. add() method to add a data to the list");
        list.addFirst("X");
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("6. addAll() method");
        list.addAll(List.of(new String[]{"L", "M", "N"}));
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("7. reversed() method");
        list.reversed();
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("8. removeFirst() method");
        list.removeFirst();
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("9. removeLast() method");
        list.removeLast();
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("10. remove() method");
        list.remove("G");
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("11. indexOf() method");
        list.display();
        int index1 = list.indexOf("M");
        System.out.println("index is: " + index1);
        System.out.println("---------------------------------------");

        System.out.println("12. set() method");
        list.set("O", 2);
        list.display();
        System.out.println("---------------------------------------");

        System.out.println("13. get() method");
        System.out.println("Data in given index is: " + list.get(1));
        System.out.println("---------------------------------------");

        System.out.println("14. shallow clone() method");
        System.out.println("Original List(before calling clone() method):");
        list.display();
        GenericLinkedList<String> listToClone;
        try {
            listToClone = list.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After calling clone method:");
        listToClone.display();
        System.out.println("---------------------------------------");
    }
}
