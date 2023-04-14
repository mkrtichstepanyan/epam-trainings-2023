package homework_16.Ani_Kovalenko.DynamicArray;

import homework_16.Ani_Kovalenko.DynamicArray.DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        DynamicArray object = new DynamicArray(5);

        for (int i = 0; i < 14; i++) {
            object.add(i);
        }
        callAddAll(object);
        callClone(object);
        callContains(object);
        callContainsAll(object);
        callIndexOf(object);
        callRemove(object);
        callRemoveAll(object);
        callIsEmpty(object);
        callSubList(object);
        callSet(object);
        callSort(object);
        callRemoveRange(object);
        callReplaceAll(object);
        callTrimToSize(object);
        callClear(object);
    }

    private static void callTrimToSize(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Size before trimming: " + object.getSize());
        object.trimToSize();
        System.out.println("Array after calling trimToSize() method: " + object);
        System.out.println();
    }

    private static void callReplaceAll(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        int[] newArray = {1, 2, 3, 4, 5, 6, 7};
        object.replaceAll(newArray);
        System.out.println("Array after calling replaceAll() method: " + object);
        System.out.println();
    }

    private static void callRemoveRange(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        object.removeRange(0, 3);
        System.out.println("Array after calling removeRange() method: " + object);
        System.out.println();
    }

    private static void callSort(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        object.sort();
        System.out.println("Array after calling sort() method: " + object);
        System.out.println();
    }

    private static void callSet(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array before calling set() method: " + object);
        System.out.println("Replaced element is: " + object.set(0, 200));
        System.out.println("Array after calling set() method: " + object);
        System.out.println();
    }

    private static void callSubList(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array before calling subList() method: " + object);
        System.out.println("Returned list: " + object.subList(2, 5));
        System.out.println();

//        The case when start index is greater than end index.
//        System.out.println("Returned list: " + object.subList(5,2));

//        The case when the start index is not valid.
//        System.out.println("Returned list: " + object.subList(-2,5));

//        The case when the end index is not valid.
//        System.out.println("Returned list: " + object.subList(2,555));
    }

    private static void callIsEmpty(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array is empty: " + object.isEmpty());

//        object.setSize(0);
//        System.out.println("Array is empty: " + object.isEmpty());
        System.out.println();
    }

    private static void callRemoveAll(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        object.getArray()[5] = 2;
        object.getArray()[2] = 2;
        object.getArray()[8] = 2;
        System.out.println("Array before calling removeAll() method: " + object);
        System.out.println("Removed = true/Failed = false: " + object.removeAll(2));
        System.out.println("Array after calling removeAll() method" + object);
        System.out.println();
    }

    private static void callRemove(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array before calling remove method: " + object);
        System.out.println("Removed element when calling by index #4: " + object.remove(4));
        System.out.println("Array after removing: " + object);
        System.out.println("Removed element when calling by value 44: " + object.remove(Integer.valueOf(44)));
        System.out.println("Array after removing: " + object);
        System.out.println();
    }

    private static void callIndexOf(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Trying to get the index of existing element: " + object.indexOf(55));
        System.out.println("Trying to get the index of non existing element: " + object.indexOf(555));
        System.out.println();
    }

    private static void callContainsAll(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array: " + object);
        ArrayList<Integer> listToBeVerified = new ArrayList<>();
        listToBeVerified.add(5);
        listToBeVerified.add(2);
        listToBeVerified.add(1);
        listToBeVerified.add(10);
        System.out.println("List to be verified: " + listToBeVerified);
        System.out.println(object.containsAll(listToBeVerified));
        System.out.println();

        ArrayList<Integer> newListToBeVerified = new ArrayList<>();
        newListToBeVerified.add(5);
        newListToBeVerified.add(2);
        newListToBeVerified.add(1);
        newListToBeVerified.add(100);
        System.out.println("The case when just one element does not match.");
        System.out.println("List to be verified 2: " + newListToBeVerified);
        System.out.println(object.containsAll(newListToBeVerified));
        System.out.println();
    }

    private static void callContains(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Check if the array contains 4 value: " + object.contains(4));
        System.out.println("Check if the array contains 104 value: " + object.contains(104));
        System.out.println();
    }

    private static void callClone(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array to be cloned: " + object);
        System.out.print("Cloned Array: ");
        System.out.print("[");
        for (int i = 0; i < object.clone().length; i++) {
            System.out.print(" " + object.clone()[i] + " |");
        }
        System.out.println("]");
        System.out.println();
    }

    private static void callClear(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Size before calling clear() method: " + object.getSize());
        object.clear();
        System.out.println("Array after calling clear() method: " + object);
        System.out.println("Array's length is default 16");
        System.out.println("Size after calling clear() method: " + object.getSize());
        System.out.println();
    }

    private static void callAddAll(DynamicArray object) {
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Array before calling addAll method: " + object);

        Integer[] d = {44, 55};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(d));
        object.addAll(arrayList);
        System.out.println("Array after calling addAll method: " + object);
        System.out.println();
    }
}
