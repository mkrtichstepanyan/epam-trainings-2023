package homework_4.Hayk_Davtyan.Task;

public class Stack {
    int[] stk = new int[10];
    int i;

    Stack() {
        i = -1;
    }

    void push(int item) {
        if (i == 9) {
            System.out.println("Stack is full.");
        } else {
            stk[++i] = item;
        }
    }

    int pop() {
        if (i < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stk[i--];
        }
    }
}
