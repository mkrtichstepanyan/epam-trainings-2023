package homework_4_1.task;

public class Stack1 {

    private int[] stack;
    private int top;
    private int size;

    public Stack1() {
        this.size = 10;
        this.stack = new int[size];
        this.top = -1;
    }

    public Stack1(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;

    }

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++top] = element;
            System.out.println("Added in stack: " + element);
            if (top >= 0.75 * size) {
                System.out.println("Stack is reached 75%");
                int newSize = size * 2;
                int[] newStack = new int[newSize];
                System.arraycopy(stack, 0, newStack, 0, size);
                System.out.println("Created new stack");
                stack = newStack;
                size = newSize;
            }
        }
    }


    public Integer pop() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return null;
        } else {
            return stack[top--];
        }

    }
}





