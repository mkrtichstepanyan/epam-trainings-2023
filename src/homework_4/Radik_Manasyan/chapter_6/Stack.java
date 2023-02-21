package homework_4.Radik_Manasyan.chapter_6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
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
