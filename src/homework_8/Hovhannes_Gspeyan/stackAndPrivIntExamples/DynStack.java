package homework_8.Hovhannes_Gspeyan.stackAndPrivIntExamples;

public class DynStack implements IntStack {

    private int[] stcK;
    private int tos;

    public DynStack(int size) {
        stcK = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stcK.length - 1) {
            int[]tmp = new int[stcK.length * 2];
            System.arraycopy(stcK, 0, tmp, 0, stcK.length);
            stcK = tmp;
            stcK[++tos] = item;
        }else {
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
