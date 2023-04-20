package homework_16.Argishti_Mesropyan.Generic_Dynamic_Array;

import java.util.*;

public class DynamicArray<T> {
/* Please create methods below +
   addAll() -> adds all elements of a collection to arraylist +
   clear() -> removes all the elements from arraylist +
   clone() -> makes a copy of the array list +
   contains() -> checks if the element is present in the arraylist +
   containsAll() -> checks if a collection is a subset of arraylist +
   indexOf() -> returns the position of the specified element +
   remove() -> removes the single element from the arraylist +
   removeAll() -> removes multiple elements from the arraylist +
   isEmpty() -> checks if the arraylist is empty +
   subList() -> returns a portion of the arraylist +
   set() -> replace the single element from an arraylist +
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
   toString() -> converts the arraylist into a String +
   trimToSize() -> trims the capacity of arraylist equal to the size +
   removeRange() -> removes a portion of the arraylist +
   replaceAll() -> replace all elements from the arraylist +
 */

    private T[] array;

    private int size = 0;

    public static final int DEFAULT_CAPACITY = 16;

    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Array length must be bigger then 0");
        } else {
            this.array = (T[]) new Object[capacity];

        }
    }

    public DynamicArray() {
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

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void addAll(Collection<T> elements) {
        for (T element : elements) {
            add(element);
        }
    }


    public void addAllInt(Integer[] array2) {
        for (Integer element : array2)
            add((T) element);
    }

    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public DynamicArray<T> clone() {
        DynamicArray<T> clone = new DynamicArray<>(array.length);
        for (int i = 0; i < size; i++) {
            Object object;
            object = array[i];
            clone.add((T) object);
        }
        return clone;
    }

    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] elements) {
        if (elements.length > size) {
            return false;
        }
        for (T elemnt : elements) {
            boolean contains = contains(elemnt);
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T value) {
        if (value == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])) {
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
            System.out.println("Element not found! ");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void removeAll(T[] values) {
        for (T value : values) {
            remove(value);
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("the array is empty, ");
            return true;
        } else
            System.out.println("the array is not empty");
        return false;
    }

    List<T> subList(int fromIndex, int toIndex) {
        List<T> sublist = new ArrayList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds! ");
        }
        array[index] = value;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(array, 0, size, comparator);
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) array[j]).compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void trimToSize() {
        if (size < array.length) {
            T[] newArray = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size || toIndex < 0 || toIndex > size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = null;
        }
        for (int i = toIndex; i < size; i++) {
            array[i - (toIndex - fromIndex)] = array[i];
        }
        size -= (toIndex - fromIndex);
    }

    public void replaceAll(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }
}