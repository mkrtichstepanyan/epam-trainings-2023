package homework_4_1.chap_7;

public class Stack {
    private int[] stack;
    private int tos;

    Stack(int size) {
        stack =  new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length-1)
            System.out.println("Stack is full.");
         else {
            stack[++tos] = item;
        }
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
