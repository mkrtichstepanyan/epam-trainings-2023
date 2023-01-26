package homework_4.Armen_Martirosyan.Stack;

public class Stack {
    private int[] array = new int[10];
    private int size;


    public Stack() {
    }

    public Stack(int size) {
        this.size = -1;
        this.array = new int[size];
    }

    public void push(int value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        }
        resize();
        array[size] = value;
        size++;
    }

    public int pop() {
        int result;
        if (size < 0) {
            System.out.println("Stack is empty ");
        }
        result = array[size - 1];
        array[size - 1] = 0;
        size--;
        return result;
    }

    public void resize() {
        if (size == array.length * 3 / 4) {
            int[] Array1 = new int[2 * array.length];
            for (int i = 0; i <= size; i++) {
                Array1[i] = array[i];
            }
            array = Array1;
        }
    }

    public void show() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
