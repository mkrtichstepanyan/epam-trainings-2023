package homework_16.Ani_Barseghyan;

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


    DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array capacity must be bigger than 0");
        }
    }

    DynamicArray() {
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

    public void addAll(int[] arr) {
        if (size == array.length) {
            extend();
        }
        for (int j : arr) {
            array[size++] = j;
        }
    }

    public void clear() {
        Arrays.fill(array, 0);
        size = 0;
    }

    public int[] cloneArr() {
        int[] clonedArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            clonedArr[i] = array[i];
        }
        return clonedArr;
    }

    public boolean contains(int value) {
        for (int j : array) {
            if (value == j) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (contains(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i])
                return i;
        }
        return -1;
    }

    public int[] remove(int value) {
        int index = indexOf(value);
        if (index > 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        return array;
    }

    public int[] removeAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (containsAll(arr)) {
                remove(arr[i]);
            }
        }
        return array;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DynamicArray subList(int startIndex, int lastIndex) {

        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        DynamicArray subArr = new DynamicArray(lastIndex - startIndex);
        for (int i = startIndex; i < lastIndex; i++) {
            subArr.add(array[i]);
        }
        return subArr;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Array index can not be less than 0 and big than size");
        }
        array[index] = value;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i != size - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');

        return stringBuilder.toString();
    }

    public int get(int index) {
        if (index < 0 || index > array.length - 1) {
            throw new IllegalArgumentException("Array index can not be less than 0 ");
        }
        return array[index];
    }

    public void trimToSize() {
        int[] trimArr = new int[size];
        for (int i = 0; i < size; i++) {
            trimArr[i] = array[i];
        }
        array = trimArr;
    }

    public void removeRange(int startIndex, int lastIndex) {
        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        DynamicArray arr = subList(startIndex, lastIndex);
        for (int i = startIndex; i < lastIndex; i++) {
            removeAll(arr.cloneArr());
        }
    }

    public int[] replaceAll() {
        for (int i = 0; i < size; i++) {
            array[i] = array[i] + 1;
        }
        return array;
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
