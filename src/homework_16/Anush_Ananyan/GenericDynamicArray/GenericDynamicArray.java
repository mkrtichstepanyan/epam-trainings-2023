package homework_16.Anush_Ananyan.GenericDynamicArray;


import homework_15.Anush_Ananyan.SelectionSort;

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

    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void addAll(T[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            add(arrayList[i]);
        }
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
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

    public void clear() {
        size = 0;
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public GenericDynamicArray<T> cloneArr() {
        GenericDynamicArray<T> newArray = new GenericDynamicArray<>(array.length);
        newArray.size = size;
        System.arraycopy(array, 0, newArray.array, 0, size);
        return newArray;
    }

    public boolean contains(T value) {
        for (T item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            if (!contains(arrayList[i])) {
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
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public void removeAll(T[] arrayList) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arrayList.length; j++) {
                if (arrayList[j] == array[i]) {
                    remove(array[i]);
                }
            }
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public T[] subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > size || toIndex < 0 || toIndex > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new NegativeArraySizeException();
        }

        T[] subArray = Arrays.copyOfRange(array, fromIndex, toIndex + 1);
        return subArray;
    }

    public void set(int index, T value) { ////////////???????????
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = value;
    }


    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if ((array[j] != null) && (((Comparable<T>) array[j]).compareTo(array[j + 1]) > 0)) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i < array.length - 1) {
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void trimToSize() {
        T[] trimedArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            trimedArray[i] = array[i];
        }
        array = trimedArray;
    }

    public void removeRange(int fromIndex, int toIndex) {
        int newArrayLength = size - (toIndex - fromIndex + 1);
        T[] newArray = (T[]) new Object[newArrayLength];
        if (fromIndex < 0 || fromIndex > size || toIndex < 0 || toIndex > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new NegativeArraySizeException();
        }
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (i < fromIndex || i > toIndex) {
                newArray[k] = array[i];
                k++;
            }
        }
        size -= (toIndex - fromIndex + 1);
        array = newArray;
    }

    /**
     * replaceAll() method doubled all elements of array, if there are Integer type.
     */
//    public void replaceAll()  {
//
//    }


    public boolean addByIndex(int index, T value) {
        if (index < 0 || index > array.length) {
            return false;
        } else {
            T[] newArray = (T[]) new Object[array.length + 1];

            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            array = newArray;
            size++;
            return true;
        }
    }


    public boolean addAllByIndex(int index, T[] arrayList) {  ///??????????????

        T[] newArray = (T[]) new Object[size + arrayList.length];
        if (index < 0 || index > size) {
            return false;
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            int k = 0;
            for (int i = index; i < index + arrayList.length; i++) {
                newArray[i] = arrayList[k];
                k++;
            }
            for (int i = index + arrayList.length; i < size + arrayList.length; i++) {
                newArray[i] = array[index];
                index++;
            }
        }
        size +=arrayList.length;
        array = newArray;
        return true;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
