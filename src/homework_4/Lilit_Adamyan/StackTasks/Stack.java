package homework_4.Lilit_Adamyan.StackTasks;

public class Stack {
     int [] stack;
     int tos;
     int size = 10;

//    overloaded constructor

    public Stack(int size){
        size = 10;
       stack = new int[10];
       tos = -1;
    }

    public Stack(){
         stack = new int[10];
         tos = -1;
     }
     void push(int item){
         if(tos == size-1){
             System.out.println("Stack is already full!");
         }else
             stack[++tos] = item;
     }

     int pop(){
         if(tos ==-1){
             System.out.println("Stack is empty!");
             return 0;
         }else {
             return stack[tos--];
         }
     }
}
