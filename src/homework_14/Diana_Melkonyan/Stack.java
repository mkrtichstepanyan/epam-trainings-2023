package homework_14.Diana_Melkonyan;

public class Stack<T> {

    private int size;
    private T[] stackAr;
    private int index;

    public Stack(int size) {
        this.size = size;
        stackAr = (T[])new Object[size];
        index = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Cannot push "+value+", Stack is full");
        }
        stackAr[++index] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stackAr[index--];
    }


    public boolean isFull() {
        return (index == size - 1);
    }

    public boolean isEmpty() {
        return (index == -1);
    }

}
