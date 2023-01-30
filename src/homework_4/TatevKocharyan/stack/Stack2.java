package homework_4.TatevKocharyan.stack;

public class Stack2 {
    private int[] stck;
    private int tos;

    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length / 4 * 3) {
            extendCapacity();
        }
        stck[++tos] = item;
    }


    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }


    private void extendCapacity() {
        int[] newArray = new int[stck.length * 2];
        for (int i = 0; i < stck.length; i++) {
            newArray[i] = stck[i];
        }
        stck = newArray;

    }

    public void print() {
        for (int i = 0; i < stck.length; i++) {
            if (stck[i] == 0) {
                continue;
            } else {
                System.out.print(stck[i] + " ");
            }
        }
    }

}
