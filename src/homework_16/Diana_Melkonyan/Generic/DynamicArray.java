package homework_16.Diana_Melkonyan.Generic;


import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

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
public class DynamicArray<T> {
    private T[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        } else {
            this.array = (T[]) new Object[capacity];
        }
    }

    public DynamicArray() {

        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }


    public void add(T element) {
        if (size == array.length) {
            extend();
        }
        array[size++] = element;
    }

    public void addAll(Collection<T> c) {
        for (T value : c) {
            add(value);
        }
    }

    public void addByIndex(int index, T item) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];

        }
        array[index] = item;
        size++;
    }

    public void addAllByIndex(int index, T[] c) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Wrong index.");
        }
        while (size+c.length>array.length){
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i + c.length] = array[i];

        }
    System.arraycopy(c,0,array,index,c.length);

           size+=c.length;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }


    //--------------------------------------------------------------------
    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;

    }

    //--------------------------------------------------------------------
    public DynamicArray<T> clone() {
        DynamicArray<T> clone = new DynamicArray<>(array.length);
        clone.size = size;
        System.arraycopy(array,0,clone.array,0,size);
        return clone;
    }

    //--------------------------------------------------------------------
    public boolean remove(T element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        size++;
        for (int i =index; i < size-1; i++) {
            array[i]=array[i+1];
        }
        size--;
        return true;
    }


    //--------------------------------------------------------------------
    public boolean removeAll(T element) {
        boolean removed = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != element) {

                array[index] = array[i];
                index++;

            } else {
                removed = true;
            }
        }
        size = index;
        return removed;
    }

    //--------------------------------------------------------------------
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                string += array[i] + ", ";
            } else {
                string += array[i];
            }
        }
        return string;
    }

    //--------------------------------------------------------------------
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                Comparable<T> o1 = (Comparable<T>) array[j];
                Comparable<T> o2 = (Comparable<T>) array[j + 1];
                if (o1.compareTo((T) o2) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //--------------------------------------------------------------------
    public boolean izEmpty() {
        return size == 0;
    }

    //--------------------------------------------------------------------
    public T[] subList(int startIndex, int endIndex) {
        T[] newArray = (T[]) new Object[endIndex - startIndex];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex];
            startIndex++;
        }
        return newArray;
    }


    //--------------------------------------------------------------------
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    //--------------------------------------------------------------------
    public int indexOf(T item) {
        if (item == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    //-------------------------------------------------------------------
    public T[] set(int index, T newIndex) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = newIndex;
        return array;
    }


    public T[] replaceAll(T value, T newValue) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], value)) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //------------------------------------------------------------------
    public Object[] removeRange(int start, int end) {
        int a = end - start;
        for (int i = 0; i < size - a; i++) {
            array[i] = array[i + a];
        }
        size -= a;
        return array;
    }

    //------------------------------------------------------------------
    public T[] trimToSize() {
        if (size < array.length) {
            T[] newArray = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        return array;
    }


    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

}
