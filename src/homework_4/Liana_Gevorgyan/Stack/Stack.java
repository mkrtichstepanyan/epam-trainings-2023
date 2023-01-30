package homework_4.Liana_Gevorgyan.Stack;

public class Stack {

    private int[] stackContent;
    int currentIndex = 0;
    int size = 10;

    public Stack() {
        stackContent = new int[size];
    }

    public Stack(int stackSize) {
        size = stackSize;
        stackContent = new int[size];
    }

    void push(int pushValue) {

        if (currentIndex < size) {
            stackContent[currentIndex] = pushValue;
            currentIndex++;

            if (currentIndex == size * 75 / 100) {
                System.out.println("Refactoring stack, current index is  " + currentIndex);
                refactor();
            }

        } else {
            System.out.println("Could not push " + pushValue + " Stack is full ");
        }

    }

    int pop() {
        if (currentIndex > 0) {
            currentIndex--;
            return stackContent[currentIndex];
        } else {
            System.out.println("Stack is empty ");
        }

        return -1;
    }

    private void refactor() {
        size = 2 * size;
        int[] temp = new int[size];
        for (int i = 0; i < currentIndex; i++) {
            temp[i] = stackContent[i];

        }

        stackContent = temp;

    }

}
