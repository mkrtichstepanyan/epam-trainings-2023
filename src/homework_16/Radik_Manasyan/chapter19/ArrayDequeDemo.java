package homework_16.Radik_Manasyan.chapter19;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
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
