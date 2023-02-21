package homework_4.Karen_Mikayelyan.chapter_7;

public class Stack1 {
    private int[] stck = new int[10];
    private int tos;

    Stack1() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}
