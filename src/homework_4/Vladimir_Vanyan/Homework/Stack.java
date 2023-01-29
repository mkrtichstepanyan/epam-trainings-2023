package homework_4.Vladimir_Vanyan.Homework;

class Home {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // Stack stack2=new Stack(26);

        System.out.println("First size of stack" + stack.stackSize);

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        System.out.println("First element is " + stack.pop());
        System.out.println("The stack size is " + stack.stackSize);
    }
}

class Stack {
    int[] stack;
    int tos = -1;
    int stackSize = 10;

    Stack() {
        stack = new int[stackSize];
    }

    Stack(int size) {
        stack = new int[size];
        stackSize = size;
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

