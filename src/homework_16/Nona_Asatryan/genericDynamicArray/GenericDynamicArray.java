package homework_16.Nona_Asatryan.genericDynamicArray;


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
public class GenericDynamicArray<T> implements Cloneable {

    private T[] array;
    private int size;
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
        return this.size;
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void addAll(T[] elements) {
        for (T element : elements) {
            add(element);
        }
    }

    public void addByIndex(int index, T value) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("index is out of bounds");
        }
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        newArray[index] = value;
        array = newArray;
    }

    public void addAllByIndex(int startIndex, T... values) {
        if (startIndex < 0 || startIndex > array.length) {
            throw new IndexOutOfBoundsException("startIndex is out of bounds");
        }
        T[] newArray = (T[]) new Object[array.length + values.length];

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
    public GenericDynamicArray<T> clone() {
        GenericDynamicArray<T> copy = new GenericDynamicArray<T>(array.length);
        for (T t : array) {
            copy.add(t);
        }
        return copy;
    }

    public void clear() {
        Arrays.fill(array, 0);
    }

    public boolean contains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] array) {
        for (T item : array) {
            boolean found = false;
            for (T element : array) {
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

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void remove(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
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
        size--;
    }

    public T[] removeAll(T... elementsToRemove) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean remove = false;
            for (T element : elementsToRemove) {
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

    public T[] subList(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > endIndex || endIndex > size) {
            throw new IndexOutOfBoundsException("Invalid range: [" + startIndex + ", " + endIndex + ")");
        }
        T[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
        for (T item : subArray) {
            System.out.print(item + ", ");
        }
        return subArray;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        array[index] = value;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Comparable<T> comparable = (Comparable<T>) array[j];
                Comparable<T> comparable1 = (Comparable<T>) array[j + 1];
                if (comparable.compareTo((T) comparable1) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void trimToSize() {
        if (array.length > size) {
            T[] newArray = (T[]) new Object[size];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public T[] removeRange(int start, int end) {
        T[] newArray = (T[]) new Object[array.length - (end - start)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < start || i >= end) {
                newArray[index] = array[i];
                index++;
            }
        }
        array = newArray;
        size = newArray.length;
        return newArray;
    }

    public void replaceAll(T oldValue, T newValue) {
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
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
