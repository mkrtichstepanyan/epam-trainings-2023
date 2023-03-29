package homework_15.garik_gharibyan.chapter_20;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> as = new ArrayDeque<>();
        as.push("A");
        as.push("B");
        as.push("D");
        as.push("E");
        as.push("F");
        System.out.print("Popping the stack: ");
        final String peek = as.peek();

        while (as.peek() != null){
            System.out.print(as.pop() + " ");
        }
    }
}
