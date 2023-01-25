package homework_4.Diana_Melkonyan.stack;

public class Stack {
    int [] array = new int [10];
    int index;
    int size;

    Stack(){

        index = -1;
    }
    Stack(int size ){
        this.size = size;
        array= new int[size];

    }

    void push(int item){
        if(index ==9){
            System.out.println("The stack is already full!");
        }else {
            array[++index] = item;
        }
    }

    int pop(){
        if(index<0){
            System.out.println("The stack is empty!");
            return 0;
        }else {

            int carentElement = array[index];
            array[index]=0;
                index--;

            return carentElement ;


        }

    }
}
