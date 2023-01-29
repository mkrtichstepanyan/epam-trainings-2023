package homework_4.Samvel_Hakobyan.stack;

public class Stack {
    private Integer[] arr;
    private int cursor;


    public Stack(int capacity) {
        this.arr = new Integer[capacity];
    }

    private int cursor() {
        return this.cursor;
    }

    public boolean isEmpty() {
        return this.cursor == 0;
    }

    public boolean isFully() {
        return this.cursor == this.arr.length;
    }

    public void push(int value) {
        if (this.isFully()) {
            System.err.println("Error Stack is Fully! " + value);
            return;
        }
        this.arr[this.cursor++] = value;
    }


    public Integer pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is Empty");
            return null;

        }
        return this.arr[--this.cursor];
    }


    public Integer scanAndIncrease() {
        if (cursor >= (arr.length * 75) / 100) {

            System.out.println("Stack is reached 75%");
            Integer[] newarr = new Integer[arr.length + 1 * 2];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        return null;
    }

}

