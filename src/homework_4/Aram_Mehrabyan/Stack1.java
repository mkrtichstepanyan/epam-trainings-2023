package homework_4.Aram_Mehrabyan;

public class Stack1 {
    int []stck;
    int tos;
    Stack1(){
        stck=new int[10];
        tos=-1;
    }
    Stack1( int s){
        stck=new int[s];
        tos=-1;
    }
    void push( int item){
        if(tos==stck.length-1)
            System.out.println("Stack is full.");
        else
            stck[++tos]=item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
