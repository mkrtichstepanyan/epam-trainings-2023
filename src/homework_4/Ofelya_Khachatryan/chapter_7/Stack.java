package homework_4.Ofelya_Khachatryan.chapter_7;

public class Stack {
    private int[] stck;
    private int tos;

    public Stack() {
        tos = -1;
    }

    public Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
