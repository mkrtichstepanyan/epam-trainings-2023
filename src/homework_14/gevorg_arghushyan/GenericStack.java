package homework_14.gevorg_arghushyan;

/**
 * @Author Gevorg Arghushyan
 */
public class GenericStack<E> {

    private Object[] array = new Object[10];
    private  int size = 0;

    public void push(E object) {
        isFull();
        array[size] = object;
        size++;
    }

    public E pop() {
        isEmpty();
        size--;
        E object = (E) array[size];
        array[size] = null;
        return object;
    }

    private void isEmpty() {
        if (size == 0 ) {
            throw new EntityNotFoundException("Stack is empty: ");
        }
    }

    private void isFull() {
        if (size == array.length) {
            extend();
        }
    }

    private void extend() {
        Object[] newObjects = new Object[array.length + 10];


        int i = 0;
        while (i < array.length){
            newObjects[i] = array[i++];
        }
       array = newObjects;

    }
}
