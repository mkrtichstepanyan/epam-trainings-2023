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
        if (tos > stack.length * 0.75) {
            extendCapacity();
        }
        stack[++tos] = item;
    }

    private void extendCapacity() {
        int double_size = stack.length * 2;
        int[] double_stack = new int[double_size];
        System.arraycopy(stack, 0, double_stack, 0, stack.length);
        stack = double_stack;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
