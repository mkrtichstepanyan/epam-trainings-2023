package homework_4.Robert_Nazaryan;

public class Stack {

    private Integer[] stack;
    private int index;
    private int length = 10;

    public Stack() {
        index = -1;
        stack = new Integer[length];
    }

    public Stack(int l) {

        length = l;
        index = -1;
        stack = new Integer[length];
    }

    public void push(int item) {

        if (index == 0.75 * length) {
            extendCapacity();
        }
        stack[++index] = item;
    }

    public Integer pop() {

        if (index == -1) {

            System.out.println("The stack is empty!");
            return null;
        } else {

            return stack[index--];
        }
    }

    private void extendCapacity() {

        Integer[] newStack = new Integer[2 * stack.length];
        for (int i = 0; i <= index; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public int setLength() {
        return this.length;
    }
}
