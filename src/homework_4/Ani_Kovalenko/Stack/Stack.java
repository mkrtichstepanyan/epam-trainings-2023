package homework_4.Ani_Kovalenko.Stack;

public class Stack {
    private int[] array;
    private int index = -1;

    protected Stack() {
        array = new int[10];
    }

    protected Stack(int size) {
        array = new int[size];
    }

    public void push(int element) {
        if (index == array.length - 1) {
            System.out.println("Stack is already full !!");
        } else {
            array[++index] = element;
        }
    }

    public Integer pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        int temp = array[index--];
        return temp;
    }
}
