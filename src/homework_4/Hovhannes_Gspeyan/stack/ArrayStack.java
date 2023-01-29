package homework_4.Hovhannes_Gspeyan.stack;

public class ArrayStack {

    private int[] arr;
    private int size;

    public ArrayStack(int capacity) {
        this.arr = new int[capacity];
    }
    public boolean isEmpty() {
        return this.size() == 0;
    }
    public boolean isFully() {
        return this.size == arr.length;
    }
    public void push(int value) {
        if (this.isFully()) {
            System.out.println("Error stack is fully! ");
            return;
        }
        this.checkAndGrow();
        this.arr[this.size++] = value;
    }
    public int pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is empty");
            return -1;
        }
        return this.arr[--this.size];
    }
    private int size() {
        return this.size;
    }
    private void checkAndGrow() {
        if (this.size + 1 >= (arr.length * 75) / 100) {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }
}
