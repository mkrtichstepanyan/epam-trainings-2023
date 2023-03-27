package homework_14.araksya_ghazaryan.Gen;

import java.util.NoSuchElementException;

public class Stack<T>{
    private Object[] elements;
    private int size;

    public Stack() {
        elements = new Object[10];
        size = 0;
    }

    public void push(T item) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = item;
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        @SuppressWarnings("unchecked")
        T result = (T) elements[size - 1];
        elements[size - 1] = null;
        size--;
        return result;
    }
}
