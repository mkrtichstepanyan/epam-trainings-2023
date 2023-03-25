package homework_14.Roza_Petrosyan.generic_stack.version_1_with_object;

public class Stack<T> {
    private int tos;
    private T[] stack;


    public Stack() {
        stack = (T[]) new Object[10];
        tos = -1;
    }

    public Stack(int size) {
        stack = (T[]) new Object[size];
        tos = -1;
    }

    public void push(T item) {
        if (tos > stack.length * 0.75) {
            extendCapacity();
        }
        stack[++tos] = item;
    }

    private void extendCapacity() {
        int doubleSize = stack.length * 2;
        T[] doubleStack = (T[]) new Object[doubleSize];
        System.arraycopy(stack, 0, doubleStack, 0, stack.length);
        stack = doubleStack;
    }

    public T pop() {
        if (tos == -1) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[tos--];
        }
    }
}
