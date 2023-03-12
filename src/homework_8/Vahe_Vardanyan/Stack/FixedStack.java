package homework_8.Vahe_Vardanyan.Stack;

public class FixedStack implements IntStack {
    private int []stck;
    private int tos;

    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
    if (tos==stck.length-1){
        System.out.println("Stack is full");
    }else{
        stck[++tos] = item;
    }
    }

    @Override
    public int pop() {
        if (tos < 0){
            System.out.println("stack underflow.");
            return 0;
        }else {
            return stck[tos--];

        }
    }
}
