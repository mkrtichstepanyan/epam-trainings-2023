package homework_4.Andranik_Sargsyan.chapter_6.stack;

public class Stack {
    int[] arr;
    private static final int DEFAULT_SIZE = 10;
    int index;

    Stack(int size) {
        arr = new int[size];
        index = -1;
    }

    Stack() {
        arr = new int[DEFAULT_SIZE];
        index = -1;
    }

    void push(int item) {
        refactoringStack();
        arr[++index] = item;
    }

    int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return arr[index--];
        }
    }

    private void refactoringStack() {
        if (index == arr.length * 75 / 100) {
            int[] newArr = new int[2 * arr.length];
            for (int i = 0; i <= index; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
}
