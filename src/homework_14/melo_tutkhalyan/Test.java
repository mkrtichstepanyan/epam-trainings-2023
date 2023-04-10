package homework_14.melo_tutkhalyan;

import homework_14.melo_tutkhalyan.StackWithGenerics.ArrayStack;
import homework_14.melo_tutkhalyan.StackWithGenerics.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new ArrayStack(3);

        stack.push(10);
        System.out.println(stack.pop());
    }
}
