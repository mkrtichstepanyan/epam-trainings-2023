package homework_4.Radik_Manasyan;

public class Stack {
    int arrayLength = 10;
    int[] array = new int[arrayLength];
    int arraySize = -1;

    Stack() {
    }

    Stack(int arraySize) {
        this.arrayLength = arraySize;
    }

    void push(int element) {
        if (arraySize == arrayLength - 1) {
            System.out.println("The stack is already full!");
        } else {
            refactor();
            array[++arraySize] = element;
        }
    }

    Integer pop() {
        if (arraySize <= -1) {
            System.out.print("The stack is empty! ");
            return null;
        } else {
            return array[arraySize--];
        }
    }

    void refactor() {
        if (arraySize >= arrayLength * 75 / 100) {
            int[] temp = new int[arrayLength * 2];
            for (int i = 0; i <= arraySize; i++) {
                temp[i] = array[i];
            }
            array = temp;
            arrayLength = temp.length;
        }
    }
}
