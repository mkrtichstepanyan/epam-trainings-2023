package homework_4.gohar_hakobyan;

public class Stack {
    private int[] stack;
    private int top;
    private int size;

    //Default constructor
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
            extendStack();
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

    private void extendStack() {
        int[] newStack = new int[2 * stack.length];
        if (size >= 0) {
            System.arraycopy(stack, 0, newStack, 0, top + 1);
        }
        stack = newStack;
        size *= 2;
    }
}


