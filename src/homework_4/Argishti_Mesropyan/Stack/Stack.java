package homework_4.Argishti_Mesropyan.Stack;

public class Stack {
    int[] myStack;

    int sizeOfArr;
    int index = 0;


    //constructor for Stack
    Stack(int size) {
        sizeOfArr = size;
        myStack = new int[sizeOfArr];
    }

    void push(int element) {
        if (index == sizeOfArr) {
            System.out.println("The stack is already full!");
        } else {
            myStack[index] = element;
            index++;
        }
    }

    int pop() {
        if (index == 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return myStack[index - 1];
        }
    }
}
