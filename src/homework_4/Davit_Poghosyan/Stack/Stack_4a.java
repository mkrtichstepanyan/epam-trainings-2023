package homework_4.Davit_Poghosyan.Stack;

public class Stack_4a {
    int[] stackArray = new int[10];
    int topStack = -1;

    public void push(int k) {
        if (topStack == 9) {
            System.out.println("The stack is already full");
        } else {
            stackArray[++topStack] = k;
        }
    }

    public int pop() {
        if (topStack < 0) {
            System.out.println("The stack is empty");
            return 0;
        } else {
            return stackArray[topStack--];
        }
    }

}
