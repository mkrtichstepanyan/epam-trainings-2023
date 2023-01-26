package homework_4.Hovhannes_Gspeyan.stack;

public class ArrayStack {

    int[] arr;
    int size;

    ArrayStack(int capacity) {
        this.arr = new int[capacity];
    }
    int size() {
        return this.size;
    }
    boolean isEmpty() {
        return this.size() == 0;

    }
    boolean isFully() {
        return this.size == arr.length;
    }
    void push(int value) {
        if (this.isFully()) {
            System.out.println("Error stack is fully! ");
            return;
        }
        this.checkAndGrow(1);
        this.arr[this.size++] = value;
    }
    int pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is empty");
            return -1;
        }
        return this.arr[--this.size];
    }
    void checkAndGrow(int count) {
        if (this.size + count >= (arr.length * 75) / 100) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        int value = 0;
        for (int i = 0; i < 40; i++) {
            stack.push(value++);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}
