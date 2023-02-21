package homework_4.Andranik_Sargsyan.chapter_6.stack;

public class Stack {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int index;

    public Stack(int size) {
        this.arr = new int[size];
        this.index = -1;
    }

    public Stack() {
        this(DEFAULT_SIZE);
        this.index = -1;
    }

    public void push(int item) {
        if (index == arr.length * 75 / 100) {
            extendCapacity();
        }
        arr[++index] = item;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return arr[index--];
        }
    }

    private void extendCapacity() {
        int[] newArr = new int[2 * arr.length];
        for (int i = 0; i <= index; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
