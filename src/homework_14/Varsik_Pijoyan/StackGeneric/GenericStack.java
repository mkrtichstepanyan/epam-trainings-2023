package homework_14.Varsik_Pijoyan.StackGeneric;

public class GenericStack<T> {
    private T[] stackArray;
    private int index;

    public GenericStack(int stackSize) {
        this.stackArray = (T[]) new Object[stackSize];
        this.index = -1;
    }

    public void push(T element) {
        if (index >= (stackArray.length * 75) / 100) {
            increaseStackCapacity();
        }
        stackArray[++index] = element;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return null;
        }
        return (T) stackArray[index--];

    }


    public boolean isEmpty() {
        return index <= -1;
    }


    private void increaseStackCapacity() {
        T[] stackArrCopy = (T[]) new Object[2 * stackArray.length];
        for (int i = 0; i < stackArray.length; i++) {
            stackArrCopy[i] = stackArray[i];
        }
        stackArray = stackArrCopy;
    }
}
