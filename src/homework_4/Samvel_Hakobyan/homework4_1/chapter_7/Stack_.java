package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class Stack_ {
    private int[] stck_ = new int[10];
    private int tos;

    Stack_() {
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

