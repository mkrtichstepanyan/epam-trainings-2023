package homework_4.Roza_Petrosyan.chapter_7;

// improved stack class that uses the length array member.
public class Stack2 {
    private int[] stck = new int[10];
    private int tos;

    // allocate and initialize stack
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) { // use length number
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
