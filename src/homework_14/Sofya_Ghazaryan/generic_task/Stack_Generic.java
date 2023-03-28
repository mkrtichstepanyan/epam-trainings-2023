package homework_14.Sofya_Ghazaryan.generic_task;

public class Stack_Generic<T> {
    private Object[] elements;
    private int top;
    private int size;

    public Stack_Generic() {
        elements = new Object[10];
        size = 0;
    }

    public void push(T item) {
        if (top >= elements.length) {
            System.out.println("The stack is already full!!!");
        } else {
            elements[++top] = item;
            System.out.println(item + " added in stack.");
            if (top >= 0.75 * elements.length) {
                System.out.println("Stack has reached 75%");
                int newSize = elements.length * 2;
                Object[] newStack = new Object[newSize];
                System.arraycopy(elements, 0, newStack, 0, size);
                System.out.println("New stack is created.");
                elements = newStack;
                size = newSize;
            }
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("The stack is empty!!!");
            return null;
        }
        return (T) elements[top--];
    }
}
