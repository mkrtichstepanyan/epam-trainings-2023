package homework_16.aram_mehrabyan;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {5, 10, 50, 9};
        int[] a = {90, 55, 75};
        int[] b = {6, 7, 5};
        DynamicArray myDynamicArray = new DynamicArray(5);

        for (int i = 0; i < 4; i++) {
            myDynamicArray.add(i);
        }

        myDynamicArray.addAll(arr);
        for (int i = 0; i < myDynamicArray.getSize(); i++) {
            System.out.println(myDynamicArray.get(i));
        }


        //myDynamicArray.add(3, 80);
       // myDynamicArray.toString();
        myDynamicArray.addAllByIndex(3, a);
        System.out.println();
        //myDynamicArray.sublist(10, 15);
        //myDynamicArray.remove(3);
       // myDynamicArray.set(90, 5);
        //myDynamicArray.sort();

        //myDynamicArray.removeAll(a);

       // myDynamicArray.indexOf(50);

/*
        for (int i = 0; i < myDynamicArray.getSize(); i++) {
            if (myDynamicArray.contains(30)) {
                System.out.println("Contains");
                break;
            } else {
                System.out.println("Doesn't contain");
                break;
            }

        }
        */

       // myDynamicArray.removeRange(5, 8);
       // myDynamicArray.containsAll(b);
       // myDynamicArray.clear();


    }

}
