package homework_16.Lilit_Adamyan.generic_dynamic_array;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


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

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void addAll(T[] values) {
        for (T value : values) {
            add(value);
        }
    }

    public void clear() {
        size = 0;
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public DynamicArray<T> clone() {
        DynamicArray<T> clone = new DynamicArray<T>(this.array.length);
        for (int i = 0; i < this.size; i++) {
            clone.add(this.array[i]);
        }
        return clone;
    }


    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    public boolean containsAll(T[] values) {
        for (T value : values) {
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

    public void removeAt(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remove(T value) {
        int index = indexOf(value);
        if (index != -1) {
            removeAt(index);
        }
    }

    public void removeAll(T[] values) {
        for (T value : values) {
            remove(value);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, T value) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        array[index] = value;
    }

    public void sort() {
        Arrays.sort(array, 0, size);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void trimToSize() {
        if (size < array.length) {
            T[] newArray = (T[]) new Object[size];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

    }

    public void replaceAll(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }

    public <T> DynamicArray<T> subList(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= size || endIndex < 0 || endIndex > size || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        DynamicArray<T> subList = new DynamicArray<>(endIndex - startIndex);
        for (int i = startIndex; i < endIndex; i++) {
            subList.add((T) array[i]);
        }
        return subList;
    }

    public void addByIndex(int index, T value) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public void addAllByIndex(int index, T[] values) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        while (size + values.length > array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + values.length] = array[i];
        }
        System.arraycopy(values, 0, array, index + 0, values.length);
        size += values.length;
    }

}
