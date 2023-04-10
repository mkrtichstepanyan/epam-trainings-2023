package homework_16.Alina_Mkhoyan.generic_dynamic_array;

import java.util.*;

public class GenericDynamicArray<T> {

    private T[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = (T[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public GenericDynamicArray() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void addAll(Collection<? extends T> collection) {
        for (T value : collection) {
            add(value);
        }
    }

    public void addByIndex(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    public void addAllByIndex(int index, Collection<? extends T> c) {
        ensureCapacity(size + c.size());
        System.arraycopy(array, index, array, index + c.size(), size - index);
        int i = index;
        for (T e : c) {
            array[i++] = e;
        }
        size += c.size();
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(array.length * 2, minCapacity);
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public int getSize() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void clear() {
        size = 0;
        Arrays.fill(array, 0);
    }

    public GenericDynamicArray<T> clone() {
        GenericDynamicArray<T> cloned = new GenericDynamicArray<>(array.length);
        cloned.size = size;
        System.arraycopy(array, 0, cloned.array, 0, size);
        return cloned;
    }

    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends T> collection) {
        for (T value : collection) {
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

    public boolean remove(T element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public boolean removeAll(Collection<? extends T> collection) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (collection.contains(array[i])) {
                remove(array[i]);
                modified = true;
            }
        }
        return modified;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public GenericDynamicArray<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        GenericDynamicArray<T> subList = new GenericDynamicArray<>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("wrong index");
        }
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Comparable<T> a = (Comparable<T>) array[j];
                Comparable<T> b = (Comparable<T>) array[j + 1];
                if (a.compareTo((T) b) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index range");
        }
        System.arraycopy(array, toIndex, array, fromIndex, size - toIndex);
        size -= toIndex - fromIndex;
    }

    public void replaceAll(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}