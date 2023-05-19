package homework_14.Zara_Avetyan;

public class Stack<Type> {
    private Type[] array;
    private int size;
    private int top;

    public Stack(int size) {
        array = (Type[]) new Object[size];
        this.size = size;
        top = -1;
    }

    public void push(Type item) {
        if (top == (size - 1)) {
            System.out.println("The stack is already full!");
        } else {
            array[++top] = item;
            if (top >= (double) size / 4 * 3) {
                Type[] largeArray = (Type[]) new Object[size * 2];
                System.arraycopy(array, 0, largeArray, 0, size);
                array = largeArray;
                size *= 2;
            }
        }
    }

    public Type pop() {
        if (top < 0) {
            System.out.println("The stack is empty!");
            return (Type) ((Object) 0);
        } else {
            return array[top--];
        }
    }
}
