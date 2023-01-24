package homework_4.Radik_Manasyan;

public class Stack {
    int length = 10;
    int[] array = new int[length];
    int size = -1;

    Stack() {

    }

    Stack(int arraySize) {
        this.length = arraySize;
    }

    void push(int element) {
        if (size == length - 1) {
            System.out.println("The stack is already full!");
        } else {
            array[++size] = element;
            refactor();
        }
    }

    Integer pop() {
        if (size <= -1) {
            System.out.print("The stack is empty! ");
            return null;
        } else {
            return array[size--];
        }
    }

    void refactor() {
        if (size >= length * 75 / 100) {
            int[] temp = new int[length * 2];
            for (int i = 0; i <= size; i++) {
                temp[i] = array[i];
            }
            array = temp;
            length = temp.length;
        }
    }
}
