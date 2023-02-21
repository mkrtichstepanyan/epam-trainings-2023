package homework_7.Anna_Manukyan.chapter_8.interfaceExample.stack;

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == (stck.length - 1)) {
            System.out.println("Stack is full.");
        }
        stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        }
        return stck[tos--];
    }
}
