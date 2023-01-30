package homework_4.Lilit_Adamyan.StackTasks;

import java.util.Arrays;

public class Stack {
    private int[] stack;
    private int tos;
    private int size = 10;


    public Stack() {
        stack = new int[10];
        tos = -1;
    }

    public Stack(int size) {
        this.size = size;
        stack = new int[this.size];
        tos = -1;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //    overloaded constructor
    public void push(int item) {
        if (tos == size - 1) {
            System.out.println("Stack is already full!");
        } else
            stack[++tos] = item;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[tos--];
        }
    }

}
