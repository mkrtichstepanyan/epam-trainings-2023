package homework_16.rafik_pahlevanyan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        DynamicArray firstArray = new DynamicArray();
        DynamicArray secondArray = new DynamicArray();
        List<Integer> elementsToAdd = new LinkedList<>(); //used collection

        //add all method
        elementsToAdd.add(10);
        elementsToAdd.add(11);
        elementsToAdd.add(12);
        firstArray.addAll(elementsToAdd);
        //prints array items
        System.out.println(firstArray);

        //clear method
        for (int i = 0; i < 10; i++) {
            secondArray.add(i); // add items on secondArray
        }
        System.out.println("Second Array items: " + secondArray);    //print elements
        secondArray.clear();
        System.out.println(secondArray);    //we can see that element deleted

        //clone method call

        for (int i = 0; i < 10; i++) {
            secondArray.add(i); //add items on a second array
        }
        System.out.println(secondArray.clone());

        //contains method call
        //in second array we have 0-9 numbers
        //result we can see in console
        secondArray.contains(9);
        secondArray.contains(20);

        //containsAll method call
        System.out.println("First array items: " + firstArray);
        System.out.println("Second array items: " + secondArray);
        secondArray.containsAll(firstArray);
        //now we add other items on secondArray
        secondArray.add(10);
        secondArray.add(11);
        secondArray.add(12);
        System.out.println("First array items: " + firstArray);
        System.out.println("Second array items: " + secondArray);
        secondArray.containsAll(firstArray);

        //indexOf method call
        System.out.println("First array items: " + firstArray);
        firstArray.indexOf(0);  //as we can see, in array has not 0
        firstArray.indexOf(10);

        //remove method call
        System.out.println("First array items: " + firstArray);
        firstArray.remove(5);   //Element not found
        firstArray.remove(10);
        System.out.println("First array items: " + firstArray);     //10 now deleted

        //removeAll method call
        System.out.println("First array items: " + firstArray); //in array has 2 items(11,12)
        //let's add the same item in array
        firstArray.add(11);
        firstArray.add(11);
        System.out.println("First array items: " + firstArray); // now in array has 4 items
        firstArray.removeAll(11);
        System.out.println("First array items: " + firstArray);

        //isEmpty method call
        System.out.println("First array items: " + firstArray); //has 1 item
        firstArray.isEmpty();   // we can see that array is not empty
        //let`s create another array
        DynamicArray emptyArray = new DynamicArray();
        emptyArray.isEmpty();

        //subList method call
        System.out.println("Second array items: " + secondArray);
        DynamicArray dynamicArray = secondArray.subList(3, 10);
        System.out.println(dynamicArray);

        //set method call
        System.out.println("First array items: " + firstArray);
        firstArray.set(0, 20);   //Array has only 1 element in 0 position
        System.out.println("First array items: " + firstArray);

        //sort method call
        //now let's create another array
        DynamicArray anotherArray = new DynamicArray();
        anotherArray.add(20);
        anotherArray.add(26);
        anotherArray.add(45);
        anotherArray.add(58);
        for (int i = 0; i < 5; i++) {
            anotherArray.add(i);
        }
        System.out.println("Unsorted Array: " + anotherArray);
        anotherArray.sort();
        System.out.println("Sorted Array: " + anotherArray);

        //toString method call
        int[] array = {1, 2, 3, 4, 5};
        String s = Arrays.toString(array);
        System.out.println(s);

        //trimToSize method call
        System.out.println(secondArray.getSize());  //array size is 13
        System.out.println(secondArray.getLength());    //array length is 16
        secondArray.trim();
        System.out.println(secondArray.getLength());    //now array length is 13
        System.out.println(secondArray);

        //removeRange method call
        System.out.println("Second Array items: " + secondArray);
        secondArray.removeRange(3, 8);  //from 3rd index to 8th
        System.out.println("Second Array items: " + secondArray);

        //replaceAll method call
        DynamicArray sameElements = new DynamicArray();
        sameElements.add(5);
        sameElements.add(5);
        sameElements.add(5);
        sameElements.add(5);
        sameElements.add(6);
        sameElements.add(7);
        sameElements.add(8);
        System.out.println(sameElements);
        sameElements.replaceAll(38, 13);    //in array has not 38
        sameElements.replaceAll(5, 26);
        System.out.println(sameElements);


    }
}
