package homework_8.Hovhannes_Gspeyan.stackAndPrivIntExamples;

public class FixedStack implements IntStack {

    private int[] stcK;
    private int tos;

    public FixedStack(int size) {
        stcK = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stcK.length - 1) {
            System.out.println("stack is full ");
        } else {
            stcK[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("stack underflow ");
            return 0;
        } else {
            return stcK[tos--];
        }
    }
}
