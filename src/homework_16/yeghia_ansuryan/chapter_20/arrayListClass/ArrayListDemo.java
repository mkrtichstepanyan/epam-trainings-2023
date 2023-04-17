package homework_16.yeghia_ansuryan.chapter_20.arrayListClass;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size of al after additions: " + al.size());

        System.out.println("Contents ofal: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());

        System.out.println("Contents of al: " + al);
    }
}
