package homework_5.shushanik_araqelyan.myTask.chapter7;

public class Stack {
    private int[]stck= new int[10];
    private int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9)
            System.out.println("The stack is full");
        else stck[++tos]=item;
    }
    int po(){
        if(tos<0){
            System.out.println("Stack underflow .");
            return 0;
        }
        else
            return stck[tos--];
    }
}
