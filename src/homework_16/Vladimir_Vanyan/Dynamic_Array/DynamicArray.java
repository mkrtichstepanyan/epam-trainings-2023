package homework_16.Vladimir_Vanyan.Dynamic_Array;

public class DynamicArray {
    private int[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than zero");
        }
    }

    public DynamicArray() {
        array = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Wrong index");
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

    // addAll() -> adds all elements of a collection to arraylist
    public void addAll(int[] elements) {
        if (array.length - size < elements.length) {
            extend();
        }
        for (int i = 0; i < elements.length; i++) {
            array[size++] = elements[i];
        }

    }

    // prints array
    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // clear() -> removes all the elements from arraylist
    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // clone() -> makes a copy of the array list
    public int[] clone() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    // contains() -> checks if the element is present in the arraylist
    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    // containsAll() -> checks if a collection is a subset of arraylist
    public boolean containsAll(int[] elements) {
        for (int i : elements) {
            if (!contains(i)) {
                return false;
            }
        }
        return true;
    }

    // indexOf() -> returns the position of the specified element
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // remove() -> removes the single element from the arraylist
    public void remove(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                array[i] = 0;
            }
        }

    }

    // removeAll() -> removes multiple elements from the arraylist
    public void removeAll(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < size; j++) {
                if (elements[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }

    // isEmpty() -> checks if the arraylist is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // subList() -> returns a portion of the arraylist
    public int[] subList(int startIndex, int endIndex) {
        int arrSize = endIndex - startIndex;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = array[startIndex++];
        }
        return arr;
    }

    // set() -> replace the single element from an arraylist
    public void set(int element, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        array[index] = element;

    }

    // sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
    public void sort() {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // toString() -> converts the arraylist into a String
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

    // trimToSize() -> trims the capacity of arraylist equal to the size
    public void trimToSize() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = array[i];
        }
        array = arr;

    }

    // removeRange() -> removes a portion of the arraylist
    public void removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size || startIndex > endIndex) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, endIndex, array, startIndex, size - endIndex);
        size -= endIndex - startIndex;
    }

    // replacteAll() -> replace all elements from the arraylist
    public void replaceAll(int element, int replacement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                array[i] = replacement;
            }
        }
    }
}
