package homework_4.Gevorg_Martirosian.tasks;

//SimpleStack class, for creating static stack, without possibility to increase it's size
//for that case I create DynamicStack class type, which extends SimpleStack
public class SimpleStack {
    private int[] stackArray;

    public int[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(int[] stackArray) {
        this.stackArray = stackArray;
    }

    //simple constructor.
    // by default the stack will have size 10
    public SimpleStack() {
        this.stackArray = new int[10];
    }

    //constructor with length parameter.
    //it will be used when the user needs to create the stack with the size he/she want
    public SimpleStack(int length) {
        this.stackArray = new int[length];
    }

    //method for checking is the stack empty
    public boolean isEmpty() {
        return stackArray[0] == 0;
    }

    //method for calculate the count of elements in stack for now
    public int countElementsInStack() {
        //loop for counting how many elements are in the stack exist
        int count = 0;
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != 0) {
                count++;
            }
        }
        return count;
    }

    //push method for simple stack, it will add the given element onto a top of the stack
    public void push(int element) {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] == 0) {
                stackArray[i] = element;
                return;
            }
        }
        //in case push method is invoked, but the stack already full, program prints message "The stack is already full!"
        System.out.println("the stack is full");
    }

    //pop method, it will return an element from the top of the stack
    public Integer pop() {
        //in case pop method is invoked, but the stack is empty, program prints message: "The stack is empty!"
        //and return null
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return null;
        }

        Integer result;
        for (int i = stackArray.length - 1; i >= 0; i--) {
            if (stackArray[i] != 0) {
                result = stackArray[i];
                stackArray[i] = 0;
                return result;
            }
        }
        return null;
    }

    //method for printing the stack
    public void printStack() {
        for (int i = 0; i < getStackArray().length; i++) {
            System.out.print(getStackArray()[i] + " ");
        }
        System.out.println();
    }
}
