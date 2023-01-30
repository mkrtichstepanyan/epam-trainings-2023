package homework_4.Galust_Arzumanyan.Test_Stack;


/**
 * Todo Refactor the stack to accept as many elements as we want,
 * when the stack is full by 75 percent, increase its size by two times (x2)
 */
class Stack {
    int stack_size;
    int[] stack;
    int tos;

    Stack(int size) {
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