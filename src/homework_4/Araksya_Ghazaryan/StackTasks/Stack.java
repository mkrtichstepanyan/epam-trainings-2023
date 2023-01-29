package homework_4.Araksya_Ghazaryan.StackTasks;

public class Stack {

    private int[] array = new int[10];
    private int index;
    private int length;

    Stack() {
        index = -1;
        length = 10;
    }
    Stack(int arraySize) {
        this.length = arraySize;
    }
    public void push(int item) {
        if (index == length -1) {
            System.out.println("The stack is already full!");
            extend();
        } else {
            array[++index] = item;
        }
    }
    private void extend() {
        if (index >= length * 75 / 100) {
            System.out.println("length dynamically increased");
            int[] temp = new int[length * 2];
            for (int i = 0; i <= index; i++) {
                temp[i] = array[i];
            }
            array = temp;
            length = temp.length;
        }
    }
    public Integer pop() {
        if (index <= -1) {
            System.out.print("The stack is empty! ");
            return null;
        } else {
            return array[index--];
        }
    }
    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
