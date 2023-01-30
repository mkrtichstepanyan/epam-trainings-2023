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
        if (index > stack.length * 0.75) {
            extendCapacity(item);
        } else {
            stack[++index] = item;
        }
    }

    public void extendCapacity(int item) {
        int[] newStack = new int[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
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
