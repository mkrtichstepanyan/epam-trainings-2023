package homework_8.shushanik_araqelyan_chapter9;

public class FixedStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public int push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full.");

            stck[++tos] = item;
        }
        // public int pop(){
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}

