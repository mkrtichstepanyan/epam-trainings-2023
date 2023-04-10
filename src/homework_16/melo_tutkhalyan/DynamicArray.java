package homework_16.melo_tutkhalyan;

import java.util.Arrays;

import static homework_15.melo_tutkhalyan.BubbleSort.bubbleSort;

public class DynamicArray {

    private int[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 1024;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (size == this.array.length) {
            checkAndGrow();
        }
        this.array[size++] = value;
    }

    public int get(int index) {
        if ((index < 0) || (index > (size - 1))) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void addAll(int[] values) {
        if (size + values.length > this.array.length) {
            checkAndGrow();
        }
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    public void clear() {
        Arrays.fill(array, 0);
        size = 0;
    }

    public DynamicArray clone() {
        DynamicArray clonedArray = new DynamicArray(array.length);
        clonedArray.size = size;
        for (int i = 0; i < size; i++) {
            clonedArray.array[i] = this.array[i];
        }
        return clonedArray;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] values) {
        for (int value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int value) {
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

    public boolean removeAll(int[] values) {
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

    public boolean isEmpty(){
        return this.size == 0;
    }

    public DynamicArray subList(int from, int to) {
        if (from < 0 || to > this.size || from > to) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        DynamicArray newSubList = new DynamicArray(to - from);
        for (int i = from; i <= to; i++) {
            newSubList.add(this.array[i]);
        }
        return newSubList;

    }

    public int set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index error!");
        }
        int oldVal = this.array[index];
        this.array[index] = value;
        return oldVal;
    }

    public void sort() {
        bubbleSort(this.array);

    }

    public void trimToSize() {
        if (this.array.length > this.size) {
            int[] newArray = new int[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
    }

    private void checkAndGrow() {
        int[] newArray = new int[array.length + array.length / 2];
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
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
