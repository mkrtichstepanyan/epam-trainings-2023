package homework_4.Ani_Barseghyan.Stack;

public class Stack {
    int[] stackArray;
    int top = -1;
    int size;
    int elementCount = 0;

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

    public void pushDynamic(int element) {
        if (elementCount > size * 0.75) {
            System.out.println("Increasing the stack size");
            int[] newArray = new int[2 * size];

            for (int i = 0; i < size; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
            stackArray[++top] = element;
            elementCount++;
            size *= 2;
        } else {
            stackArray[++top] = element;
            elementCount++;
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
