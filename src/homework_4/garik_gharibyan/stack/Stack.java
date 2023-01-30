package homework_4.garik_gharibyan.stack;

import java.util.ArrayList;

public class Stack {

    int topItem = -1;

    public int[] arrayStack;

    Stack() {
        arrayStack = new int[10];
    }

    public Stack(int arraySize) {

        arrayStack = new int[arraySize];

    }

    void push(int number) {

        if (topItem > ((75 * arrayStack.length) / 100) - 2) {
            int[] newArrayStack = new int[arrayStack.length * 2];
            for (int i = 0; i < arrayStack.length; i++) {
                newArrayStack[i] = arrayStack[i];
            }
            arrayStack = newArrayStack;
        }
        arrayStack[++topItem] = number;
    }

    int pop() {
        if (topItem < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            int topElement = arrayStack[topItem];
            arrayStack[topItem] = 0;
            topItem--;
            return topElement;
        }
    }
}
