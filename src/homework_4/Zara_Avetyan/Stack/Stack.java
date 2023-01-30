package homework_4.Zara_Avetyan.Stack;

public class Stack {
    private int[] array;
    private int size;
    private int top;


    public Stack(int size) {
        array = new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int item) {
        if (top == (size - 1)) {
            System.out.println("The stack is already full!");
        } else {
            array[++top] = item;
            if (top >= (double) size / 4 * 3) {
                int[] largeArray = new int[size * 2];
                System.arraycopy(array, 0, largeArray, 0, size);
                array = largeArray;
                size *= 2;
            }
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return array[top--];
        }
    }

}
