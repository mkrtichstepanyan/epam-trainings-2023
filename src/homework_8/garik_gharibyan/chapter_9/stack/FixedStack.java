package homework_8.garik_gharibyan.chapter_9.stack;

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void pus(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("stack underflow.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
