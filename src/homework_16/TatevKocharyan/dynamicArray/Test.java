package homework_16.TatevKocharyan.dynamicArray;


import homework_16.TatevKocharyan.dynamicArray.DynamicArray;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        int[] array = {55, 66, 77};

        DynamicArray dynamicArray = new DynamicArray(5);

        DynamicArray myDynamicArray = new DynamicArray(5);
        for (int i = 1; i <= 5; i++) {
            dynamicArray.add(i);
        }

        myDynamicArray.add(1);
        myDynamicArray.add(2);

        System.out.println();

        dynamicArray.containsAll(myDynamicArray);
        int i = dynamicArray.indexOf(11);
        System.out.println(i);
        dynamicArray.removeAll();
        dynamicArray.print();
        System.out.println();
        boolean empty = dynamicArray.isEmpty();
        System.out.println(empty);
        dynamicArray.toString();
        dynamicArray.subList(5, 10);
        dynamicArray.print();
        String string = dynamicArray.toString();
        System.out.println(string);
        dynamicArray.removeRange(array);
        dynamicArray.remove(2);
        System.out.println(dynamicArray);
        dynamicArray.replaceAll(array);
        dynamicArray.addByIndex(2, 55);
        dynamicArray.addAllByIndex(2, array);
        dynamicArray.set(2, 1223);
        dynamicArray.print();

    }
}
