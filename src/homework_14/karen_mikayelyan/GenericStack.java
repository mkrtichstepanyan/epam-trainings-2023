package homework_14.karen_mikayelyan;

public class GenericStack<T> {
    private Object[] stack;

    private int index;

    public GenericStack() {
        this.stack = (T[]) new Object[10];
        this.index = -1;
    }

    public GenericStack(int size) {
        this.stack = (T[]) new Object[size];
        this.index = -1;
    }

    public void push(T item) {
        if (index > stack.length * 0.75) {
            extendCapacity(item);
        } else {
            stack[++index] = item;
        }
    }

    private void extendCapacity(T item) {
        Object[] newStack = new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
        stack[++index] = item;
    }


    public T pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return (T) stack[index--];
        }
    }
}
