package homework_14.anna_manukyan.Stack;

public class DynStack<T> implements IntStack<T> {
    private T[] stck;
    private int tos;

    public DynStack(int size) {
        stck = (T[]) new Object[size];
        tos = -1;
    }

    @Override
    public void push(T item) {
        if (tos == (stck.length - 1)) {
            T[] tmp = (T[]) new Object[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                tmp[i] = stck[i];
            }
            stck = tmp;
            stck[++tos] = item;
        }
        stck[++tos] = item;
    }

    @Override
    public T pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow");
        }
        return stck[tos--];
    }
}
