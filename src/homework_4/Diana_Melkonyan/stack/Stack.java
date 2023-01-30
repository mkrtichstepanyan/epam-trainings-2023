package homework_4.Diana_Melkonyan.stack;

public class Stack {
    private static final int DEFAULT_SIZE = 2;

    private int[] array;
    private int index;


    Stack() {
        array = new int[DEFAULT_SIZE];
        index = -1;
    }

    Stack(int size) {
        array = new int[size];
        index = -1;

    }

    public void push(int item) {
        if (index >= (array.length * 75) / 100) {
            extendCapacity();
        }
        array[++index] = item;
    }


    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {

            int carentElement = array[index];
            array[index] = 0;
            index--;
            return carentElement;
        }
    }

    private void extendCapacity() {
        int[] newArr = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public int getIndex() {
        return index;
    }

}
