package homework_16.TatevKocharyan.genericDynamicArray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist  +
   clear() -> removes all the elements from arraylist  +
   addByIndex () -> added new value without replacing  +
   addAllByIndex () -> added new values without replacing  +
   clone() -> makes a copy of the array list  +
   contains() -> checks if the element is present in the arraylist  +
   containsAll() -> checks if a collection is a subset of arraylist +
   indexOf() -> returns the position of the specified element  +
   remove() -> removes the single element from the arraylist  +
   removeAll() -> removes multiple elements from the arraylist  +
   isEmpty() -> checks if the arraylist is empty  +
   subList() -> returns a portion of the arraylist  +
   set() -> replace the single element from an arraylist
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)  +
   toString() -> converts the arraylist into a String  +
   trimToSize() -> trims the capacity of arraylist equal to the size  +
   removeRange() -> removes a portion of the arraylist  +
   replaceAll() -> replace all elements from the arraylist  +
 */
public class GenericDynamicArray <T extends Comparable <T> >{

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

    public T[] getArray() {
        return array;
    }

    public int getSize() {

        return size;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(ArrayList<T> array) {
        for (T element : array) {
            add(element);
        }


    }

    public void clear() {
        T[] clearArray = (T[]) new Object[DEFAULT_CAPACITY];
        array = clearArray;
    }

    public T[] clone() {
        T[] clonedArray = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            clonedArray[i] = array[i];
        }
        return clonedArray;
    }

    public void contains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("element is present");
            }
        }

    }

    public void containsAll(GenericDynamicArray<?> array1) {
        int countNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.size; j++) {
                if (array[i] == array1.array[j]) {
                    countNumbers++;
                }

            }
        }
        if (array1.size == countNumbers) {
            System.out.println("All elements are present");
        } else {
            System.out.println("Elements aren't present");
        }


    }

    public int indexOf(T element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void remove(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = null;
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = null;
            }
        }
    }

    public void removeAll() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = null;

                }
            }
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != null) {
                empty = false;
            }
        }
        return empty;
    }


    public T[] subList(int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            Object[] sublisted = new Object[endIndex - startIndex];
            int endIndex1 = array.length - endIndex;
            int endIndex2 = array.length - endIndex1;
            int j = 0;
            for (int i = startIndex; i < endIndex2 - 1; i++) {
                sublisted[j] = array[startIndex];
                j++;
                startIndex++;

            }
            array = (T[]) sublisted;

        } else {
            System.out.println("Illegal range");
        }
        return array;
    }

    public void set(int index, T element) {
        if (index < 0 || index > array.length) {
            System.out.println("There is no such  an index");
        }

        array[index] = element;

    }

    public void bubbleSort(Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }


    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }


    public T[] trimToSize() {
        for (int i = 0; i < array.length; i++) {
            if (size != 0) {
                array = Arrays.copyOfRange(array, 0, size);
            }
        }
        return array;
    }

    public void removeRange(T[] array1) {
        if (array1.length > 0 && array1.length < array.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array1[i] == array[j]) {
                        array[j] = null;

                    }
                }
            }
        }
        System.out.println("array's size is bigger");
    }

    void replaceAll(T[] array1) {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;

        }
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
    }


    public void addByIndex(int index, T element) {
        int index2 = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                extend();
                for (int j = size; j >= index; j--) {
                    array[j + 1] = array[j];
                }
                break;
            }

        }

        array[index] = element;

    }


    public void addAllByIndex(int index, T[] array1) {
        int index1 = array1.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                extend();
                for (int j = 0; j <= index1; j++) {
                    array[size + index1] = array[index];
                    index++;
                    size++;
                }
                break;
            }

        }
        for (int i = 0; i < array1.length; i++) {
            array[index] = array1[i];
            index++;
        }

    }

}