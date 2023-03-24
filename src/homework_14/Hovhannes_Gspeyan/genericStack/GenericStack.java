package homework_14.Hovhannes_Gspeyan.genericStack;

public class GenericStack<T> {

    private T[] arr;
    private int size;

    public GenericStack() {
        arr = (T[]) new Object[10];
        size = -1;
    }

    public void push(T value) {
        if (isFully()) {
            checkAndGrow();
        }
        arr[++size] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[size--];
    }

    private boolean isEmpty() {
        return size == -1;
    }

    private int size() {
        return size + 1;
    }

    private boolean isFully() {
        return this.size == arr.length - 1;
    }

    private void checkAndGrow() {
        if (this.size + 1 >= (arr.length * 75) / 100) {
            T[] newArr = (T[]) new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }
}