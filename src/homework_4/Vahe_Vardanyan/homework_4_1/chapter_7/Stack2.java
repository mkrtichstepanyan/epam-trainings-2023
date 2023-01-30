package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class Stack2 {
    private int[] stck;
    private  int tos;

    Stack2(int size){
        stck = new int[size];
        tos = -1;
    }

    void push (int item) {
        if (tos == stck.length - 1) {
            System.out.println("stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop(){
        if (tos < 0){
            System.out.println("stack underflow");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}

