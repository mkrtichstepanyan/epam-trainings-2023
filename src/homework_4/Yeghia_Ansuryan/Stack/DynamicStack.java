package homework_4.Yeghia_Ansuryan.Stack;

public class DynamicStack {
    private int[] array;
    private int index;

    public DynamicStack(int size) {
        array = new int[size];
        index = -1;
    }

    public DynamicStack() {
        array = new int[10];
        index = -1;
    }

    public void push(int element) {
        if (index >= array.length * 0.75) {
            int size = array.length * 2;
            int[] array1 = new int[size];
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
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
