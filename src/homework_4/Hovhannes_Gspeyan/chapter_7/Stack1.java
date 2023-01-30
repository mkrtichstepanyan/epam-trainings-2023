package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * this class demonstrates improved
 * stack class that uses the length
 * array member
 */
public class Stack1 {
    private int[]stack;
    private int tos;

    Stack1(int size){
        stack = new int[size];
        tos = -1;
    }
    void push(int item){
        if(tos == stack.length - 1){
            System.out.println("stack is full! ");
        }else{
            stack[++tos] = item;
        }
    }
    int pop(){
        if(tos < 0){
            System.out.println("stack underflow! ");
            return 0;
        }else{
           return stack[tos--];
        }
    }
}
