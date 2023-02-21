package homework_4.Yeghia_Ansuryan.Stack;

public class Stack {
    private int[] array;
    private int index;

   public Stack() {
        array = new int[10];
        index = -1;
    }

    public Stack(int size) {

        array = new int[size];
        index = -1;

    }

    public void push(int element) {
        if (index >= array.length - 1) {
            System.out.println("The stack is already full!");
        } else {
            array[++index] = element;
        }
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