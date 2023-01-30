package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class Stack {
    private int[] stack = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Cтeк полон .");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк опустошен .");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
