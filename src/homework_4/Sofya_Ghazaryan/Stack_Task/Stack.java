package homework_4.Sofya_Ghazaryan.Stack_Task;

public class Stack {

    private int stack[];
    private int top;
    private int size;

    public Stack() {
        this.stack = new int[10];
        this.size = 10;
        this.top = -1;
    }

    public Stack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("The stack is already full!!!");
        } else {
            stack[++top] = element;
            System.out.println(element + " added in stack.");
            if (top >= 0.75 * size) {
                System.out.println("Stack has reached 75%");
                int newSize = size * 2;
                int[] newStack = new int[newSize];
                System.arraycopy(stack, 0, newStack, 0, size);
                System.out.println("New stack is created.");
                stack = newStack;
                size = newSize;
            }
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty!!!");
            return 0;
        }
        return stack[top--];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
