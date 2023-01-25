package homework_4.Inesa_Mkrtchyan.SimpleStack;

public class MyStack {
    String[] arr;
    int size;
    int length;

    MyStack() {
        length = 10;
        arr = new String[length];
        size = -1;
    }

    MyStack(int l) {
        length = l;
        arr = new String[length];
        size = -1;
    }

    void push(String value) {
        if (size >= (length * 75) / 100) {
            String[] newArr = new String[length * 2];
            for (int i = 0; i <= size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            length *= 2;
        }
        arr[++size] = value;

    }

    String pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return arr[size--];
    }

}
