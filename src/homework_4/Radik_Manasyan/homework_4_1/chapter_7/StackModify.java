package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class StackModify {
    private int[] stck;
    private int tos;

    StackModify(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Cтeк полон.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк опустошен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
