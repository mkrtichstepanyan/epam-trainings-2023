package homework_4.Roza_Petrosyan.task;

public class Stack {
    private int tos;
    private int[] stack;

    protected int test;
    
    public Stack() {
        stack = new int[10];
        tos = -1;
    }

    public Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++tos] = item;
        }
    }

    public void extendCapacity(int item) {
        if (tos > stack.length * 0.75) {
            int double_size = stack.length * 2;
            int[] double_stack = new int[double_size];
            System.arraycopy(stack, 0, double_stack, 0, stack.length);
            stack = double_stack;
        }
        stack[++tos] = item;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public void setTos(int tos) {

        this.tos = tos;
    }

    public int getTos() {
        return tos;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int[] getStack() {
        return stack;
    }
}
