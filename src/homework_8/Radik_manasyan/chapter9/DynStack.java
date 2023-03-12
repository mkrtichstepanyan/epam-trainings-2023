package homework_8.Radik_manasyan.chapter9;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] tmp = new int[stack.length * 2];
            System.arraycopy(stack, 0, tmp, 0, stack.length);
            stack = tmp;
            stack[++tos] = item;
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
