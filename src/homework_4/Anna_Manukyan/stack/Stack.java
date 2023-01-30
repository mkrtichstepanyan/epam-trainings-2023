package homework_4.Anna_Manukyan.stack;

import java.util.Arrays;

//Implementation of stack class
public class Stack {
    private int top;
    private int[] stack;
    private int capacity;
    private static final int DEFAULT_SIZE = 10;

    Stack() {
        stack = new int[DEFAULT_SIZE];
        top = -1;
    }

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    //This method checks is empty stack or not
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }


    //This method checks is full stack or not
    public boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        }
        return false;
    }

    public boolean extendIsFull() {
        if (top == stack.length * 75/100) {
            return true;
        }
        return false;
    }

    //This method add element in stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("The stack is already full");
            System.exit(1);
        }
        stack[++top] = element;
    }

    /*This method add element in stack
      If stack size is less than top, then increase stack size
    */
    public void extendPush(int element) {
        if (extendIsFull()) {
            capacity = stack.length;
            stack = Arrays.copyOf(stack, 2 * capacity);

        }
            stack[++top] = element;
    }

    //This method remove elements from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            System.exit(1);
        }
        return stack[top--];
    }

    //This method print stack elements
    public void printStack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + ", ");
        }
    }
}
