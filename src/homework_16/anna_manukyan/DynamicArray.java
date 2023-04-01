package homework_16.anna_manukyan;


import homework_15.anna_manukyan.MergeSort;

import java.util.Arrays;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist +
   clear() -> removes all the elements from arraylist +
   clone() -> makes a copy of the array list +
   contains() -> checks if the element is present in the arraylist +
   containsAll() -> checks if a collection is a subset of arraylist
   indexOf() -> returns the position of the specified element +
   remove() -> removes the single element from the arraylist +
   removeAll() -> removes multiple elements from the arraylist +
   isEmpty() -> checks if the arraylist is empty +
   subList() -> returns a portion of the arraylist +
   set() -> replace the single element from an arraylist +
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...) +
   toString() -> converts the arraylist into a String +
   trimToSize() -> trims the capacity of arraylist equal to the size +
   removeRange() -> removes a portion of the arraylist +
   replaceAll() -> replace all elements from the arraylist +
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

    public void addAll(int[] list) {
        for (int i = 0; i < list.length; i++) {
            add(list[i]);
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        array[index] = value;
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                array[i] = 0;
            }
        }
    }

    public int[] copy() {
        int[] listCopy = new int[size];
        for (int i = 0; i < size; i++) {
            listCopy[i] = array[i];
        }
        return listCopy;
    }

    public boolean contains(int element) {
        if (!isEmpty()) {
            for (int item : array) {
                if (item == element) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(int[] list) {
        boolean isContains = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < list.length; j++) {
                if (contains(list[j])) {
                    isContains = true;

                } else {
                    isContains = false;
                    return isContains;
                }
            }
        }
        return isContains;
    }

    public boolean remove(int element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    array[i] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeAll(int[] list) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < list.length; j++) {
                    if (array[i] == list[j]) {
                        array[i] = 0;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int[] subList(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size - 1) || (toIndex < 0 || toIndex > size - 1) || (fromIndex > toIndex)) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        } else {
            int[] subList = Arrays.copyOfRange(array, fromIndex, toIndex + 1);
            return subList;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size - 1) || (toIndex < 0 || toIndex > size - 1) || (fromIndex > toIndex)) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        } else {
            for (int i = fromIndex; i < toIndex; i++) {
                array[i] = 0;
            }
        }
    }

    public void replaceAll(int[] list) {
        if (list.length <= size) {
            for (int i = 0; i < list.length; i++) {
                array[i] = list[i];
            }
        } else {
            throw new IndexOutOfBoundsException("List is bigger than array");
        }
    }

    public int indexOf(int element) {
        if (!isEmpty() && contains(element)) {
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
        }
        System.out.println("Array does not contain this element.");
        return 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int get(int index) {
        if (isEmpty()) {
            System.out.println("Array is empty.");
            System.exit(1);
        }
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void sort() {
        MergeSort.sortArray(array);
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        String prefix = "[ ";
        String suffix = " ]";
        String toString = "";
        for (int item : this.array) {
            toString += item + ", ";
        }
        return prefix + toString + suffix;
    }

}
