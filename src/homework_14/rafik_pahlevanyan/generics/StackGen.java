package homework_14.rafik_pahlevanyan.generics;

import java.util.NoSuchElementException;

public class StackGen <T>{
    private Object[] elements;
    private int size;

    public StackGen() {
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
