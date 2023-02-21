package homework_4.Vladimir_Vanyan.Homework;

class Home {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // Stack stack2=new Stack(26);


        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        System.out.println("First element is " + stack.pop());
    }
}

class Stack {
    private int[] stack;
    private int tos = -1;
    private int stackSize = 10;

    Stack() {
        stack = new int[stackSize];
    }

    Stack(int size) {
        this.stack = new int[size];
        this.stackSize = size;
    }

    void push(int element) {
        if (tos == stackSize - 1) {
            System.out.print("The Stack is full");
        } else {
            stack[++tos] = element;
        }
        if (tos > stackSize / 1.33) {
            stackSize *= 2;
            int[] tempStack = new int[stackSize];
            for (int i = 0; i < stack.length; i++) {
                tempStack[i] = stack[i];
            }
            stack = new int[stackSize];
            stack = tempStack;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.print("The stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

