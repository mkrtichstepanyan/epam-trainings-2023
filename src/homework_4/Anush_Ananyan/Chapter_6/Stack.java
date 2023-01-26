package homework_4.Anush_Ananyan.Chapter_6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }


    Stack(int l) {
        int[] stck = new int[l];
    }

    void push(int item) {
        if (tos == 9) {
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