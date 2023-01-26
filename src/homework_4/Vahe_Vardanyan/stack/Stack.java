package homework_4.Vahe_Vardanyan.stack;

public class Stack {int[] arr;
    int cursor;

    Stack(int capacity) {
        this.arr = new int[capacity];
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

        void push (int item) {
            if ()
        }
    }
}
