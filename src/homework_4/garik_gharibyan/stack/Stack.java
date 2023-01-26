package homework_4.garik_gharibyan.stack;

import java.util.ArrayList;

public class Stack {

    public int[] arrayStack;

    boolean isFull;

    public Stack(int arraySize) {
        arrayStack = new int[arraySize];

    }

    void push(int number) {

        isFull = true;

        for (int i = 0; i < arrayStack.length; i++) {
            if (arrayStack[i] == 0) {
                arrayStack[i] = number;
                isFull = false;
                break;
            }
        }

        if (isFull) {
            System.out.println("The stack is already full!");
        }
    }

    int pop() {
        for (int i = arrayStack.length - 1; i >= 0; i--) {
            if (arrayStack[i] != 0) {
                return arrayStack[i];
            }
        }
        System.out.println("The stack is empty!");
        return 0;
    }

}
