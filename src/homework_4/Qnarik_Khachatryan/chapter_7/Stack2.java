package homework_4.Qnarik_Khachatryan.chapter_7;


//Improved Stack class that uses the length array member
class Stack2 {
    private int[] stck = new int[10];
    private int tos; //index of the top of the stack

    //allocate and initialize stack
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) { //use length member
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
