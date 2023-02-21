package homework_4.Roza_Petrosyan.chapter_6;

// This class defines an integer stack that can hold 10 value
public class Stack {
    int[] stck = new int[10];
    int tos;

    // Initialize top of stack
    Stack() {
        tos = -1;
    }

    // Push an item onto the Stack
    void push(int item) {
        if(tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop an item from the Stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");

            return 0;
        } else {
            return stck[tos--];
        }
    }
}
