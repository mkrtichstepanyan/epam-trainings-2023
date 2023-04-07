package homework_16.Roza_Petrosyan.chapter_20.arrays_deque;

import java.util.ArrayDeque;

public class ArraysDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.print("Popping the stack: ");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
