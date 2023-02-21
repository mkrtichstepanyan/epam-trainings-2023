package homework_4.Karen_Sargsyan;

public class Stack {
    private int[] array;
    private int index;

    public Stack() {
        this.array = new int[10];
        this.index = -1;
    }

    public Stack(int size) {
        this.array = new int[size];
        this.index = -1;
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
