package homework_4.Gevorg_Martirosian.tasks;

public class DynamicStack extends SimpleStack {
    public DynamicStack() {
    }

    public DynamicStack(int length) {
        super(length);
    }

    //private method, it's exist only in DynamicStack class and used when the stack is full by 75%
    private void refactoringStack() {
        //checking, if the stack is full by 75%, then the size of stack increases by two times
        int[] newStackArray = new int[getStackArray().length * 2];
        for (int i = 0; i < getStackArray().length; i++) {
            newStackArray[i] = getStackArray()[i];
        }
        setStackArray(newStackArray);
    }

    //overriding method push for DynamicStack
    //it checks and increase the stack, if there full by 75%
    public void push(int element) {
        if (getStackArray().length * 75 / 100 <= countElementsInStack()) {
            refactoringStack();
        }

        for (int i = 0; i < getStackArray().length; i++) {
            if (getStackArray()[i] == 0) {
                getStackArray()[i] = element;
                return;
            }
        }
    }
}
