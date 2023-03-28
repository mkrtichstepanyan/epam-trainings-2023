package homework_15.Varsik_Pijoyan.chapter_20_Collections.TreeSet;

import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        //Adding elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
