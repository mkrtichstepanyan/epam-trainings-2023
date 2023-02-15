package homework_4.Eduard_Eghiazaryan.Stack;

public class Stack {

    int[] stack = new int[10];
    int index;
    int size;

    Stack() {

        index = -1;
        size = 10;

    }

    void push(int item) {
        if (index == 9)
            System.out.println("The stack is already full!");

        else
            stack[++index] = item;
    }

    int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else
            return stack[index--];


    }

    private void extendStack() {
        int[] newStack = new int[2 * stack.length];
        if (size >= 0) {
            System.arraycopy(stack, 0, newStack, 0, index + 1);
        }
        stack = newStack;
        size *= 2;
    }
}