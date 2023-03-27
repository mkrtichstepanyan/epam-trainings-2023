package homework_14.garik_gharibyan.stack_generic;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private static final int DEFAULT_SIZE = 10;

    private int topItem;

    private T[] arrayStack;

    public Stack() {
        arrayStack = (T[]) new Object[DEFAULT_SIZE];
        topItem = -1;
    }

    public Stack(int arraySize) {
        arrayStack = (T[]) new Object[arraySize];
        topItem = -1;
    }

    public int getTopItem() {
        return topItem;
    }

    public Object[] getArrayStack() {
        return arrayStack;
    }

    public void push(T t) {

        if (topItem > ((75 * arrayStack.length) / 100) - 2) {
            extendCapacity();
        }
        arrayStack[++topItem] = t;
    }

    public T pop() throws InvalidCountArrayException {
        if (topItem < 0) {
            System.out.println("The stack is empty!");
            throw new InvalidCountArrayException();
        } else {
            T topElement = arrayStack[topItem];
            arrayStack[topItem] = null;
            topItem--;
            return topElement;
        }
    }


    private void extendCapacity() {
        T[] newArrayStack =(T[]) new Object[arrayStack.length * 2];
        for (int i = 0; i < arrayStack.length; i++) {
            newArrayStack[i] = arrayStack[i];
        }
        arrayStack = newArrayStack;
    }
}
