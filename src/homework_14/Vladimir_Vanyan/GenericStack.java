package homework_14.Vladimir_Vanyan;

public class GenericStack<T> {
    private T[] array;
    private int size;
    private int top;

    public GenericStack(int size) {
        this.size = size;
        array=(T[])new Object[size];
        top = -1;
    }

    public void push(T element) {

        if (top == size - 1) {
            System.out.println("Stack is full");
            System.exit(-1);
        }
        array[++top] = element;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            System.exit(-1);
        }
        return array[top--];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

