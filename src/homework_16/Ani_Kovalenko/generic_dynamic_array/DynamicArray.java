package homework_16.Ani_Kovalenko.generic_dynamic_array;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


/* Please create methods below
  +   addAll() -> adds all elements of a collection to arraylist
  +   clear() -> removes all the elements from arraylist
  +   clone() -> makes a copy of the array list
  +   contains() -> checks if the element is present in the arraylist
  +   containsAll() -> checks if a collection is a subset of arraylist
  +   indexOf() -> returns the position of the specified element
  +   remove() -> removes the single element from the arraylist
  +   removeAll() -> removes multiple elements from the arraylist
  +   isEmpty() -> checks if the arraylist is empty
  +   subList() -> returns a portion of the arraylist
  +   set() -> replace the single element from an arraylist
  +   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
  +   toString() -> converts the arraylist into a String
  +   trimToSize() -> trims the capacity of arraylist equal to the size
  +   removeRange() -> removes a portion of the arraylist
  +   replaceAll() -> replace all elements from the arraylist
  +   addByIndex () -> added new value without replacing
  +   addAllByIndex () -> added new values without replacing
 */
public class DynamicArray<T extends Comparable & Cloneable> implements Cloneable {
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] array;
    private int size = 0;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public DynamicArray() {
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

    public T checkSingleIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return (T) array[index];
    }

    private void extend() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(ArrayList<T> values) {
        for (int i = 0; i < values.size(); i++) {
            add(values.get(i));
        }
    }

    void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DynamicArray<T> clone = (DynamicArray<T>) super.clone();
        clone.array = array.clone();
        Object[] copied = new Object[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            Object obj;
            if (array[i] != null) {
                try {
                    obj = this.array[i].getClass().getMethod("clone").invoke(array[i]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
                copied[i] = obj;
            }
        }
        clone.setArray(copied);
        return clone;
    }

    boolean contains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Comparable) {
                Comparable<T> comparable = (Comparable<T>) array[i];
                if (comparable.compareTo(element) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean containsAll(ArrayList<T> listToBeVerified) {
        for (Object eachElement : listToBeVerified) {
            if (!contains((T) eachElement)) {
                return false;
            }
        }
        return true;
    }

    int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Comparable) {
                Comparable<T> comparable = (Comparable<T>) array[i];
                if (comparable.compareTo(element) == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    T remove(int index) {
        checkSingleIndex(index);
        T oldElement = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        for (int i = size; i < array.length; i++) {
            array[i] = null;
        }

        return oldElement;
    }

    T remove(T element) {
        int index = indexOf(element);
        if (index != -1) {
            remove(index);
        }
        return element;
    }

    boolean removeAll(ArrayList<T> elements) {
        if (containsAll(elements)) {
            for (T element : elements) {
                remove(indexOf(element));
            }
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        return size == 0;
    }

    List<T> subList(int startIndex, int endIndex) {
        List<T> subList = new ArrayList<>();
        checkIndexes(startIndex, endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
            subList.add((T) array[i]);
        }
        return subList;
    }

    private void checkIndexes(int startIndex, int endIndex) {
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

    T set(int index, T newElement) {
        T oldElement = (T) array[index];
        array[index] = newElement;
        return oldElement;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                sortingProcess(j);
            }
        }
    }

    private void sortingProcess(int j) {
        Object tempValue;
        if (array[j] instanceof Comparable) {
            Comparable<T> comp1 = (Comparable<T>) array[j];
            if (comp1.compareTo((T) array[j + 1]) == 1) {
                tempValue = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tempValue;
            }
        }
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object eachValue : array) {
            stringBuilder.append(" ").append(eachValue).append(" \n");
        }
        return String.valueOf(stringBuilder);
    }

    void trimToSize() {
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    void removeRange(int startIndex, int endIndex) {
        checkIndexes(startIndex, endIndex);
        do {
            remove(startIndex);
        } while (startIndex < endIndex--);

    }

    void replaceAll(T[] newArray) {
        if (newArray.length == size) {
            for (int i = 0; i < size; i++) {
                array[i] = newArray[i];
            }
        } else {
            System.out.println("The count of elements should be equal to array's length.");
        }
    }

    void addByIndex(int index, T value) {
        checkSingleIndex(index);
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    void addAllByIndex(int index, Object[] values) {
        checkSingleIndex(index);
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

    public Object[] getArray() {
        return array;
    }
}