package homework_4.Armen_Martirosyan.Stack;

public class Stack {
    private int[] array = new int[10];
    private int size;


    public Stack() {
        size = 0;
    }

    public void push(int value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        }
        array[size] = value;
        size++;
    }

    public int pop() {
        int result;
        if (size == 0) {
            System.out.println("Stack is empty ");
        }
        result = array[size - 1];
        array[size - 1] = 0;
        size--;
        return result;
    }

    public int peek() {
        int value;
        value = array[size - 1];
        return value;
    }

    public void show() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
