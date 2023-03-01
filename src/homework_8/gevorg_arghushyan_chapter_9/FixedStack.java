package homework_8.gevorg_arghushyan_chapter_9;

public class FixedStack implements IntStack{
    private int[] stack;
    private int tos;
    FixedStack (int size){
        stack = new int [size];
        tos = -1 ;
    }
    public void push (int item){
        if (tos ==stack.length - 1){
            System.out.println("Stack is fool");
        }else stack [++tos] = item;
    }
    public int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }else return stack[tos--];
    }

}
