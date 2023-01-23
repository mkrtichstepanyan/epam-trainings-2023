package homework_4.Rafik_Pahlevanyan.chapter_6;

//This class defines an integer stack that can hold 10 values
public class Stack {
    int[] stck = new int[10];
    int tos;

    //Initialize top-of-stack
    Stack() {

        tos = (int) -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (tos == stck.length)
            System.out.println("Stack is full. ");
        else
            stck[++tos] = item;
    }

    //Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow. ");
            return 0;
        } else
            return stck[tos--];
    }
}
