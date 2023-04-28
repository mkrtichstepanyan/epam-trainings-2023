package homework_16.Qnarik_Khachatryan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);

        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(i);
        }
        System.out.println();

        //addAll() -> adds all elements of a collection to arraylist
        Collection collection = new ArrayList<>();
        collection.add(45);
        collection.add(55);
        myDynamicArray.addAll(collection);
        System.out.println(myDynamicArray.toString());

        //isEmpty() -> checks if the arraylist is empty
        System.out.println(myDynamicArray.isEmpty());

        //clone() -> makes a copy of the array list
        System.out.println(myDynamicArray.clone());

        //contains() -> checks if the element is present in the arraylist
        System.out.println(myDynamicArray.contains(15));

        //containsAll() -> checks if a collection is a subset of arraylist
        System.out.println(myDynamicArray.containsAll(collection));

        //indexOf() -> returns the position of the specified element
        System.out.println(myDynamicArray.indexOf(56));

        // remove() -> removes the single element from the arraylist (find the index and move other elements back)
        System.out.println(myDynamicArray);
        System.out.println(myDynamicArray.remove(2));
        System.out.println(myDynamicArray);

//        // clear() -> removes all the elements from arraylist
//        myDynamicArray.clear();
//        System.out.println(myDynamicArray);

        //removeAll() -> removes multiple elements from the arraylist
        int[] arr = new int[]{1, 30};
        myDynamicArray.removeAll(arr);
        System.out.println(myDynamicArray);

        //subList() -> returns a portion of the arraylist
        System.out.println(Arrays.toString(myDynamicArray.subList(3, 7)));

        // set() -> replace the single element from an arraylist
        myDynamicArray.set(3, 99);
        System.out.println(myDynamicArray);

        //sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
        myDynamicArray.sort();
        System.out.println(myDynamicArray);

        // removeRange() -> removes a portion of the arraylist
        System.out.println();
        myDynamicArray.removeRange(0, 6);
        System.out.println(myDynamicArray);

        //trimToSize() -> trims the capacity of arraylist equal to the size
        myDynamicArray.trimToSize(10);
        System.out.println(myDynamicArray);

        //replaceAll() -> replace all elements from the arraylist
        System.out.println(myDynamicArray);
        myDynamicArray.replaceAll(4, 44);
        System.out.println(myDynamicArray);

        //toString1() -> converts the arraylist into a String
        System.out.println(myDynamicArray.toString1());

    }
}
