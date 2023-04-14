package homework_16.gohar_hakobyan;

import java.util.Arrays;
import java.util.Collection;

public class GenericDynamicArray<T> {
    private T[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


    public GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = ((T[]) new Object[capacity]);
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


    public void addByIndex(int index, T value) {
        if (index > 0 && index < size) {
            T[] newArray = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
            size++;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void addAllByIndex(int index, T[] toAdd) {
        if (index > 0 && index < size) {
            T[] newArray = (T[]) new Object[size + toAdd.length];

            //Copy the part of array before the index
            System.arraycopy(array, 0, newArray, 0, index);

            //Copy the array toAdd
            System.arraycopy(toAdd, 0, newArray, index, toAdd.length);

            //Copy the part of array after the index
            System.arraycopy(array, index, newArray, index + toAdd.length, size - index);
            array = newArray;
            size += toAdd.length;
        } else {
            System.out.println("Invalid index.");
        }
    }


    public void addAll(Collection<? extends T> c) {
        for (T value : c) {
            add(value);
        }
    }


    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }


    //The method for removing all elements in array
    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            array[i] = null;
    }


    //The method for removing a single element
    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        T[] newArray = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
        size--;
    }

    //The method for removing whole list
    public void removeAll() {
        if (!isEmpty()) {
            int i = 0;
            while (i < size) {
                remove(i);
            }
        }
    }


    public GenericDynamicArray<T> clone() {
        GenericDynamicArray<T> cloned = new GenericDynamicArray<>(array.length);
        for (int i = 0; i < size; i++) {
            Object obj;
            obj = array[i];
            cloned.add((T) obj);
        }
        return cloned;
    }


    //This method check if array contains an element
    public boolean contains(T element) {
        for (T t : array) {
            if (t == element) {
                return true;
            }
        }
        return false;
    }


    //This method check if c a collection is a subset of arraylist
    public boolean containsAll(Collection<? extends T> c) {
        boolean isContains = false;
        for (T element : c) {
            if (!contains(element)) {
                return isContains;
            }
        }
        return true;
    }

    public T[] subList(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size) || (toIndex < 0 || toIndex > size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T[] result = (T[]) new Object[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            result[i - fromIndex] = array[i];
        }
        return result;
    }


    public void set(int index, T value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Invalid index.");
        }
    }


    //This method for  insertion sorting
    public <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 1; i < array.length; i++) {
            T tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j]).compareTo(tmp) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public void trimToSize() {
        if (array.length > size) {
            T[] result = (T[]) new Object[size];
            System.arraycopy(array, 0, result, 0, size);
            array = result;
        }
    }

    public int indexOf(T object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }


    public void removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= size ||
                endIndex < 0 || endIndex >= size || startIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        int range = endIndex - startIndex + 1;
        T[] tempArray = (T[]) new Object[size - range];
        System.arraycopy(array, 0, tempArray, 0, startIndex);
        int i = endIndex;
        while (i < size - 1) {
            tempArray[startIndex++] = array[i];
            i++;
        }
        array = tempArray;
        size = size - range;
    }

    public void replaceAll(T[] newArray) {
        if (newArray.length < size) {
            System.arraycopy(array, 0, newArray, 0, newArray.length);
        } else throw new IndexOutOfBoundsException();
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
