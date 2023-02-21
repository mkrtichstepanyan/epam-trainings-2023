package homework_4.Lilit_Adamyan.chapter_6;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {

        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {

            return 0;
        } else {
            return stack[tos--];

        }
    }
}


