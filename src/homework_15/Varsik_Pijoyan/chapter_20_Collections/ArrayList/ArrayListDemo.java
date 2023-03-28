package homework_15.Varsik_Pijoyan.chapter_20_Collections.ArrayList;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("Initial size of arrayList is: " + arrayList.size());

        //Adding elements to the array list
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");

        System.out.println("Size of arrayList after additions: " + arrayList.size());

        //Displaying the array list
        System.out.println("Contents of arrayList: " + arrayList);

        //Removing elements from the array list
        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Size of arrayList after deletions: " + arrayList.size());
        System.out.println("Contents of arrayList: " + arrayList);
    }
}
