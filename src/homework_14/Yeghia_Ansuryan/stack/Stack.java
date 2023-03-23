package homework_14.Yeghia_Ansuryan.stack;

public class Stack<V extends Object> {
    Object[] vardushner = new Object[10];
    int index = -1;

    public void push(V vardush) {
        if (index < 9) {
            vardushner[++index] = vardush;
        } else {
            System.out.println("Stack is full");
        }
    }

    public V pop() {
        if (index > -1) {
            return (V) vardushner[index--];
        } else {
            return (V) "Stack is empty";
        }
    }
}
