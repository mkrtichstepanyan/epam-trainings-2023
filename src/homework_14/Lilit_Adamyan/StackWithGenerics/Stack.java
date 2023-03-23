package homework_14.Lilit_Adamyan.StackWithGenerics;

public class Stack<T> {
    private T[] stack;
    private int tos;
    private int size;


    public Stack() {
        size = 10;
        stack = (T[]) new Object[size];
        tos = -1;
    }


    public Stack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        tos = -1;
    }

    public void push(T item) {
        if (tos == size - 1) {
            System.out.println("Stack is already full!");
        } else {
            stack[++tos] = item;
        }
    }

    public T pop() {
        if (tos == -1) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return stack[tos--];
        }
    }
}