package homework_16.melo_tutkhalyan.generic_dynamic_array;

import java.util.Arrays;

import static homework_15.melo_tutkhalyan.BubbleSort.bubbleSort;

public class DynamicArrayWithGeneric<T> {

    private Object[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 1024;

    public DynamicArrayWithGeneric(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArrayWithGeneric() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == this.array.length) {
            checkAndGrow();
        }
        this.array[size++] = value;
    }

    public T get(int index) {
        if ((index < 0) || (index > (size - 1))) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return (T) array[index];
    }

    public void addAll(T[] values) {
        if (size + values.length > this.array.length) {
            checkAndGrow();
        }
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    public void addByIndex(int index, T value) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        if (size == this.array.length) {
            checkAndGrow();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public void addAllByIndex(int index, T[] values) {
        int k = values.length;
        if (index > size) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        if (size + values.length > this.array.length) {
            checkAndGrow();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + values.length] = array[i];
        }
        for (int i = index; i < index + values.length; i++) {
            array[i] = values[values.length - k--];
        }
        size += values.length;

    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public DynamicArrayWithGeneric clone() {
        DynamicArrayWithGeneric clonedArray = new DynamicArrayWithGeneric(array.length);
        clonedArray.size = size;
        for (int i = 0; i < size; i++) {
            clonedArray.array[i] = this.array[i];
        }
        return clonedArray;
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

    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public boolean removeAll(T[] values) {
        if (values.length > array.length) {
            return false;
        }
        boolean modified = false;

        for (int i = 0; i < values.length; i++) {
            if (contains(values[i])) {
                remove(values[i]);
                modified = true;
            }
        }

        return modified;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public DynamicArrayWithGeneric subList(int from, int to) {
        if (from < 0 || to > this.size || from > to) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        DynamicArrayWithGeneric newSubList = new DynamicArrayWithGeneric(to - from);
        for (int i = from; i <= to; i++) {
            newSubList.add(this.array[i]);
        }
        return newSubList;

    }

    public T set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        T oldVal = (T) this.array[index];
        this.array[index] = value;
        return oldVal;
    }

    public void sort() {

    }

    public void trimToSize() {
        if (this.array.length > this.size) {
            Object[] newArray = new Object[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
    }

    private void checkAndGrow() {
        Object[] newArray = new Object[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void removeRange(int from, int to) {
        if (from < 0 || to > size || from > to) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        int count = to - from;
        for (int i = from; i < this.size - count; i++) {
            this.array[i] = this.array[i + count];
        }
        this.size -= count;
    }

    @Override
    public String toString() {
        return "DynamicArrayWithGeneric{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
