package homework_4_1.Hayk_Davtyan.Task;

public class StackArray {
    private int size;
    private int[] array;
    private int top;
    private int capacity = 2;

    public StackArray(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public int size(){
        return top + 1;
    }

    public void push(int a) {
        if (size() == capacity) {
            expend();
        }
        int i = ++top;
        array[i] = a;
    }
    private void expend(){
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(array,0,newStack,0,length);
        array = newStack;
        capacity *= 2;
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
