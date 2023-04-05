package homework_16.Nona_Asatryan.dynamicArray;


import homework_15.Nona_Asatryan.sorting_algorithms.BubbleSort;

import java.util.Arrays;

/* Please create methods below
V   addAll() -> adds all elements of a collection to arraylist
V   addByIndex () -> added new value without replacing
V   addAllByIndex () -> added new values without replacing
V   clear() -> removes all the elements from arraylist
V   clone() -> makes a copy of the array list
V   contains() -> checks if the element is present in the arraylist
V   containsAll() -> checks if a collection is a subset of arraylist
V   indexOf() -> returns the position of the specified element
V   remove() -> removes the single element from the arraylist
V   removeAll() -> removes multiple elements from the arraylist
V   isEmpty() -> checks if the arraylist is empty
V   subList() -> returns a portion of the arraylist
V   set() -> replace the single element from an arraylist
V   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
V   toString() -> converts the arraylist into a String
V   trimToSize() -> trims the capacity of arraylist equal to the size
V   removeRange() -> removes a portion of the arraylist
V   replaceAll() -> replace all elements from the arraylist
 */
public class DynamicArray {

    private int[] array;

    private int size;

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
        return this.size;
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

    public void addAll(int[] elements) {
        for (int element : elements) {
            add(element);
        }
    }

    public void addByIndex(int index, int value) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("startIndex is out of bounds");
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }

    public void addAllByIndex(int startIndex, int... values) {
        if (startIndex < 0 || startIndex > array.length) {
            throw new IndexOutOfBoundsException("startIndex is out of bounds");
        }
        int[] newArray = new int[array.length + values.length];

        for (int i = 0; i < startIndex; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < values.length; i++) {
            newArray[startIndex + i] = values[i];
        }
        for (int i = startIndex; i < array.length; i++) {
            newArray[values.length + i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
    }
    public DynamicArray clone() {
        DynamicArray copy = new DynamicArray(array.length);
        for (int i = 0; i < array.length; i++) {
            copy.add(array[i]);
        }
        return copy;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] array) {
        for (int item : array) {
            boolean found = false;
            for (int element : array) {
                if (item == element) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int value) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element does not found.");
            return;
        }
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        this.size--;
    }

    public int[] removeAll(int... elementsToRemove) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean remove = false;
            for (int element : elementsToRemove) {
                if (array[i] == element) {
                    remove = true;
                    break;
                }
            }
            if (!remove) {
                array[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(array, index);
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = array[i];
        }
        for (int i : subArray) {
            System.out.print(i + ", ");
        }
        return subArray;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        array[index] = value;
    }

    public void sort() {
        BubbleSort.bubbleSort(array);
    }

    public void trimToSize() {
        if (array.length > size) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public int[] removeRange(int start, int end) {
        int[] newArray = new int[array.length - (end - start)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < start || i >= end) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
