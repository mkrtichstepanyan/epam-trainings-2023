package homework_4.Davit_Poghosyan.Stack;

public class Stack_4b {
    int[] stackArray;
    int topS=-1;
    Stack_4b(int sizeOfStack){

        stackArray = new int[sizeOfStack];
    }
    public void push(int k) {
        if (topS == stackArray.length) {
            System.out.println("The stack is already full");
        } else {
            stackArray[++topS] = k;
        }
    }

    public int pop() {
        if (topS < 0) {
            System.out.println("The stack is empty");
            return 0;
        } else {
            return stackArray[topS--];
        }
    }
}
