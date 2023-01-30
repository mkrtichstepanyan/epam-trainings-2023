package homework_4.Vladimir_Vanyan.chapter_7;

class Stack2 {
    private int[] stck;
    private int tos;

    // allocate and initialize stack
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) // use length member
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from teh stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }

    class TestStack2 {
        public static void main(String[] args) {
            Stack2 mystack1 = new Stack2(5);
            Stack2 mystack2 = new Stack2(8);

            // push some numbers onto the stack
            for (int i = 0; i < 5; i++) mystack1.push(i);
            for (int i = 0; i < 8; i++) mystack2.push(i);

            // pop those numbers off the stack
            System.out.println("Stack is mystack1");
            for (int i = 0; i < 5; i++)
                System.out.println(mystack1.pop());

            System.out.println("Stack in mystack2:");
            for (int i = 0; i < 8; i++)
                System.out.println(mystack2.pop());

        }
    }
}
