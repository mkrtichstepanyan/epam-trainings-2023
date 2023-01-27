package homework_4.Vahe_Vardanyan.stack;

public class Stack {
    Integer[] arr;
    int size;

    Stack(int capacity) {
        this.arr = new Integer[capacity];
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean isFully() {
        return this.size == this.arr.length;
    }


    void push(int value) {
        if (this.isFully()) {
            System.err.println("Error Stacl is Fully " + value);
            return;
        }else{
            this.arr[this.size++] = value;
            refactor();


        }
    }

    Integer pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is Empty");
            return null;
        }
        return this.arr[--this.size];
        }
    void refactor() {
        if (size >= (arr.length * 75) / 100) {
            System.out.println("Stack is reached 75%");
            Integer[] newarr = new Integer[this.arr.length + 2];

            for (int i = 0; i < this.arr.length; ++i) {
                newarr[i] = this.arr[i];
            }
            this.arr = newarr;

        }

    }
}
