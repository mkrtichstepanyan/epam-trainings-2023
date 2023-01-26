package homework_4.Gevorg_Martirosian.chapter_6;

//this class realises the stack of integer numbers, which can save 10 values
class Stack {
    int[] stack = new int[10];
    int tos;

    //initialise the top of stack
    Stack() {
        tos = -1;
    }

    //pushing element to the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("stack is already full");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
