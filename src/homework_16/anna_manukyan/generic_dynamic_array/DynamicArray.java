package homework_16.anna_manukyan.generic_dynamic_array;


import java.util.Arrays;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist +
   clear() -> removes all the elements from arraylist +
   clone() -> makes a copy of the array list +
   contains() -> checks if the element is present in the arraylist +
   containsAll() -> checks if a collection is a subset of arraylist
   indexOf() -> returns the position of the specified element +
   remove() -> removes the single element from the arraylist +
   removeAll() -> removes multiple elements from the arraylist +
   isEmpty() -> checks if the arraylist is empty +
   subList() -> returns a portion of the arraylist +
   set() -> replace the single element from an arraylist +
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...) +
   toString() -> converts the arraylist into a String +
   trimToSize() -> trims the capacity of arraylist equal to the size +
   removeRange() -> removes a portion of the arraylist +
   replaceAll() -> replace all elements from the arraylist +
 */
public class DynamicArray<T> {

    private T[] array;

    private int size = 0;

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

    public DynamicArray(T item) {
        for (T t : array) {
            t = item;
        }
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

    public void addAll(T[] list) {
        for (int i = 0; i < list.length; i++) {
            add(list[i]);
        }
    }

    public void addByIndex(int index, T value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Wrong index.");
        }
        if (size == array.length) {
            extend();
        } else {
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }

        }
        array[index] = value;
        size++;
    }

    public void addAllByIndex(int index, T[] values) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Wrong index.");
        }
        for (int i = size; i >= index; i--) {
            extend();
            array[i + values.length] = array[i];
        }
        for (int i = 0; i < values.length; i++) {
            array[index++] = values[i];
            size++;
        }
    }

    public void set(int index, T value) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        array[index] = value;
    }

    public void clear() {
        if (!isEmpty()) {
            for (T t : array) {
                t = null;
            }
            size = 0;
        }
    }

    public T[] copy() {
        T[] listCopy = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            listCopy[i] = array[i];
        }
        return listCopy;
    }

    public T[] clone() {
        T[] clone = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Number || array[i] instanceof String) {
                clone[i] = array[i];
            } else {
                T item = (T) new DynamicArray(array[i]);
                Class<?> aClass = item.getClass();
                clone[i] = item;
            }

        }
        return clone;
    }

    public boolean contains(T element) {
        if (!isEmpty()) {
            for (T item : array) {
                if (item != null && item.equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(T[] list) {
        boolean isContains = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < list.length; j++) {
                if (contains(list[j])) {
                    isContains = true;
                } else {
                    isContains = false;
                    return isContains;
                }
            }
        }
        return isContains;
    }

    public boolean remove(T element) {
        if (!isEmpty()) {
            int elementCounter = elementCounter(element);
            while (elementCounter > 0) {
                int index = indexOf(element);
                for (int i = index; i < size; i++) {
                    array[i] = array[i + 1];

                }
                elementCounter--;
                size--;
            }
            return true;
        }
        return false;
    }

    private int elementCounter(T element) {
        int elementCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                elementCount++;
            }
        }
        return elementCount;
    }

    public boolean removeAll(T[] list) {
        if (!isEmpty()) {
            for (int j = 0; j < list.length; j++) {
                remove(list[j]);
            }
            return true;
        }
        return false;
    }

    public T[] subList(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size - 1) || (toIndex < 0 || toIndex > size - 1) || (fromIndex > toIndex)) {
            throw new ArrayIndexOutOfBoundsException("Wrong indexes");
        } else {
            T[] subList = Arrays.copyOfRange(array, fromIndex, toIndex + 1);
            return subList;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size - 1) || (toIndex < 0 || toIndex > size - 1) || (fromIndex > toIndex)) {
            throw new ArrayIndexOutOfBoundsException("Wrong indexes");
        } else {
            while (toIndex - fromIndex + 1 > 0) {
                for (int i = fromIndex; i < size; i++) {
                    array[i] = array[i + 1];
                }
                size--;
                toIndex--;
            }
        }
    }

    public void replaceAll(T[] list, int index) {
        if (list.length <= size) {
            for (int i = 0; i < list.length; i++) {
                array[index++] = list[i];
            }
        } else {
            throw new IndexOutOfBoundsException("List is bigger than array");
        }
    }

    public int indexOf(T element) {
        if (!isEmpty() && contains(element)) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) {
                    return i;
                }
            }
        }
        System.out.println("Array does not contain this element.");
        return 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public T get(int index) {
        if (isEmpty()) {
            System.out.println("Array is empty.");
            System.exit(1);
        }
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void sort() {
        if (array instanceof Number[]) {
//            MergeSort.sortArray(array);
        }
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        String prefix = "[";
        String suffix = "]";
        StringBuilder toString = new StringBuilder();
        if (!isEmpty()) {
            for (T item : this.array) {
                if (item != null) {
                    toString.append(item).append(", ");
                }
            }
        }
        return prefix + toString + suffix;
    }

    public void trimToSize() {
        if (array.length > size) {
            T[] newArr = Arrays.copyOf(array, size);
            array = newArr;
        }
    }

}
