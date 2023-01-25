package homework_4.Ani_Barseghyan.Stack;

public class Stack {
    int[] stackArray;
    int top = -1;
    int size;

    Stack() {
        size = 10;
        stackArray = new int[size];
    }

    Stack(int length) {
        this.size = length;
        stackArray = new int[this.size];
    }

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("The stack is already full!");
        } else {
            stackArray[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty!");
            return 0;
        }
        return stackArray[top--];
    }
}
