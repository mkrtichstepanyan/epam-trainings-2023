package homework_4.Anush_Ananyan.Chapter_6;

public class Stack {
    int[] stck;
    int tos;

    Stack() {
        stck = new int[10];
        tos = -1;
    }

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("The stack is already full!");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}