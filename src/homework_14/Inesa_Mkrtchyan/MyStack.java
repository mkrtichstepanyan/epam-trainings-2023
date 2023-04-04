package homework_14.Inesa_Mkrtchyan;

public class MyStack<T> {
    private T[] arr;
    private int size;
    private int length;

    public MyStack() {
        length = 10;
        arr = (T[]) new Object[length];
        size = -1;
    }

    public MyStack(int l) {
        length = l;
        arr = (T[]) new Object[length];
        size = -1;
    }
    public boolean isEmpty(){
        return size == -1;
    }
    public void push(T value) {
        if (size >= (length * 75) / 100) {
            T[] newArr = (T[]) new Object[length * 2];
            for (int i = 0; i <= size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            length *= 2;
        }
        arr[++size] = value;
    }

    public T pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        T result = arr[size];
        arr[size--] = null;
        return result;
    }

    public int getSize() {
        return size;
    }

}
