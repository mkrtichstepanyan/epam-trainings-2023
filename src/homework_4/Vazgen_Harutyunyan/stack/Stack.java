package homework_4.Vazgen_Harutyunyan.stack;

public class Stack {
    int[] array;
    int top;
    int capacity;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\n");
            this.increaseStackCapacity();
        }
        System.out.println("Inserting " + x);
        array[++top] = x;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());

        return array[top--];
    }

    private int peek() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    private boolean isEmpty() {
        return top == -1;
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
