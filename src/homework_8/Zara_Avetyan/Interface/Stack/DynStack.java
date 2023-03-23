package homework_8.Zara_Avetyan.Stack;

public class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }


    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            System.arraycopy(stck, 0, temp, 0, ++tos);
            stck = temp;
            stck[tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}