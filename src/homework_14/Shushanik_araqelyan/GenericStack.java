package homework_14.Shushanik_araqelyan;

public class GenericStack<T> {
    private static int MINIMUM_SIZE = 10;
    private T[] array = (T[]) new Object[MINIMUM_SIZE];
    private int index = -1;


    public void push(T value) {
        if (index < array.length - 1) {
            array[++index] = value;
        }
        System.out.println("The stack is full");
    }

    public T pop() {
        if (index >= 0) {
            T t = array[index];
            array[index]=null;
            index--;
            return t;
        }
        System.out.println("The stack is empty");
        return null;
    }

}
