package homework_16.Varsik_Pijoyan.DynamicArray;

public class Test {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("\nCalling add() method to add elements in the array:");
        dynamicArray.add(2);
        dynamicArray.add(7);
        dynamicArray.add(1);
        dynamicArray.add(3);
        dynamicArray.add(6);
        dynamicArray.add(0);
        dynamicArray.add(5);
        dynamicArray.add(9);
        dynamicArray.add(8);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("The size is: " + dynamicArray.getSize());
        System.out.println("----------------------------");

        System.out.println("Sorting elements");
        dynamicArray.sort();
        System.out.println(dynamicArray);
        System.out.println("----------------------------");


        System.out.println("Calling addAll() method");
        int[] dynamicArray2 = {23, 10, 12};
        dynamicArray.addAll(dynamicArray2);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling addByIndex() method");
        dynamicArray.addByIndex(12,13);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling sort() method to sort elements after addAll()");
        dynamicArray.sort();
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling set() method to set an element to the index");
        dynamicArray.set(1, 13);
        System.out.println(dynamicArray);
        System.out.println("array[1] is now 13");
        System.out.println("----------------------------");

        System.out.println("Calling sort() method again after changing element from array[1]");
        dynamicArray.sort();
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling get() method:");
        dynamicArray.get(1);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling contains() method to check if a given element contains in the array or not.");
        System.out.println("Answer:");
        dynamicArray.contains(12);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling containsAll() method");
        dynamicArray.containsAll(dynamicArray2);

        System.out.println("Calling indexOf() method to check in which index given element is:");
        System.out.println("Answer:");
        dynamicArray.indexOf(54);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling clone() method");
        dynamicArray.clone(dynamicArray2);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling remove method to remove an element");
        dynamicArray.remove(3);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling removeAll() method");
        dynamicArray.removeAll(dynamicArray2);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling subList method");
        dynamicArray.subList(0, 5);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling trimToSize() method");
        dynamicArray.trimToSize();
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        int[] array = new int[]{20, 40, 30};
        System.out.println("Calling replaceAll() method");
        dynamicArray.replaceAll(2, array);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling removeRange method");
        dynamicArray.removeRange(0, 3);
        System.out.println(dynamicArray);
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

        System.out.println("Calling clear() method to clear all elements from array:");
        dynamicArray.clear();
        System.out.println(dynamicArray);
        System.out.println("----------------------------");

    }
}
