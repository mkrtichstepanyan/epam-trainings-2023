package homework_4.Gevorg_Martirosian.tasks;

//class for dynamic type stack
class DynamicStack {
    //create an array for saving an elements in the stack
    int[] stackArray;

    //simple constructor.
    //by default the stack will have size 10
    public DynamicStack() {
        this.stackArray = new int[10];
    }

    //constructor with length parameter.
    // it will be used when the user need to create the stack with the size he/she want
    public DynamicStack(int length) {
        this.stackArray = new int[length];
    }

    //push method for dynamic stack, it will add the given element onto a top of the stack
    void push(int element) {
        //loop for counting how many elements are in the stack exist
        int count = 0;
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != 0) {
                count++;
            }
        }
        //checking, if the stack is full by 75%, then the size of stack increases by two times
        if (stackArray.length * 75 / 100 <= count) {
            int[] newStackArray = new int[stackArray.length * 2];
            for (int i = 0; i < stackArray.length; i++) {
                newStackArray[i] = stackArray[i];
            }
            stackArray = newStackArray;

            for (int i = 0; i < stackArray.length; i++) {
                if (stackArray[i] == 0) {
                    stackArray[i] = element;
                    return;
                }
            }
        } else {
            //if the stack is not full by 75%, then nothing changes
            for (int i = 0; i < stackArray.length; i++) {
                if (stackArray[i] == 0) {
                    stackArray[i] = element;
                    return;
                }
            }
        }
    }

    //pop method, it will return an element from the top of the stack
    int pop() {
        int result = 0;
        for (int i = stackArray.length - 1; i >= 0; i--) {
            if (stackArray[i] != 0) {
                result = stackArray[i];
                stackArray[i] = 0;
                return result;
            }
        }
        //in case pop method is invoked, but the stack is empty, program prints message: "The stack is empty!"
        System.out.println("the stack is empty");
        return result;
    }
}
