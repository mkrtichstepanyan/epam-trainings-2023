package homework_14.Nona_Asatryan.genericStack;

public class GenericStack<T> {
    private T[] stackArray;
    private int size;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    public GenericStack(int size) {
        this.size = size;
        this.stackArray = (T[]) new Object[size];
        this.top = -1;
    }

    public GenericStack() {
        this.stackArray = (T[]) new Object[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        this.top = -1;
    }

    public void push(T element) {
        stackArray[++top] = element;
        if (top >= 0.75 * size) {
            System.out.println("Stack is full up to 75%.");
            T[] newStack = (T[]) new Object[size * 2];
            System.arraycopy(stackArray, 0, newStack, 0, size);
            System.out.println("New stack is created.");
            stackArray = newStack;
            size *= 2;
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stackArray[top--];
        }
    }
}
