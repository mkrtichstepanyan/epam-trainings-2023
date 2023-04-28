package homework_17.Ani_Barseghyan.linked_list_book;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        System.out.println(treeSet);

        System.out.println(treeSet.subSet("C", "F"));
    }
}
