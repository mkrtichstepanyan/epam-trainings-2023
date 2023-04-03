package homework_14.Inesa_Mkrtchyan;

public class MyStack<T> {
    T[] arr;
    int size;
    int length;

    MyStack() {
        length = 10;
        arr = (T[]) new Object[length];
        size = -1;
    }

    MyStack(int l) {
        length = l;
        arr = (T[]) new Object[length];
        size = -1;
    }
    boolean isEmpty(){
        return size == -1;
    }
    void push(T value) {
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

    T pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        T result = arr[size];
        arr[size--] = null;
        return result;
    }

}
