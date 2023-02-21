package homework_4.Nona_Asatryan.task;

public class Stack {
    private int[] stack;
    private int size;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    public Stack() {
        this.stack = new int[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        this.top = -1;
    }

    public Stack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int element) {
        stack[++top] = element;
        if (top >= 0.75 * size) {
            System.out.println("Stack is full up to 75%.");
            int[] newStack = new int[size * 2];
            System.arraycopy(stack, 0, newStack, 0, size);
            System.out.println("New stack is created.");
            stack = newStack;
            size *= 2;
        }
    }

    public Integer pop() {
        if (top == -1) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[top--];
        }
    }
}
