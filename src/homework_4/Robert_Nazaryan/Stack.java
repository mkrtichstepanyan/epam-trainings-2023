package homework_4.Robert_Nazaryan;

public class Stack {

    int[] stack;
    int tos;
    int size = 10;

    Stack() {
        tos = -1;
        stack = new int[size];
    }

    Stack(int s) {

        size = s;
        tos = -1;
        stack = new int[size];
    }

    void push(int item) {

        if (tos == size - 1) {

            System.out.println("Stack is full.");
        } else {

            stack[++tos] = item;
        }
    }

    int pop() {

        if (tos == -1) {

            System.out.println("The stack is empty!");
            return 0;
        } else {

            return stack[tos--];
        }
    }

}
