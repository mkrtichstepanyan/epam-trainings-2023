package homework_4.Karen_Mikayelyan.task;

public class Stack {
    private int[] stack;

    private int index;

    public Stack() {
        this.stack = new int[10];
        this.index = -1;
    }

    public Stack(int size) {
        this.stack = new int[size];
        this.index = -1;
    }

    public void push(int item) {
        if (index == stack.length - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++index] = item;
        }
    }

    public void doublePush(int item) {
        if (index > stack.length * 0.75) {
            int doubleSize = stack.length * 2;
            int[] doubleStack = new int[doubleSize];
            System.arraycopy(stack, 0, doubleStack, 0, stack.length);
            stack = doubleStack;
        }
        stack[++index] = item;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[index--];
        }
    }
}
