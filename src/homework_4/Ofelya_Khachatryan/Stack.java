package homework_4.Ofelya_Khachatryan;

import java.util.Arrays;

public class Stack {
    private Integer[] stack;
    private int index;

    public Stack() {
        this(10);
    }

    public Stack(int size) {
        this.index = -1;
        this.stack = new Integer[size];
    }

    public void push(int element) {
        if (index == stack.length) {
            System.out.println("The Stack is already full");
        } else {
            stack[++index] = element;

            if (index > stack.length * 75 / 100) {
                Integer[] dest = new Integer[stack.length * 2];
                System.arraycopy(stack, 0, dest, 0, index + 1);
                stack = dest;
            }
        }
    }

    public Integer pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[index--];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
    }
}
