package homework_4.Davit_Poghosyan.Chapter_6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    //initialize top-of-stack
    Stack(){
        tos = -1;
    }
    //push the item onto stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

        //pop an item from the stack
        int pop(){
            if(tos < 0){
                System.out.println("Stack underflow.");
                return 0;
            }
            else {
                return stck[tos--];

        }
    }
}
