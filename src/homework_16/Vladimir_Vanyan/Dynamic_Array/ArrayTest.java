package homework_16.Vladimir_Vanyan.Dynamic_Array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {44, 9, 4, 7, 1, 10, 20};
        int[] arr2 = {4, 85, 6, 84, 9, 10, 20, 44};
        //        add elements
        DynamicArray myDynamicArray = new DynamicArray(14);
        for (int i = 0; i < 5; i++) {
            myDynamicArray.add(i);
        }
        System.out.println();

//        addAll method
        myDynamicArray.addAll(arr);

//        clone() -> makes a copy of the array list
        System.out.println(Arrays.toString(myDynamicArray.clone()));

//         set() -> replace the single element from an arraylist
        myDynamicArray.set(3, 5);

//        removeRange() -> removes a portion of the arraylist
        myDynamicArray.removeRange(1, 3);

//        clear() -> removes all the elements from arraylist
        myDynamicArray.clear();

        myDynamicArray.addAll(arr);

//        contains() -> checks if the element is present in the arraylist
        myDynamicArray.contains(3);
        myDynamicArray.contains(20);

//        containsAll() -> checks if a collection is a subset of arraylist
        myDynamicArray.containsAll(arr2);
        myDynamicArray.containsAll(arr);

//        indexOf() -> returns the position of the specified element
        myDynamicArray.indexOf(4);


//        remove() -> removes the single element from the arraylist
        myDynamicArray.remove(9);

//        removeAll() -> removes multiple elements from the arraylist
        myDynamicArray.removeAll(arr);

//        isEmpty() -> checks if the arraylist is empty
        myDynamicArray.isEmpty();

//        subList() -> returns a portion of the arraylist
        myDynamicArray.subList(5, 9);


//        sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
        myDynamicArray.sort();

//        toString() -> converts the arraylist into a String
        System.out.println(myDynamicArray.toString());


//        trimToSize() -> trims the capacity of arraylist equal to the size
        myDynamicArray.trimToSize();



//        replaceAll() -> replace all elements from the arraylist
        myDynamicArray.replaceAll(8, 14);
    }
}
