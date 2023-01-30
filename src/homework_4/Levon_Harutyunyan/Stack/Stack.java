package homework_4.Levon_Harutyunyan.Stack;

public class Stack {
    private int[] stack;

    private static final int DEFAULT_SIZE = 10;
    private int index;
    private int size;
    private int multiplier = 2;


    public Stack() {
        this(DEFAULT_SIZE);
        this.index = -1;
    }

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.index = -1;
    }

    public void push(int element) {
        if (index == (stack.length * 75 / 100)) {
            extendCapacity();
        }

        stack[++index] = element;
    }

    public int pop(int i) {

        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[index--];
        }
    }

    private void extendCapacity() {

        int[] newStack = new int[multiplier * stack.length];

        for (int i = 0; i <= index; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

}

