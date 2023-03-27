package homework_14.Yeghia_Ansuryan.stack;

public class Stack<V> {
    V[] var = (V[]) new Object[10];
    int index = -1;

    public void push(V vars) {
        if (index < 9) {
            var[++index] = vars;
        } else {
            System.out.println("Stack is full");
        }
    }

    public V pop() {
        if (index > -1) {
            return (V) var[index--];
        } else {
            return (V) "Stack is empty";
        }
    }
}
