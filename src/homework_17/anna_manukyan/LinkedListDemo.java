package homework_17.anna_manukyan;

public class LinkedListDemo {
    public static void main(String[] args) {
        GenericLinkedList<Integer> integers = new GenericLinkedList<>();
        //Adding elements
        System.out.println("***Added elements***");
        integers.add(50);
        integers.add(60);
        integers.add(70);

        //Get size
        System.out.println("***Get size***");
        integers.size();
        System.out.println(integers.size());

        //List is empty or not
        System.out.println("***Is empty?***");
        System.out.println(integers.isEmpty());

        //Element containing
        System.out.println("***Contain element or not? " + 710 + " and " + 50 + " ***");
        System.out.println(integers.contains(710));
        System.out.println(integers.contains(50));

        //Collection to array
        System.out.println("***List to array***");
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //Removing element
        System.out.println("***Removing element " + Integer.valueOf(60) + " ***");
        System.out.println(integers.remove(Integer.valueOf(60)));


        //Getting element
        System.out.println("***Get element by index: " + 1 + "***");
        System.out.println(integers.get(1));

        //Set element
        System.out.println("***Set element by index***");
        System.out.println(integers.set(0, 450));
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //Adding collection
        System.out.println("***Add collection in list***");
        GenericLinkedList<Integer> addingList = new GenericLinkedList<>();
        addingList.add(14);
        addingList.add(0);
        addingList.add(69);
        addingList.add(-5);
        addingList.add(1023);

        //clear
//        integers.clear();
        System.out.println("***Add elements in list***");
        System.out.println(integers.addAll(addingList));
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //Getting element index
        System.out.println("***Get index by value " + 70 + "***");
        System.out.println(integers.indexOf(70));

        //Getting last index
        System.out.println("***Last index of***");
        System.out.println(integers.lastIndexOf(70));

        //RemoveAll
        System.out.println("***Remove collection from list***");
        GenericLinkedList<Integer> removingList = new GenericLinkedList<>();
        removingList.add(14);
        removingList.add(-5);
        integers.removeAll(removingList);
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //Contains all
        System.out.println("***Contains collection in list***");
        GenericLinkedList<Integer> containingList = new GenericLinkedList<>();
        containingList.add(450);
        containingList.add(-52);

        System.out.println(integers.containsAll(containingList));

        System.out.println();

        //add element by index
        System.out.println("***Add element by index***");
        integers.add(1, Integer.valueOf(368));
        integers.add(2, Integer.valueOf(-63));
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //add element list by index
        System.out.println("***Add elements by index***");
        GenericLinkedList<Integer> addCollList = new GenericLinkedList<>();
        addCollList.add(1014);
        addCollList.add(-355);
        integers.addAll(0, addCollList);
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();

        //get sublist from list
        System.out.println("***Get sublist***");
        for (Object o : integers.subList(1, 3)) {
            System.out.print(o.toString() + ", ");
        }
        System.out.println();


        //remove by index
        System.out.println("***Remove element by index***");
        integers.remove(4);
        for (Object o : integers.toArray()) {
            System.out.print(o + ", ");
        }
        System.out.println();


    }
}
