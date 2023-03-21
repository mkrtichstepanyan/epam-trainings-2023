package homework_14.robert_nazaryan;

public class Stack<T> {

    private T[] stack;
    private int index;
    private int length = 10;

    public Stack() {
        index = -1;
        stack = (T[]) new Object[length];
    }

    public Stack(int l) {

        length = l;
        index = -1;
        stack = (T[]) new Object[length];
    }

    public void push(T item) {

        if (index >= 0.75 * length) {
            extendCapacity();
        }
        stack[++index] = item;
    }

    public T pop() {

        if (index == -1) {

            System.out.println("The stack is empty!");
            return null;
        } else {

            return stack[index--];
        }
    }

    private void extendCapacity() {

        T[] newStack = (T[]) new Object[2 * stack.length];
        for (int i = 0; i <= index; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        this.length = newStack.length;
    }

    public int getLength() {
        return this.length;
    }
}
