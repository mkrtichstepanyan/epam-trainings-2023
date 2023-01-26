package homework_4.Vahe_Vardanyan.stack;

public class Stack {Integer[] arr;
    int cursor;

    Stack(int capacity) {
        this.arr = new Integer[capacity];
    }

    int Constructer() {
        return this.cursor;
    }

    boolean isEmty() {
        return this.cursor == 0;
    }

    boolean isFully() {
        return this.cursor == this.arr.length;
    }


    void push(int value) {
        if (this.isFully()) {
            System.err.println("Error Stacl is Fully " + value);
            return;
        }
        this.arr[this.cursor++] = value;
    }

    int pop() {
        if (this.isEmty()) {
            System.err.println("Error Stack is Empty");
            return -1;
        }
        return this.arr[--this.cursor];
        }
    void refactor() {
        if (cursor > (arr.length * 75) / 100) {
            System.out.println("Stack is reached 75%");
            Integer[] newarr = new Integer[arr.length + 1 * 2];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;

        }
    }
}
