package homework_8.Ani_Kovalenko;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack[++tos] = item;
        } else {
            stack[++tos] = item;
        }
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
