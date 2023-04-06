package homework_16.araksya_ghazaryan;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


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
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }
    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(int[] values) {
        for (int value : values) {
            add(value);
        }
    }
    public void clear() {
        size = 0;
        Arrays.fill(array, 0);
    }
    public DynamicArray clone() {
        DynamicArray clone = new DynamicArray(this.array.length);
        for (int i = 0; i < this.size; i++) {
            clone.add(this.array[i]);
        }
        return clone;
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
    public void removeAt(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
    public void remove(int value) {
        int index = indexOf(value);
        if (index != -1) {
            removeAt(index);
        }
    }
    public void removeAll(int[] values) {
        for (int value : values) {
            remove(value);
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        array[index] = value;
    }
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
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
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

    }
    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }
}