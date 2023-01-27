package homework_4.Alina_Vardanovna.stack;

public class Stack {

    private int[] array;
    private int index;
    private int size;

    //Default
    public Stack() {
        this.size = 10;
        array = new int[this.size];
        index = -1;
    }

    //Overloaded
    public Stack(int size) {
        this.size = size;
        array = new int[this.size];
        index = -1;
    }

    public void push(int x) {
        if (index == size - 1) {
            System.out.println("The stack is already full!");
        } else {
            array[++index] = x;
        }
        if (index > 0.75 * size) {
            int[] newArray = new int[size * 2];
            if (size >= 0) {
                System.arraycopy(array, 0, newArray, 0, size);
            }
            array = newArray;
            size *= 2;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return (0);
        } else {
            return array[index--];
        }
    }

}
