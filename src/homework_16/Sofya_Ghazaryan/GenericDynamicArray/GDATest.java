package homework_16.Sofya_Ghazaryan.GenericDynamicArray;


import java.util.Arrays;

public class GDATest {

    public static void main(String[] args) {
        GenericDynamicArray myDynamicArray = new GenericDynamicArray(5);
        String[] myArray = {"A", "B", "C"};
        String[] myArray3 = {"ddd", "fff", "ascf", "sc", "aaaa"};

        int[] myArray2 = {5, 9, 11, 17, 20};


//        add elements
//        for (int i = 0; i < 5; i++) {
//            myDynamicArray.add(i);
//        }
//        System.out.println();

//        addAll method
        myDynamicArray.addAll(myArray);

//        addByIndex
        myDynamicArray.addByIndex(2, "kk");

//        addAllByIndex
        myDynamicArray.addAllByIndex(1, myArray3);

//        clone() -> makes a copy of the array list
        System.out.println(Arrays.toString(myDynamicArray.clone(myArray)));

//        clear() -> removes all the elements from arraylist
        myDynamicArray.clear();

//        contains() -> checks if the element is present in the arraylist
        myDynamicArray.contains(3);
        myDynamicArray.contains(20);

//        containsAll() -> checks if a collection is a subset of arraylist
        myDynamicArray.containsAll(myArray);
//        myDynamicArray.containsAll(myArray2);

//        indexOf() -> returns the position of the specified element
        myDynamicArray.indexOf("A");
        myDynamicArray.indexOf(91);

//        remove() -> removes the single element from the arraylist
        myDynamicArray.remove("A");

//        removeAll() -> removes multiple elements from the arraylist
        myDynamicArray.removeAll(myArray);

//        isEmpty() -> checks if the arraylist is empty
        myDynamicArray.isEmpty();

//        subList() -> returns a portion of the arraylist
        myDynamicArray.subList(5, 9);

//        set() -> replace the single element from an arraylist
        myDynamicArray.set(3, 30);

//        sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
        myDynamicArray.sort(myArray2);

//        toString() -> converts the arraylist into a String
        System.out.println(myDynamicArray.toString(myArray));


//        trimToSize() -> trims the capacity of arraylist equal to the size
        myDynamicArray.trimToSize();

//        removeRange() -> removes a portion of the arraylist
        System.out.println(Arrays.toString(myDynamicArray.removeRange(1, 2)));

//        replaceAll() -> replace all elements from the arraylist
        myDynamicArray.replaceAll(2, myArray);
    }
}
