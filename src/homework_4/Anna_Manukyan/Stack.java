package homework_4.Anna_Manukyan;


import java.util.Arrays;

//Implementation of stack class
public class Stack {
    private int top;
    private int[] stack;
    private int count;
    private int capacity;

    Stack() {
        top = -1;
        stack = new int[10];
    }
    Stack(int size) {
        top = -1;
        stack = new int[size];
        capacity = size;
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

    public boolean isFullRef() {
        if (top > stack.length * 0.75 - 1) {
            count++;
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
    public void pushRefactor(int element) {
        if (isFullRef()) {
            if (count > 0) {
                System.out.println("We increase stack size, because stack is fully");
                capacity = 2 * capacity;
            }
            stack = Arrays.copyOf(stack, capacity);
            stack[++top] = element;
        } else {
            stack[++top] = element;
        }

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
