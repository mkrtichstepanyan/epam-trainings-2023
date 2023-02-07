package homework_4.Shushanik_araqelyan.task;

public class Stack {
    private int[] stack = new int[1];
    private int index;

    Stack() {
        index = 0;
    }
    Stack(int arrayLength) {
        stack = new int[arrayLength];
        index=0;
    }

    void push(int item) {
        if (stack.length*75/100 <= index){
            increaseStack();
        }
            stack[index] = item;
            index++;
    }

    private void increaseStack(){
        int[] newStack = new int[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            newStack[i]=stack[i];
        }
        stack = newStack;
    }
    public int getIndex(){
        return this.index;
    }

    int pop() {
        index--;

        int item = stack[index];
        stack[index] = 0;
       return item;

    }
}
