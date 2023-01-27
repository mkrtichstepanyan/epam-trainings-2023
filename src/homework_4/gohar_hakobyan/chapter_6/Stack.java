package homework_4.gohar_hakobyan.chapter_6;

public class Stack {
    int stck[] = new int[10];
    int tos;

    public Stack(int i) {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}

