package homework_16.hovhannes_Gspeyan.dynamicArray;

import homework_15.hovhannes_gspeyan.sorting_algorithms.SelectionSort;

import java.util.Collection;

public class DynamicArray {

    private int[] arr;

    private int size;

    private static final int DEFAULT_CAPACITY = 16;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == -1;
    }

    public void add(int value) {
        if (size == arr.length) {
            extend();
        }
        arr[size++] = value;
    }

    public void addAll(int[] values) {
        if (size == arr.length) {
            this.extend();
        }
        for (int value : values) {
            this.arr[this.size++] = value;
        }

    }

    public int get(int index) {
        if (index < 0 || index < size - 1) {
            throw new IndexOutOfBoundsException("Illegal index! ");
        }
        return arr[index];
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public int[] cloneArr(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    public boolean contains(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] array) {
        for (int i : array) {
            boolean found = false;
            for (int j : arr) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        int index;
        for (int i = 0; i < arr.length; i++) {
            index = i;
            if (arr[i] == value) {
                return index;
            }
        }
        return -1;
    }

    public void remove(int value) {
        int indexToRemove = -1;
        for (int i = 0; i < this.size; i++) {
            if (arr[i] == value) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Element not found! ");
            return;
        }
        for (int i = indexToRemove + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        this.size--;
    }

    public void removeAll(int[] values) {
        for (int value : values) {
            this.remove(value);
        }
        this.trimToSize();
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arr[i];
        }
        for (int i : subArray) {
            System.out.print(i + " | ");
        }
        return subArray;
    }

    public void set(int index, int value) {
        if (index >= this.size || index < 0) {
            System.out.println("Array index error! ");
            return;
        }
        this.arr[index] = value;
    }

    public void replaceAll(int index, int[] values) {
        if (index >= this.size || index < 0) {
            System.out.println("Array index error! ");
            return;
        }
        if (index + values.length > this.size) {
            System.out.println("Array size error! ");
            return;
        }
        for (int value : values) {
            this.arr[index++] = value;
        }
    }
    public int[] sortArray(int[]array){
        SelectionSort.selectionSort(array);
        for (int i : array) {
            System.out.print(i + " | ");
        }
        return array;
    }
    public String toString(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
    public int[] removeRange(int startIndex, int endIndex, int[] array) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            System.out.println("Invalid range! ");
            return null;
        }

        int[] newArray = new int[array.length - (endIndex - startIndex + 1)];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < startIndex || i > endIndex) {
                newArray[j] = array[i];
                j++;
            }
        }

        return newArray;
    }

    public void trimToSize() {
        if (this.arr.length > this.size) {
            int[] newArray = new int[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.arr[i];
            }
            this.arr = newArray;
        }
    }

    public void printArray() {
        for (int i : arr) {
            System.out.print(i + " | ");
        }
    }

    private void extend() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
