package homework_4.Ani_Barseghyan.Stack;

public class Stack {
    private int[] stackArray;
    private int top;
    int size;
    private static int defaultSize = 10;
    public int elementCount = 0;

    Stack(int length) {
        this.size = length;
        this.stackArray = new int[size];
        this.top = -1;
    }

    Stack() {
        this(defaultSize);
        this.size = defaultSize;
        this.top = -1;
    }

    public void push(int element) {
        if (elementCount >= stackArray.length * 0.75) {
            extendStack();
        }
        stackArray[++top] = element;
        elementCount++;
    }

    public void extendStack() {
        int[] newArray = new int[2 * stackArray.length];
        for (int i = 0; i < elementCount; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty!");
            return 0;
        }
        return stackArray[top--];
    }
}
