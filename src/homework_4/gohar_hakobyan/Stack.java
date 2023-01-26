package homework_4.gohar_hakobyan;

public class Stack {
    private int[] stack;
    private int top;
    private int size;

    //Դefault constructor
    public Stack() {
        this.size = 10;
        stack = new int[this.size];
        top = -1;
    }

    //Overloaded Constructor
    public Stack(int size) {
        this.size = size;
        stack = new int[this.size];
        top = -1;
    }

    //Push method
    public void push(int element) {
        if (top == size - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++top] = element;
        }
        if (top > 0.75 * size) {
            int[] newStack = new int[size * 2];
            if (size >= 0) {
                System.arraycopy(stack, 0, newStack, 0, size);
            }
            stack = newStack;
            size *= 2;
        }
    }

    //Pop method
    public Integer pop() {
        if (top < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[top--];
        }
    }
}


