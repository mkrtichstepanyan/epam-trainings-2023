package homework_4.Levon_Harutyunyan.Stack;

public class Stack {
    int[] stack;

    int index;
    int size;


    Stack () {
        this.stack = new int[10];
        this.index = -1;
    }

    Stack (int size) {
        this.size = size;
        this.stack = new int[size];
        this.index = -1;
    }

    void push(int element) {

        if (index == 9) {
            System.out.println("The stack is already full!");
        } else {
            stack[++index] = element;
        }
    }

    void push1(int element){
        if (index == size) {
            System.out.println("The stack is already full!");
        } else {
            stack[++index] = element;
        }
    }

    int pop(int i) {

        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stack[index--];
        }
    }
}

