package homework_8.karen_mikayelyan.chapter_9;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
                stck = temp;
            }
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.print("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
