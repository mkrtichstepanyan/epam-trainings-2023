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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

//a

    public void push(int a) {
        if (size-1 == top) {
            expend();
        }
        int i = ++top;
        array[i] = a;
    }
    private void expend(){
        int length = size;
        int newStack[] = new int[length+(length * 75 / 100)];
        System.arraycopy(array,0,newStack,0,length);
        array = newStack;
        size = newStack.length;
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
