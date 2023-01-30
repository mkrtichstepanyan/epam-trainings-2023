package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class Stack {
    private int[] stck_ = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is Full.");
        } else {
            stck_[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }else {
            return stck_[tos--];
        }
    }
}

