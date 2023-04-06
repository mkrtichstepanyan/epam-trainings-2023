package homework_16.yeghia_ansuryan.dynamicArray;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);

//        ArrayList

        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Printed array" + " " + myDynamicArray);
        System.out.println("--------------------");

        int[] dell = {3, 0, 8, 3, 0, 4};

        System.out.print("Printed dell: ");
        for (int i = 0; i < dell.length; i++) {
            System.out.print(dell[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        myDynamicArray.addAll(dell);
        System.out.println("Printed addAll method" + " " + myDynamicArray);
        System.out.println("---------------------");

        System.out.print("Printed clone method" + " ");
        for (int i = 0; i < myDynamicArray.clone().length; i++) {
            System.out.print(myDynamicArray.clone()[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        System.out.println("Printed contains method" + " " + myDynamicArray.contains(3));
        System.out.println("---------------------");

        System.out.println("Printed containsAll method" + " " + myDynamicArray.containsAll(dell));
        System.out.println("---------------------");

        System.out.println("Printed indexof method" + " " + myDynamicArray.indexOf(8));
        System.out.println("---------------------");

        System.out.println("Printed remove method" + " " + myDynamicArray.remove(4));
        System.out.println("---------------------");

        System.out.println("Printed removeAll method" + " " + myDynamicArray.removeAll(3));
        System.out.println("---------------------");

        System.out.println("Printed isEmpty method" + " " + myDynamicArray.isEmpty());
        System.out.println("--------------------");

        System.out.print("Printed subList method" + " ");
        int[] n = myDynamicArray.subList(1, 3);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        System.out.println("Printed set method" + " " + myDynamicArray.set(35, 2));
        System.out.println("--------------------");

        System.out.println(myDynamicArray);
        myDynamicArray.sort();
        System.out.println("Printed sort method" + " " + myDynamicArray);
        System.out.println("--------------------");

        System.out.println("Printed toString method" + " " + myDynamicArray);
        System.out.println("--------------------");

        for (int i = 0; i < myDynamicArray.getArray().length; i++) {
            System.out.print(myDynamicArray.getArray()[i] + " ");
        }
        System.out.println();
        myDynamicArray.trimToSize();
        System.out.println("Printed trimToSize method" + " " + myDynamicArray);
        System.out.println("---------------------");

        System.out.println(myDynamicArray);
        myDynamicArray.removeRange(2, 5);
        System.out.println("Printed removeRange method" + " " + myDynamicArray);
        System.out.println("---------------------");

        int[] hp = {6, 9, 3};
        myDynamicArray.replaceAll(hp);
        System.out.println("Printed replaceAll method" + " " + myDynamicArray);
        System.out.println("---------------------");

        myDynamicArray.clear();
        System.out.println("Printed clear method" + " " + myDynamicArray);
        System.out.println("---------------------");

    }
}
