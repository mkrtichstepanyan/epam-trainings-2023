package homework_15.Varsik_Pijoyan.chapter_20_Collections.ArrayDeque;

import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        //Using an ArrayDeque like a stack
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Popping the stack: ");

        while (adq.peek() != null){
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
