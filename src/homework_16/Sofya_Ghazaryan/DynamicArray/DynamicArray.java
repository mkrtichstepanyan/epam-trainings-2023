package homework_16.Sofya_Ghazaryan.DynamicArray;


import homework_15.Sofya_Ghazaryan.SelectionSort;

import java.util.Arrays;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist
   clear() -> removes all the elements from arraylist
   clone() -> makes a copy of the array list
   contains() -> checks if the element is present in the arraylist
   containsAll() -> checks if a collection is a subset of arraylist
   indexOf() -> returns the position of the specified element
   remove() -> removes the single element from the arraylist
   removeAll() -> removes multiple elements from the arraylist
   isEmpty() -> checks if the arraylist is empty
   subList() -> returns a portion of the arraylist
   set() -> replace the single element from an arraylist
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
   toString() -> converts the arraylist into a String
   trimToSize() -> trims the capacity of arraylist equal to the size
   removeRange() -> removes a portion of the arraylist
   replaceAll() -> replace all elements from the arraylist
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
        System.out.println("Tne value was added in array.");
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


    public void addAll(int[] elements) {
        if (size == array.length) {
            this.extend();
        }
        for (int element : elements) {
            this.array[this.size++] = element;
        }
        System.out.println("All elements was added in Array.");
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
            System.out.println("The array was cleared.");
        }
    }

    public int[] clone(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println("The array was cloned.");
        return newArray;
    }

    public boolean contains(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(element + " exists in array.");
                return true;
            }
        }
        System.out.println(element + " does not exist.");
        return false;
    }

    public boolean containsAll(int[] arr) {
        for (int i : arr) {
            boolean containedElement = false;
            for (int j : array) {
                if (i == j) {
                    containedElement = true;
                    break;
                }
            }
            if (!containedElement) {
                System.out.println("The Array does not contain All elements from given array.");
                return false;
            }
        }
        System.out.println("The Array contains All elements from given array.");
        return true;
    }

    public int indexOf(int value) {
        int index = 0;
        if (contains(value) == true) {
            for (int i = 0; i < array.length; i++) {
                index = i;
                if (array[i] == value) {
                    System.out.println("Index of " + value + " is: " + index);
                    return index;
                }
            }
        } else {
            System.out.println(value + " does not exist in array.");
        }
        return index;
    }

    public void remove(int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element does not exist.");
            return;
        }
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        size--;
        System.out.println(value + " was deleted.");
    }

    public void removeAll(int[] elements) {
        for (int element : elements) {
            remove(element);
        }
        System.out.println("All elements were deleted.");
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("The array is empty.");
            return true;
        } else {
            System.out.println("The array isn't empty.");
        }
        return false;
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];
        if (startIndex < 0 || endIndex > size || startIndex >= endIndex) {
            System.err.println("Illegal indexes, please try again.");
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                subArray[i - startIndex] = array[i];
            }
            for (int i : subArray) {
                System.out.print(" [" + i + "] ");
            }
        }
        return subArray;
    }

    public void set(int index, int value) {
        if (index >= size || index < 0) {
            System.err.println("Illegal index.");
            return;
        }
        this.array[index] = value;
        System.out.println("In index " + index + " was changed. New element is: " + value);
    }

    public int[] sort(int[] arr) {
        SelectionSort.selectionSort(arr);
        System.out.print("Array after sorting: ");
        for (int i :
                arr) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
        return arr;
    }

    public String toString(int[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i != arr.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
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

    public int[] removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size || startIndex > endIndex) {
            System.err.println("Illegal indexes, please try again.");
        }
        int removeNum = endIndex - startIndex;
        System.arraycopy(array, endIndex, array, startIndex, size - endIndex);
        size -= removeNum;
        for (int i = size; i < size + removeNum; i++) {
            array[i] = 0;
        }
        return array;
    }

    public void replaceAll(int index, int[] elements) {
        if (index >= size || index < 0) {
            System.err.println("Illegal indexes, please try again.");
            return;
        }
        if (index + elements.length > size) {
            System.err.println("Size is not correct.");
            return;
        }
        for (int element :
                elements) {
            array[index++] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
