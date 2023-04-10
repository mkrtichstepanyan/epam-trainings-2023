package homework_14.melo_tutkhalyan.StackWithGenerics;

public class ArrayStack<E> extends AbstractStack<E> implements Stack<E> {

    private static final int DEFAULT_CAPACITY = 1024;

    private Object[] arr;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.arr = new Object[capacity];
    }

    @Override
    public void push(E value) {
        if (isFully()) {
            throw new RuntimeException("Stack is fully!");
        }
        this.arr[this.size++] = value;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        return (E) this.arr[--this.size];
    }

    @Override
    public boolean isFully() {
        return this.size == this.arr.length;
    }
}
