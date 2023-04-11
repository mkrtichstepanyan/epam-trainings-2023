package homework_16.araksya_ghazaryan.GenDynamicArray;

import java.util.Arrays;

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

    public void addAll(T[] values) {
        for (T value : values) {
            add(value);
        }
    }
    public T[] addByIndex(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return array;
    }

    public T[] addAllByIndex(int index, T[] values) {
        int originalSize = array.length;
        int newSize = originalSize + values.length;
        T[] tempArray = Arrays.copyOf(array, newSize);
        System.arraycopy(tempArray, index, tempArray, index + values.length, originalSize - index);
        System.arraycopy(values, 0, tempArray, index, values.length);
        array = tempArray;
        return tempArray;
    }
    public void replaceAll(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }
    public Object[] removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        int numToRemove = toIndex - fromIndex;
        System.arraycopy(array, toIndex, array, fromIndex, size - toIndex);
        size -= numToRemove;
        for (int i = size; i < size + numToRemove; i++) {
            array[i] = null;
        }
        return array;
    }
    public T[] trim() {
        if (size != 0) {
            array = Arrays.copyOfRange(array, 0, size);
        }
        return array;
    }
    public T[] set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
        System.out.println("In index - " + index + " is added - " + element);
        return array;
    }
    public GenericDynamicArray<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex >= toIndex) {
            throw new IndexOutOfBoundsException();
        }
        GenericDynamicArray<T> sublist = new GenericDynamicArray<T>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }
    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("array is empty");
            return true;
        } else {
            System.out.println("array is not empty");
        }
        return false;
    }
    public boolean removeAll(T element) {
        boolean removed = false;
        int dest = 0;
        for (int src = 0; src < size; src++) {
            if (array[src] != element) {
                array[dest] = array[src];
                dest++;
            } else {
                removed = true;
            }
        }
        if (removed) {
            System.out.println("Elements removed");
        } else {
            System.out.println("Elements not found");
        }
        Arrays.fill(array, dest, size, 0);
        size = dest;
        return removed;
    }
    public boolean remove(T element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("element does not found");
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        System.out.println("element deleted");
        return true;
    }
    public void indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("index of element " + element + " is: " + i);
            }
        }
        System.out.println("element not found");
    }
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("element contains in array");
                return true;
            }
        }
        System.out.println("element does not found");
        return false;
    }
    public boolean containsAll(GenericDynamicArray<T> collection) {
        for (int i = 0; i < collection.getSize(); i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (array[j].equals(collection.get(i))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Is not subset");
                return false;
            }
        }
        System.out.println("Is subset");
        return true;
    }
    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
        System.out.println("array now is clear");
    }

    public GenericDynamicArray<T> clone() {
        GenericDynamicArray<T> clone = new GenericDynamicArray<>();
        clone.array = Arrays.copyOf(this.array, this.array.length);
        clone.size = this.size;
        System.out.println("array was clone");
        return clone;
    }
    public int getSize() {
        return size;
    }
    public int getLength() {
        return array.length;
    }
    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("wrong index");
        }
        return array[index];
    }
    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }
}