package homework_4.Roza_Petrosyan.task;

public class Stack {
    int size, tos;
    int[] stack;
    long percent;


    Stack() {
        stack = new int[10];
        tos = -1;
    }

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == size - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++tos] = item;
            percent = Math.round(size * 0.75);
            if (tos > percent) {
                int double_size = size * 2;
                int[] double_stack = new int[double_size];
                System.arraycopy(stack, 0, double_stack, 0, size);
                stack = double_stack;
                size = double_size;
            }
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
