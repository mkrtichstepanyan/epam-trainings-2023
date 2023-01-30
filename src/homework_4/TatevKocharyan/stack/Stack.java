package homework_4.TatevKocharyan.stack;

public class Stack {
    private int[] stck;

    Stack(int size) {

        stck = new int[size];
    }


    void push(int number) {
        if (stck[stck.length / 4 * 3] != 0) {
            System.out.println("The stack is already full!");
            extendCapacity();
        } else {
            for (int i = 0; i < stck.length; i++) {
                if (stck[i] == 0) {
                    stck[i] = number;
                    break;
                }
            }
        }
    }

    private void extendCapacity() {
        int[] newArray = new int[stck.length * 2];
        for (int i = 0; i < stck.length; i++) {
            newArray[i] = stck[i];
        }
        stck = newArray;
    }

    int pop() {
        int poped = 0;
        for (int i = stck.length - 1; i >= 0; i--) {
            if (stck[i] != 0) {
                poped = stck[i];
                stck[i] = 0;
                break;
            }
        }
        if (stck[0] == 0) {
            System.out.println("The stack is empty!");
        }
        return poped;
    }

    void print() {
        for (int i = 0; i < stck.length; i++) {
            if (stck[i] == 0) {
                continue;
            } else {
                System.out.print(stck[i] + " ");
            }
        }
    }
}