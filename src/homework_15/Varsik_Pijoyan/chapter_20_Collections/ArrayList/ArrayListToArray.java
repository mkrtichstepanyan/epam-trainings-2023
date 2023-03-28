package homework_15.Varsik_Pijoyan.chapter_20_Collections.ArrayList;

import java.util.*;
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Adding elements to the array list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Contents of arrayList: " + arrayList);

        //Get the array
        Integer[] ia = new Integer[arrayList.size()];
        ia = arrayList.toArray(ia);

        int sum = 0;
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
