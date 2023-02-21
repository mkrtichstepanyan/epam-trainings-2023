package homework_4.Karen_Sargsyan;

public class DynamicStack {
    private int[] array;
    private int index;

    public DynamicStack(int size) {
        this.array = new int[size];
        this.index = -1;
    }

    public DynamicStack() {
        this.array = new int[10];
        this.index = -1;
    }

    public void push(int element) {
        if (index >= array.length * 0.75) {
            int size = array.length * 2;
            int[] newArray = new int[size];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[++index] = element;

    }

    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int temp = array[index];
            array[index--] = 0;
            return temp;
        }
    }

}
