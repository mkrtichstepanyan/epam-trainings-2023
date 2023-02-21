package homework_4.Vahe_Vardanyan.stack;

public class Stack {
    int length;

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
        if (size == length - 1){
            System.out.println("The stack is already full!");
        }else {
            arr[++size] = value;
            if (size >= length * 75 / 100) {
                extend();
            }

        }

    }


    Integer pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is Empty");
            return null;

        }
        return this.arr[--this.size];
    }


    void extend() {


            System.out.println("Stack is reached 75%");
            Integer[] newarr = new Integer[arr.length + 1 * 2];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }

    }


