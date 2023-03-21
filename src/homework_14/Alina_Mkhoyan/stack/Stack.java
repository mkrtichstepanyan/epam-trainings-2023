package homework_14.Alina_Mkhoyan.stack;


public class Stack<T> {
    static final int DEFAULT_SIZE = 16;
    private Object[] data;
    private int tos = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new Object[size];
    }

    public T push(T value)  {
        if (tos >= data.length - 1) {
            ensureCapacity();
        }
        data[++tos] = value;
        return value;
    }

    public T pop()  {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        } else {
            return (T) data[tos--];
        }
    }

    public void clear() {
        this.tos = -1;
    }

    public boolean isEmpty() {
        if (this.tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    private void ensureCapacity() {
        Object[] newData = new Object[this.data.length * 2];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}