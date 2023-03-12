package homework_8.Radik_manasyan.chapter9;

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Cтeк заполнен.");
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
