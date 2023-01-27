package homework_4.Ani_Kovalenko.Stack;

public class Stack {
    int[] array;
    int index = -1;

    public Stack() {
        array = new int[10];
    }

    public Stack(int size) {
        array = new int[size];
    }

    void push(int element) {
        if (index == array.length-1) {
            System.out.println("Stack is already full !!");
        } else {
            array[++index] = element;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int temp = array[index];
            return temp;
        }
    }
}
