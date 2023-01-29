package homework_4.Alina_Mkhoyan.stack;

class Stack {
    private Integer[] stack;
    private int top;
    private int size;

    public Stack() {
        this.size = 10;
        this.stack = new Integer[size];
        this.top = -1;
    }

    public Stack(int size) {
        this.size = size;
        this.stack = new Integer[size];
        this.top = -1;
    }
    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("The stack is already full!");
        } else {
            stack[++top] = element;
            System.out.println("Added in stack: " + element);
        }
    }
    public void refactoringPush(int element) {
        if (top > (size * 0.75)) {
            System.out.println("Stack is reached 75%");
            Integer[] newStack = new Integer[size * 2];
            for (int i = 0; i < size; i++) {
                newStack[i] = stack[i];
            }
            System.out.println("Created new stack...");
            stack = newStack;
            size *= 2;
            stack[++top] = element;
            System.out.println("Added in stack: " + element);
        }
    }
    public Integer pop() {
        if (top <= -1) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[top--];
        }

    }
}
