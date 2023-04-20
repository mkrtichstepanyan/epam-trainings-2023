package homework_16.Zara_Avetyan.genericDynamicArray;


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
public class DynamicArray<T> {

    private T[] array;

    private int size = 0;
    private int k = 1;

    private static final int DEFAULT_CAPACITY = 16;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = (T[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
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

    public void add(int index, T value) {
        while (size + k - 1 >= array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + k] = array[i];
        }
        array[index] = value;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void addAll(T[] values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    public void addAll(int index, T[] values) {
        k = values.length;
        add(index, values[0]);
        for (int i = 1; i < values.length; i++) {
            array[index + i] = values[i];
            size++;
        }
    }

    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public T[] clone() {
        T[] cloneArray = (T[]) new Object[size];
        System.arraycopy(array, 0, cloneArray, 0, size);
        return cloneArray;
    }

    public boolean contains(T value) {
        for (T i : array) {
            if (i == value) return true;
        }
        return false;
    }

    public boolean containsAll(T[] arrayCollection) {
        for (T i : arrayCollection) {
            boolean r = false;
            for (int j = 0; j < size; j++) {
                if (i == array[j]) {
                    r = true;
                    break;
                }
            }
            if (!r) return false;
        }
        return true;
    }

    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remove(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) return;
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void removeAll(T[] values) {
        for (T val : values) {
            remove(val);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String subList(int fromIndex, int toIndex) {
        String str = "[";
        for (int i = fromIndex; i < toIndex - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[toIndex - 1] + "]";
        return str;
    }

    public T set(int index, T value) {
        T oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public String toString() {
        String str = new String("[");
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[array.length - 1] + "]";
        return str;
    }

    public void trimToSize() {
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void removeRange(int fromIndex, int toIndex) {
        for (int i = fromIndex; i < size + toIndex - fromIndex; i++) {
            array[i] = array[i + toIndex - fromIndex];
        }
        size += toIndex - fromIndex;
    }

    public void replaceAll(T regex, T replacement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == regex) {
                array[i] = replacement;
            }
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
