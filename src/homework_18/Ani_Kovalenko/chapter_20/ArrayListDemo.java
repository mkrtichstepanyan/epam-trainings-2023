package homework_18.Ani_Kovalenko.chapter_20;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());


        al.add("C");
        al.add("A");
        al.add("V");
        al.add("B");
        al.add("K");
        al.add("D");
        al.add(1, "A2");

        System.out.println("Size of al after additions: " + al.size());

        System.out.println("Contents of al: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());

        System.out.println("Content of al: " + al);
    }
}
