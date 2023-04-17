package homework_16.Anush_Ananyan.DynamicArray;


import homework_15.Anush_Ananyan.SelectionSort;

import java.util.Arrays;

/* Please create methods below
  + addAll() -> adds all elements of a collection to arraylist
  + clear() -> removes all the elements from arraylist
  + clone() -> makes a copy of the array list
  + contains() -> checks if the element is present in the arraylist
  + containsAll() -> checks if a collection is a subset of arraylist
  + indexOf() -> returns the position of the specified element
  + remove() -> removes the single element from the arraylist
  + removeAll() -> removes multiple elements from the arraylist
  + isEmpty() -> checks if the arraylist is empty
  + subList() -> returns a portion of the arraylist
  + set() -> replace the single element from an arraylist
  + sort() -> sort the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
  + toString() -> converts the arraylist into a String
  + trimToSize() -> trims the capacity of arraylist equal to the size
  + removeRange() -> removes a portion of the arraylist
  + replaceAll() -> replace all elements from the arraylist
  + addByIndex () -> added new value without replacing
  + addAllByIndex () -> added new values without replacing
 */
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

    public void addAll(int[] arrayList) {
        for (int j : arrayList) {
            add(j);
        }
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }


    public void clear() {
        size = 0;
        array = new int[DEFAULT_CAPACITY];
    }

    public int[] cloneArr() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    public boolean contains(int value) {
        for (int i = 0; i < size + 1; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] arrayList) {
        for (int j : arrayList) {
            if (!contains(j)) {
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
        System.out.print("This value does not exist ");
        return -1;
    }

    public boolean remove(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                while (i < array.length - 1) {
                    array[i] = array[i + 1];
                    i++;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void removeAll(int[] arrayList) {
        for (int i = 0; i < size; i++) {
            for (int k : arrayList) {
                if (k == array[i]) {
                    remove(array[i]);
                }
            }
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int[] subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size || toIndex < 0 || toIndex >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new NegativeArraySizeException();
        }

        return Arrays.copyOfRange(array, fromIndex, toIndex + 1);
    }

    public void set(int index, int value) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = value;
    }

    public void sort() {
        SelectionSort.sort(array);
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
        int[] trimedArray = new int[size];
        for (int i = 0; i < trimedArray.length; i++) {
            trimedArray[i] = array[i];
        }
        array = trimedArray;
    }

    public void removeRange(int fromIndex, int toIndex) {
        int newArrayLength = size - ((toIndex - fromIndex) + 1);
        int[] newArray = new int[newArrayLength];

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
        array = newArray;
        size = newArrayLength;
    }

    /**
     * replaceAll() method doubled all elements of array.
     */
    public void replaceAll() {
        int[] newArray;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] *= 2;
        }
    }

    public boolean addByIndex(int index, int value) {
        if (index < 0 || index >= size) {
            return false;
        } else {
            int[] newArray = new int[size + 1];

            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            System.arraycopy(array, index, newArray, index + 1, size - index);
            size++;
            array = newArray;
            return true;
        }
    }

    public boolean addAllByIndex(int index, int[] arrayList) {

        int[] newArray = new int[size + arrayList.length];
        if (index < 0 || index >= size) {
            return false;
        } else {
            System.arraycopy(array, 0, newArray, 0, index);
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
        array = newArray;
        size += arrayList.length;
        return true;
    }
}
