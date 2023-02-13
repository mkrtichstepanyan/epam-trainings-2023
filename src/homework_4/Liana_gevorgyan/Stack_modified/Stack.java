package homework_4.Liana_gevorgyan.Stack_modified;

public class Stack {

    private int[] stackContent;
    private int currentIndex = 0;
    private int size = 10;

    public Stack() {
        stackContent = new int[size];
    }

    public Stack(int stackSize) {
        size = stackSize;
        stackContent = new int[size];
    }

    void push(int pushValue) {
        //Since Stack size vas doubled each time when it reaches 75%,
        // it could not reach stack size no additional check needed
        // Add pop value in to Stack array and increase current index to show next position
        stackContent[currentIndex] = pushValue;
        currentIndex++;

        //Check if current index reached of 75% of Stack size, then refactor should be done
        if (currentIndex == size * 75 / 100) {
            System.out.println("Refactoring stack, current index is  " + currentIndex);
            refactor();
        }

    }

    int pop() {
        //Check if current index reached last element in the Stack
        if (currentIndex > 0) {
            //As current index points to current  free slot, to get last element should first decrease index
            currentIndex--;
            return stackContent[currentIndex];
        } else {
            System.out.println("Stack is empty ");
        }
        //Stack is empty, just return -1 as error
        return -1;
    }

    private void refactor() {
        //Double Stack size and create new array with new size
        size = 2 * size;
        int[] temp = new int[size];
        //Copy all existing elements to new Array
        for (int i = 0; i < currentIndex; i++) {
            temp[i] = stackContent[i];

        }
        //Store new array as stackContent
        stackContent = temp;

    }

}
