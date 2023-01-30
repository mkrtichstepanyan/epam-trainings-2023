package homework_4.garik_gharibyan.stack;

public class Stack {

    private static final int DEFAULT_SIZE = 10;

    private int topItem;

    private int[] arrayStack;

    public Stack() {
        arrayStack = new int[DEFAULT_SIZE];
        topItem = -1;
    }

    public Stack(int arraySize) {
        arrayStack = new int[arraySize];
        topItem = -1;
    }

    public int getTopItem() {
        return topItem;
    }

    public int[] getArrayStack() {
        return arrayStack;
    }

    public void push(int number) {

        if (topItem > ((75 * arrayStack.length) / 100) - 2) {
            extendCapacity();
        }
        arrayStack[++topItem] = number;
    }

    public int pop() {
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

    private void extendCapacity(){
        int[] newArrayStack = new int[arrayStack.length * 2];
        for (int i = 0; i < arrayStack.length; i++) {
            newArrayStack[i] = arrayStack[i];
        }
        arrayStack = newArrayStack;
    }
}
