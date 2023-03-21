package homework_14.melo_tutkhalyan.StackWithGenerics;

public interface Stack<E> {

    void push(E value);

    E pop();

    default boolean isEmpty() {
        return this.size() == 0;

    }

    int size();

    boolean isFully();

}
