package homework_14.Ani_Barseghyan.stack;

public class StackGeneric<Type> {
    private Type[] stackArray;
    private int top;
    private int size;
    private static final int DEFAULT_SIZE = 10;


    StackGeneric(int length) {
        this.size = length;
        stackArray = (Type[]) new Object[length];
        this.top = -1;
    }

    StackGeneric() {
        this.stackArray = (Type[]) new Object[DEFAULT_SIZE];
        this.top = -1;
    }

    public void push(Type element) {
        if (top > stackArray.length * 0.75 - 1) {
            extendStack();
        }
        stackArray[++top] = element;
    }

    public void extendStack() {
        Type[] newArray = (Type[]) new Object[2 * stackArray.length];
        for (int i = 0; i <= top; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }

    public Type pop() {
        if (top == -1) {
            System.out.println("The stack is empty!");
        }
        return stackArray[top--];
    }
}
