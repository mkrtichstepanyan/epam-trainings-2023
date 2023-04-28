package homework_16.Qnarik_Khachatryan.genericDynamicArray;


import homework_16.Qnarik_Khachatryan.DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist
   addByIndex() -> adds new value without replacing
   addAllByIndex() -> adds new values without replacing
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
public class GenericDynamicArray<T> {

    private T[] array;

    private int size = 0;

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
        return size;
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //to get the elem by index
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //addAll() -> adds all elements of a collection to arraylist
    public T[] addAll(Collection<T> collection) {
        for (T element : collection) {
            add(element);
        }
        return array;
    }

    //isEmpty() -> checks if the arraylist is empty
    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    //clone() -> makes a copy of the array list
    public ArrayList clone() {
        ArrayList copiedArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            copiedArrayList.add(array[i]);
        }
        return copiedArrayList;
    }

    //contains() -> checks if the element is present in the arraylist
    public boolean contains(T element) {
        try {
            for (T elem : array) {
                if (elem == element) {
                    return true;
                }
            }
        } catch (NullPointerException | ClassCastException e) {
            e.getStackTrace();
        }
        return false;
    }

    //containsAll() -> checks if a collection is a subset of arraylist
    public boolean containsAll(Collection<T> collection) {
        for (T element : collection) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    // indexOf() -> returns the position of the specified element
    public int indexOf(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }


    // remove() -> removes the single element from the arraylist (find the index and move other elements back)
    public boolean remove(T element) {
        int index = indexOf(element);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    //removeAll() -> removes multiple elements from the arraylist
    public boolean removeAll(Collection<T> elemsToRemove) {
        for (int i = 0; i < array.length; i++) {
            if (elemsToRemove.contains(array[i])) {
                remove(array[i]);
            }
        }
        return true;
    }


    // clear() -> removes all the elements from arraylist
    public boolean clear() {
        T[] newArray = (T[]) new Object[0];
        array = newArray;
        return true;
    }

    // removeRange() -> removes a portion of the arraylist
    public boolean removeRange(int startIndex, int endIndex) {
        T[] newArr = (T[]) new Object[array.length - endIndex - startIndex];
        int startNewArrIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < startIndex || i > endIndex) {
                newArr[startNewArrIndex] = array[i];
                startNewArrIndex++;
            }
        }
        array = newArr;
        return true;
    }


    //subList() -> returns a portion of the arraylist
    public <T> GenericDynamicArray<T> subList(int startIndex, int endIndex) {
        GenericDynamicArray<T> subList = new GenericDynamicArray<>(endIndex - startIndex);
        for (int i = startIndex; i < endIndex; i++) {
            subList.add((T) array[i]);
        }
        return subList;
    }

    // set() -> replace the single element from an arraylist
    public void set(int index, T value) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = value;
            }
        }
    }

    //trimToSize() -> trims the capacity of arraylist equal to the size
    public void trimToSize(int size) {
        if (array.length > size) {
            T[] trimedArray = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                trimedArray[i] = array[i];
            }
            array = trimedArray;
        }
    }

    //replaceAll() -> replace all elements from the arraylist
    public void replaceAll(T elementToReplace, T replacement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToReplace) {
                array[i] = replacement;
            }
        }
    }


    //addByIndex() -> adds new value without replacing
    public T[] addByIndex(int index, T value) {
        T[] newArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        array = newArray;
        return array;
    }

    //addAllByIndex() -> adds new values without replacing
    public T[] addAllByIndex(int index, T[] values) {
        int newArrayLength = array.length + values.length;
        T[] newArray = (T[]) new Object[newArrayLength];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < index + values.length; i++) {
            newArray[i] = values[i - values.length - 1];
        }

        for (int i = index + values.length; i < array.length; i++) {
            newArray[i] = array[index++];
        }
        array = newArray;
        return array;
    }


    //toString() -> converts the arraylist into a String
    public String toString1() {
        String myString = "";
        for (int i = 0; i < array.length; i++) {
            myString += array[i];
        }
        return myString;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

}
