package homework_18.Ani_Kovalenko.chapter_20.Comparator;

import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
