package homework_14.aram_mehrabyan;

public class Stack1 <T extends Object>{
    T []stck;
    int tos;
    Stack1(){
        this.stck = (T[]) new Object[2];
        tos=-1;
    }
    Stack1( int s){
        this.stck = (T[]) new Object[s];
        tos=-1;
    }
    void push( T item){
        if(tos==this.stck.length-1)
            System.out.println("Stack is full.");
        else
            this.stck[++tos]=item;
    }
    T pop(){
        if(tos<0){
            System.out.println("Stack is underflow.");
            return null;
        }
        else
            return this.stck[tos--];
    }
}
