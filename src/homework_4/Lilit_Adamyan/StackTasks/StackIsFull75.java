package homework_4.Lilit_Adamyan.StackTasks;

//    c. Refactor the stack to accept as many elements as we want, when the stack is full by 75 percent, increase its size by two times (x2)
public class StackIsFull75 {
    private int size;
    private int[] stack;
    private int tos;

    public StackIsFull75(int size) {
        this.size = size;
        stack = new int[this.size];
        tos = -1;
    }

    public void push(int item) {
        if (tos >= size * 0.75) {
            int[] newStack = new int[size * 2];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
            size = size * 2;
        }
        stack[++tos] = item;
    }
    public int pop(){
        if(tos==-1){
            System.out.println("Stack is empty");
            return 0;
        }else {
            return stack[--tos];
        }
    }

}
