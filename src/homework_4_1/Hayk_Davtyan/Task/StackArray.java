package homework_4_1.Hayk_Davtyan.Task;

public class StackArray {
    private int size;
    private int[] array;
    private int top;

    public StackArray(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int a) {
        int i = ++top;
        array[i] = a;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top--];
        }
    }
}
