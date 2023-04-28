package homework_14.Vahe_Vardanyan;

public class Stack <T> {
    private  Object[] stack;
    private int index;

    public Stack(){
        this.stack = (T[])  new Object[10];
        this.index = -1;
    }
    public Stack(int size){
        this.stack = (T[]) new Object [size];
        this.index = -1;
    }
    public void push(T item){
        if (index > stack.length * 0.75){
            extendCapacity(item);
        }else {
            stack[index++] = item;
        }
    }
    public void extendCapacity(T item){
        Object[] newStack = new Object[stack.length * 2];
        System.arraycopy(stack,0,newStack,0,stack.length);
        stack = newStack;
        stack[++index] = item;
    }
    public T pop(){
        if (index < 0){
            System.out.println("The stack is empty");
            return null;
        }else {
            return (T) stack[index--];
        }
    }
}

