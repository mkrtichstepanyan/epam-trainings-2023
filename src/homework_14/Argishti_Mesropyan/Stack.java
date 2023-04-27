package homework_14.Argishti_Mesropyan;

public class Stack<T> {
    private T[] stackAr;
    private int index;

    public Stack(int size) {
        stackAr = (T[]) new Object[size];
        index = -1;
    }

    public void push(T item) {
        if (index >= (stackAr.length * 75) / 100) {
            extendCapacity();
        }
        stackAr[++index] = item;
    }

    private void extendCapacity() {
        T[] newArr = (T[]) new Object[2 * stackAr.length];
        for (int i = 0; i < stackAr.length; i++) {
            newArr[i] = stackAr[i];
        }
        stackAr = newArr;
    }


    public T pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {

            T curentElement = stackAr[index];
            stackAr[index] = null;
            index--;
            return curentElement;
        }
    }

    public int getIndex() {
        return index;
    }
}
