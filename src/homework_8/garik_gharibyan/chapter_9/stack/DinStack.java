package homework_8.garik_gharibyan.chapter_9.stack;

public class DinStack implements IntStack {
    private int[] stack;
    private int tos;

    DinStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void pus(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++tos] = item;
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

    @Override
    public int[] popNElements(int n) {
        return IntStack.super.popNElements(n);
    }

    @Override
    public int[] skipAndPopNElements(int skip, int n) {
        return IntStack.super.skipAndPopNElements(skip, n);
    }
}
