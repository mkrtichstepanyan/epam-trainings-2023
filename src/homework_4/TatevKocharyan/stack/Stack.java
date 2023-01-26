package homework_4.TatevKocharyan.stack;

public class Stack {

    int[] array;
    int size;

    Stack(int size) {
        this.size = size;
        array = new int[size];
    }


    void push(int number) {
        int[] newArray = new int[array.length * 2];
        if (array[array.length / 4 * 3] != 0) {
            System.out.println("The stack is already full!");
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;

        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = number;
                    break;
                }
            }
        }

    }

    int pop() {
        int poped = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                poped = array[i];
                array[i] = 0;
                break;
            }

        }
        if (array[0] == 0) {
            System.out.println("The stack is empty!");
        }

        return poped;
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                System.out.print(array[i] + " ");
            }
        }

    }
}