package homework_16.Roza_Petrosyan.generic_dynamic_array_task;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class DynamicArray<T> implements Cloneable {
    private T[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] elementData;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = (T[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int index, T value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public boolean addAll(T[] addedArray) {
        if (addedArray.length == 0) {
            return false;
        }
        for (T value : addedArray) {
            add(value);
        }
        return true;
    }

    public boolean addAll(int index, T[] addedArray) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (addedArray.length == 0) {
            return false;
        }
        int numMoved = size - index;
        if (numMoved > 0) {
            System.arraycopy(array, index, array, index + addedArray.length, numMoved);
        }
        System.arraycopy(addedArray, 0, array, index, addedArray.length);
        size += addedArray.length;
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            DynamicArray<?> v = (DynamicArray<?>) super.clone();
            elementData = array;
            v.elementData = Arrays.copyOf(elementData, size);
            return v;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public boolean contains(T value) {
        return indexOf(value) > -1;
    }

    public boolean containsAll(T[] innerArray) {
        for (T value : innerArray) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index) {
        T removedElement = null;
        T[] newArray = (T[]) new Object[array.length - 1];
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                removedElement = array[i];
                size -= 1;
            } else {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        return removedElement;
    }

    public boolean removeAll(T[] removalArray) {
        boolean result = false;
        for (int i = size - 1; i >= 0; i--) {
            for (T value : removalArray) {
                if (i < size){
                    if (array[i] == value) {
                        result = true;
                        remove(i);
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DynamicArray<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        DynamicArray<T> newArray = new DynamicArray<>();
        for (int i = 0; i < size; i++) {
            if (i >= fromIndex && i < toIndex) {
                newArray.add(array[i]);
            }
        }
        return newArray;
    }

    public T set(int index, T value) {
        T result = null;
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                result = array[i];
                array[i] = value;
            }
        }
        return result;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    public void trimToSize() {
        if (!isEmpty() && size < array.length) {
            T[] trimArray = (T[]) new Object[size];
            System.arraycopy(array, 0, trimArray, 0, trimArray.length);
            array = trimArray;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        if (toIndex < size) {
            T[] newArray = (T[]) new Object[size - (toIndex - fromIndex)];
            for (int i = 0, k = 0; i < size; i++) {
                if (i < fromIndex || i >= toIndex) {
                    newArray[k] = array[i];
                    k++;
                }
            }
            array = newArray;
            size -= toIndex - fromIndex;
        }
    }

    public void replaceAll(UnaryOperator<T> operator) {
        for (int i = 0; i < size; i++) {
            array[i] = operator.apply(array[i]);
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (array[i] == array[size - 1]) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]).append(", ");
            }
        }
        return sb.append("]").toString();
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
