package homework_4.Shushanik_araqelyan.task;

public class Stack {
    int[] stack = new int[20];
    int index;

    Stack() {
        index = 0;
    }

    void push(int item) {
        if (index == stack.length) {
            System.out.println("The stack is full");
        } else {

            stack[index] = item;

            index++;
        }
    }

    int pop() {
        index--;

        int item = stack[index];
       return item;

    }
}
