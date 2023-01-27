package homework_4.gevorg_arghushyan.chapter_6;

public class Stack {
    int [] stck = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }

    void push (int item){
        if (tos == 9) {
            System.out.println("Stack is full");

        }else{
            stck[++tos]= item;

        }
    }
    int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;

        }else{
            return stck[tos--];
        }
    }

}
