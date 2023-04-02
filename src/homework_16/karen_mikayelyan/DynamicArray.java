package homework_16.karen_mikayelyan;

import java.util.ArrayList;

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

    public void addAll(ArrayList<Integer> arrayList) {
        for (Integer value : arrayList) {
            add(value);
        }
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void clear() {
        size = 0;
        array = new int[DEFAULT_CAPACITY];
    }

    public DynamicArray clone() {
        DynamicArray cloned = new DynamicArray(array.length);
        cloned.size = size;
        System.arraycopy(array, 0, cloned.array, 0, size);
        return cloned;
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(ArrayList<Integer> arrayList) {
        for (Integer value : arrayList) {
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

    public boolean remove(int element) {
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

    public boolean removeAll(ArrayList<Integer> arrayList) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (arrayList.contains(array[i])) {
                remove(array[i]);
                modified = true;
            }
        }
        return modified;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DynamicArray subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Wrong range");
        }
        DynamicArray subList = new DynamicArray(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    public int set(int index, int number) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        int oldValue = array[index];
        array[index] = number;
        return oldValue;
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

    @Override
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

    public void trimToSize() {
        if (size < array.length) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Wrong index range");
        }
        System.arraycopy(array, toIndex, array, fromIndex, size - toIndex);
        size -= toIndex - fromIndex;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }
}

