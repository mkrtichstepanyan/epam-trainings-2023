package homework_4.Ani_Barseghyan.Stack;

public class Stack {
    private int[] stackArray;
    private int top;
    int size;
    private static final int DEFAULT_SIZE = 10;

    Stack(int length) {
        this.size = length;
        this.stackArray = new int[size];
        this.top = -1;
    }

    Stack() {
        this(DEFAULT_SIZE);
        this.size = DEFAULT_SIZE;
        this.top = -1;
    }

    public void push(int element) {
        if (top > stackArray.length * 0.75 - 1) {
            extendStack();
        }
        stackArray[++top] = element;
    }

    public void extendStack() {
        int[] newArray = new int[2 * stackArray.length];
        for (int i = 0; i <= top; i++) {
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
