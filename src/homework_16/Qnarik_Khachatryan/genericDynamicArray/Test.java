package homework_16.Qnarik_Khachatryan.genericDynamicArray;

import homework_16.Qnarik_Khachatryan.DynamicArray;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        GenericDynamicArray myGenericDynamicArray = new GenericDynamicArray(5);

        for (int i = 0; i < 14; i++) {
            myGenericDynamicArray.add(i);
        }
        System.out.println();

        //add() -> adds different types to arraylist
        myGenericDynamicArray.add("hi");

        List myList = new LinkedList();
        myList.add(999);
        myList.add(1000);
        myGenericDynamicArray.add(myList);


        //addAll() -> adds all elements of a collection to arraylist
        Collection collection = new ArrayList<>();
        collection.add(45);
        collection.add(55);
        myGenericDynamicArray.addAll(collection);
        System.out.println(myGenericDynamicArray);

        Collection collection1 = new HashSet<>();
        collection1.add("ob1");
        collection1.add("ob2");
        myGenericDynamicArray.addAll(collection1);
        System.out.println(myGenericDynamicArray);


        //isEmpty() -> checks if the arraylist is empty
        System.out.println(myGenericDynamicArray.isEmpty());

        //clone() -> makes a copy of the array list
        System.out.println(myGenericDynamicArray);
        ArrayList copiedList = myGenericDynamicArray.clone();
        System.out.println(copiedList);
        copiedList.set(1, 20);
        System.out.println(myGenericDynamicArray);
        System.out.println(copiedList);


        //contains() -> checks if the element is present in the arraylist
        System.out.println(myGenericDynamicArray.contains("ob2"));

        //containsAll() -> checks if a collection is a subset of arraylist
        System.out.println(myGenericDynamicArray.containsAll(collection));

        //indexOf() -> returns the position of the specified element
        System.out.println(myGenericDynamicArray.indexOf("ob1"));


        // remove() -> removes the single element from the arraylist (find the index and move other elements back)
        System.out.println(myGenericDynamicArray);
        System.out.println(myGenericDynamicArray.remove(2));
        System.out.println(myGenericDynamicArray);

        // clear() -> removes all the elements from arraylist
//        myGenericDynamicArray.clear();
        System.out.println(myGenericDynamicArray);

        //removeAll() -> removes multiple elements from the arraylist
        ArrayList <Integer> arrayListToDelete = new ArrayList<>();
        arrayListToDelete.add(25);
        arrayListToDelete.add(28);
        System.out.println(arrayListToDelete);

        Collection collection2 = new ArrayList<>();
        collection2.add(8);
        collection2.add(9);
        System.out.println(myGenericDynamicArray);
        myGenericDynamicArray.removeAll(collection2);
        System.out.println(myGenericDynamicArray);

        //subList() -> returns a portion of the arraylist
        System.out.println(myGenericDynamicArray.subList(3, 7));

        // set() -> replace the single element from an arraylist
        myGenericDynamicArray.set(3, 99);
        System.out.println(myGenericDynamicArray);

        // removeRange() -> removes a portion of the arraylist
        System.out.println();
        myGenericDynamicArray.removeRange(0, 6);
        System.out.println(myGenericDynamicArray);

        //trimToSize() -> trims the capacity of arraylist equal to the size
        myGenericDynamicArray.trimToSize(10);
        System.out.println(myGenericDynamicArray);

        //replaceAll() -> replace all elements from the arraylist
        System.out.println(myGenericDynamicArray);
        myGenericDynamicArray.replaceAll(4, 44);
        System.out.println(myGenericDynamicArray);

        //addByIndex() -> adds new value without replacing
        System.out.println(myGenericDynamicArray);
        myGenericDynamicArray.addByIndex(3, 333);
        System.out.println(myGenericDynamicArray);

        //addAllByIndex() -> adds new values without replacing
        System.out.println(myGenericDynamicArray);
        String[] str = {"first", "second"};
        myGenericDynamicArray.addAllByIndex(3,str);
        System.out.println(myGenericDynamicArray);


        //toString1() -> converts the arraylist into a String
        System.out.println(myGenericDynamicArray.toString1());

    }
}
