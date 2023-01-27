package homework_4.Galust_Arzumanyan;

/**
 * Todo Refactor the stack to accept as many elements as we want,
 * when the stack is full by 75 percent, increase its size by two times (x2)
 */
class Stack1 {
    int stack_size;
    int[] stack;
    int tos;

    Stack1(int size) {
        this.stack = new int[size];
        this.tos = -1;
        this.stack_size = size;

    }

    void push(int item) {
        if (tos >= stack_size - 1) {
            System.out.println(" The stack is already full ");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println(" The stack is empty ");

            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class TestStack1 {
    public static void main(String[] args) {
        int size = 8;
        Stack1 mystack1 = new Stack1(size);
        for (int i = 0; i <= size - 1; i++) {
            mystack1.push(i);
        }

        System.out.println("Stack in mystack1: ");
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(mystack1.pop());
        }

    }
}