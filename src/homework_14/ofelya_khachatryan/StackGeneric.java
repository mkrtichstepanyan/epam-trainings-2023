package homework_14.ofelya_khachatryan;

public class StackGeneric<Type> {
    private Object[] stack;
    private int index;

    public StackGeneric() {
        this(10);
    }

    public StackGeneric(int size) {
        this.index = -1;
        this.stack = new Object[size];
    }

    public void push(Type element) {
        if (index > stack.length * 75 / 100) {
            Object[] dest = new Object[stack.length * 2];
            System.arraycopy(stack, 0, dest, 0, index + 1);
            stack = dest;
        } else {
            stack[++index] = element;
        }
    }

    public Type pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return (Type) stack[index--];
        }
    }


}
