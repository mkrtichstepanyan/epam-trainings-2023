package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate defines an integer stack that can hold values
class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");

            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        for (int i = 0; i < 10; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack2.pop());
        }
    }
}