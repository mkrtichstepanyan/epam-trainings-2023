package homework_4.Samvel_Hakobyan.stack;

public class Stack {
    int[] arr;
    int cursor;
    Stack(int capacity){
        this.arr = new int[capacity];
    }
    int cursor(){
        return  this.cursor;
    }
    boolean isEmpty(){
        return this.cursor == 0;
    }
    boolean isFully(){
        return this.cursor == this.arr.length;
    }
    void  push(int value){
        if (this.isFully()){
            System.err.println("Error Stack is Fully! " + value);
            return;
        }
        this.arr[this.cursor++] = value;
    }


    int pop(){
        if (this.isEmpty()){
            System.err.println("Error Stack is Empty");
            return  -1;

        }
        return this.arr[--this.cursor];
    }



}
