package homework_4.garik_gharibyan.stack;

import java.util.ArrayList;

public class Stack {

    public int[] arrayStack;

    boolean isFull;

    int noZero = 0;

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
            noZero++;
        }
        if (noZero > 0.75 * arrayStack.length){
            int[] newArrayStack = new int[arrayStack.length * 2];
            for (int i = 0; i < arrayStack.length; i++) {
                newArrayStack[i] = arrayStack[i];
            }
            arrayStack = newArrayStack;
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
