package homework_4.Varsik_Pijoyan.Stack;

public class StackExample {
    private int[] stack;
    private int top = -1;
    private int size = 0;

    public StackExample() {  //Default constructor
        stack = new int[10];
    }

    public StackExample(int size) {  //Overloaded constructor
        stack = new int[size];
    }

    public int push(int element) {
        if (top >= (stack.length * 75) / 100) {
            System.out.println("75 percent of the Stack has filled");
            stackIncrease();
        }
        size++;
        return stack[++top] = element;
    }



    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return 0;
        }
            return stack[top--];

    }


    public boolean isEmpty() {
        return top <= -1;
    }

    private void stackIncrease() {
        System.out.println("Stack Increasing");
        int[] stackArrCopy = new int [stack.length * 2];
        for (int i = 0; i < size; i++) {
            stackArrCopy[i] = stack[i];
        }
        System.out.println("The stack has increased");
        stack = stackArrCopy;
    }

    public void print() {
        System.out.println("Printing stack elements");
        for (int i = 0; i < size; i++) {
            System.out.println(stack[i] + ",");

        }

    }
}

