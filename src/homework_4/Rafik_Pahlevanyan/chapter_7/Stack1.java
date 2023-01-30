package homework_4.Rafik_Pahlevanyan.chapter_7;

//Improved Stack class that uses the length array member
public class Stack1 {
    private int[] stck;
    private int tos;

    //allocate and initialize stack
    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) { // use length member
            System.out.println("Stack is full ");
        } else {
            stck[++tos] = item;
        }

    }

    //Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow. ");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
