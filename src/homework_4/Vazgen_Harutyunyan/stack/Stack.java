package homework_4.Vazgen_Harutyunyan.stack;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("The stack is already full!");
            this.increaseStackCapacity();
        }
        System.out.println("Inserting " + x);
        array[++top] = x;
    }

    public Integer pop() {

        if (capacity <= 0) {
            System.out.println("The stack is empty!");
            return null;
        }
        System.out.println("Removing " + array[top]);

        return array[top--];
    }

    private boolean isFull() {
        int overSize = (capacity * 75) / 100;
        return top == overSize;
    }

    private void increaseStackCapacity() {
        int[] newStack = new int[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newStack[i] = array[i];
        }
        array = newStack;
        capacity = capacity * 2;
    }

}
