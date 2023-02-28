package homework_4.Araksya_Ghazaryan;

public class Stack {
    int[] array = new int[10];
    int index;
    int length;

    Stack() {
        index = -1;
        length = 10;
    }
    Stack(int arraySize) {
        this.length = arraySize;
    }
    void push(int item) {
        if (index == length -1) {
            System.out.println("The stack is already full!");
            extend();
        } else {
            array[++index] = item;
        }
    }
    void extend() {
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
    Integer pop() {
        if (index <= -1) {
            System.out.print("The stack is empty! ");
            return null;
        } else {
            return array[index--];
        }
    }
    void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
