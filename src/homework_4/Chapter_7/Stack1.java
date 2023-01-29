package homework_4.Chapter_7;

public class Stack1 {

    private int[] stck;
    private int tos;

    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full ");
        } else {
            stck[++tos] = item;
        }

    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow. ");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
