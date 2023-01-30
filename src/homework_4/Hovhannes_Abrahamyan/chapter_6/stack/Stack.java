package homework_4.Hovhannes_Abrahamyan.chapter_6.stack;

public class Stack {
    int[] stack;
    int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length * 3 / 4) {
            increaseCapacity(stack.length);
        }
        stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("The stack is empty!");

            return 0;
        } else {
            return stack[tos--];
        }
    }

    private void increaseCapacity(int size) {
        int[] newArrayy = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newArrayy[i] = stack[i];
        }
        stack = newArrayy;
    }
}