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

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //pushing some elements to the stack
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        //popping these elements from stack
        System.out.println("stack in myStack1");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("stack in myStack2");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
