package homework_4.Robert_Nazaryan;

public class Stack {

    Integer[] stack;
    int tos;
    int size = 10;

    Stack() {
        tos = -1;
        stack = new Integer[size];
    }

    Stack(int s) {

        size = s;
        tos = -1;
        stack = new Integer[size];
    }

    void push(int item) {

        if (tos == size - 1) {

            System.out.println("Stack is full.");
        } else {

            stack[++tos] = item;
        }
    }

    Integer pop() {

        if (tos == -1) {

            System.out.println("The stack is empty!");
            return null;
        } else {

            return stack[tos--];
        }
    }

}
