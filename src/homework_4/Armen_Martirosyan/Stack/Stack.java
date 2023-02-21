package homework_4.Armen_Martirosyan.Stack;

public class Stack {
    private int[] array;
    protected int size;
    private int top;

    public Stack() {

    }

    public Stack(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;

    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            array[++top] = value;
            if (top >= size * 3 / 4) {
                System.out.println("Stack is full up to 75%.");
                int[] array1 = new int[2 * size];
                System.arraycopy(array, 0, array1, 0, size);
                array = array1;
                size *= 2;
            }
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty ");
            return -1;
        } else {
            return array[top--];
        }
    }
}

