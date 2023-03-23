package homework_14.gohar_hakobyan.generics;

public class GenericStack<T> {
    private T[] stackArray;
    private int size;
    private int top;

    public GenericStack(int size) {
        this.size = size;
        this.stackArray = (T[]) new Object[size];
        this.top = -1;

    }

    public void push(T element) {
        if (size >= stackArray.length) {
            extend();
        } else {
            stackArray[size++] = element;
        }
    }

    public T pop() {
        if (size <= 0) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            T element = stackArray[--size];
            stackArray[size] = null;
            return element;
        }
    }

    public T peek() {
        if (size <= 0) return null;
        T t = stackArray[--size];
        return t;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == -1;
    }


    public void extend() {
        T[] newArray = (T[]) new Object[stackArray.length * 2];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

}
