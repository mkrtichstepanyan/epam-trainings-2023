package homework_4.Qnarik_Khachatryan.chapter_6;

// This stack defines an integer stack that can hold 10 values

class Stack {
    int[] stck = new int[10];
    int tos; //index of the top of the stack

    //Initialize top-of stack
    Stack() {
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
