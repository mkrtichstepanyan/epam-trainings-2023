package homework_16.yeghia_ansuryan.generic_dynamic_array;

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
public class GenericArray<T> {
    private Object[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;


    public GenericArray(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public GenericArray() {
        this.array = new Object[DEFAULT_CAPACITY];
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

    public void add(int index, T value) {
        get(index);
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return (T)array[index];
    }

    public void addAll(T[] dell) {
        for (T j : dell) {
            add(j);
        }
    }

    public void addAll(int index, T[] values) {
        get(index);
        int newSize = size + values.length;
        if (newSize > array.length) {
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(values, 0, newArray, index, values.length);
            System.arraycopy(array, index, newArray, index + values.length, size - index);
            array = newArray;
        } else {
            System.arraycopy(array, index, array, index + values.length, size - index);
            System.arraycopy(values, 0, array, index, values.length);
        }
        size = newSize;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object[] clone() {
        Object[] clone = new Object[size];
        System.arraycopy(array, 0, clone, 0, size);
        return clone;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] dell) {
        for (T j : dell) {
            if (!contains(j)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int indexOfRemove) {
        if (indexOfRemove < 0 || indexOfRemove >= size) {
            throw new IndexOutOfBoundsException("Index of remove " + indexOfRemove + " is not of bounds!");
        }
        Object oldValue = array[indexOfRemove];
        for (int i = indexOfRemove; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return (T)oldValue;
    }

    public boolean removeAll(T[] removeAllOfValue) {
        if (containsAll(removeAllOfValue)) {
            for (T i : removeAllOfValue) {
                remove(indexOf(i));
            }
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] subList(int startIndex, int endIndex) {
        checkStartAndEndIndexes(startIndex, endIndex);
        return (T[])Arrays.copyOfRange(array, startIndex, endIndex);
    }

    public T set(int index, T element) {
        Object oldElement = array[index];
        array[index] = element;
        return (T)oldElement;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (int i = 0; i < size; i++) {
            toString.append(array[i]).append(" ");
        }
        return String.valueOf(toString);
    }

    public void trimToSize() {
        array = Arrays.copyOf(array, size);
    }

    public void removeRange(int startIndex, int lastIndex) {
        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = startIndex; i < lastIndex; i++) {
            remove(startIndex);
        }
    }

    public void replaceAll(Object[] hp) {
        if (hp.length == size) {
            System.arraycopy(hp, 0, array, 0, size);
        } else {
            System.out.println("Wrong size of array");
        }
    }

    private void extend() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private void checkStartAndEndIndexes(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > size) {
            throw new ArrayIndexOutOfBoundsException("Start index is wrong");
        }
        if (endIndex < 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException("End index is wrong");
        }
        if (startIndex >= endIndex) {
            throw new IllegalArgumentException("Start index should be greater than end index.");
        }
    }
}
