package homework_4.Vahe_Vardanyan.homework_4_1.stack2;

public class Stack2 {
    private int length=10;
    private int[] arr = new int[length];
    private int size = -1;

    public Stack2() {
    }

    public Stack2(int length) {
        this.length = length;
    }


    public boolean isEmpty() {
        return size < 0;
    }

    public boolean isFully() {
        return size == length;
    }

    public void push(int value) {
        if (isFully()) {
            System.out.println("The stack is already full!");
        } else {
            arr[++size] = value;
            if (size >= length * 75 / 100) {
                extend();
            }

        }

    }


    public Integer pop() {
        if (isEmpty()) {
            System.err.println("Error Stack is Empty");
            return null;
        }
        return arr[size--];
    }


    private void extend() {
        System.out.println("Stack is reached 75%");
        int [] newarr = new int[arr.length  * 2];
        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr=newarr;
        length = newarr.length;

    }
}




