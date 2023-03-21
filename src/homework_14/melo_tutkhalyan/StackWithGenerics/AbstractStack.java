package homework_14.melo_tutkhalyan.StackWithGenerics;

public abstract class AbstractStack<E> implements Stack<E> {

    protected int size;

    @Override
    public int size() {
        return this.size;
    }
}
