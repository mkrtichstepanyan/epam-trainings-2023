package homework_4.Arsen_Kazaryan.Stack;

public class Stack {
    int array[] = new int[10];
    int index;

    Stack() {
    }

    void push(int item) {
        if (index == array.length - 1) {
            System.out.println("The stack is full!");
        } else {
            array[++index] = item;
        }
    }

    int pop() {
        if (index == -1) {
            System.out.println("The is empty");
        } else {
            int item = array[index];
            index--;
            return item;
        }
        return -1;
    }
}