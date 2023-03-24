package homework_14.Anush_Ananyan.Stack;

public class Stack<T> {
    private Object[] stack;
    private int tos;


    public Stack(int size) {
        this.stack = (T[]) new Object[size];
        this.tos = -1;
    }

    public void push(T item) {
        if (tos == stack.length * 75 / 100) {
            extendVolume();
        }
        stack[++tos] = item;
    }

    public T pop() {
        if (tos < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return (T) stack[tos--];
        }
    }

    private void extendVolume() {
        Object[] newStack = new Object[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

}
