package homework_16.Ani_Kovalenko.DynamicArray;


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
 */
public class DynamicArray {

    private int[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public int[] add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
        return array;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(ArrayList<Integer> values) {
        for (int i = 0; i < values.size(); i++) {
            add(values.get(i));
        }
    }

    void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }


    public int[] clone() {
        int[] clonedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            clonedArray[i] = array[i];
        }
        return clonedArray;
    }

    boolean contains(int element) {
        for (int eachElement : array) {
            if (eachElement == element) {
                return true;
            }
        }
        return false;
    }

    boolean containsAll(ArrayList<Integer> listToBeVerified) {
        for (Integer eachElement : listToBeVerified) {
            if (!contains(eachElement)) {
                return false;
            }
        }
        return true;
    }

    int indexOf(int element) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    int remove(int index) {
        int element = array[index];
        for (int i = index; i <= size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    Integer remove(Integer element) {
        int index = indexOf(element);
        if (index != -1) {
            for (int i = index; i <= size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        return element;
    }

    boolean removeAll(int element) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == element) {
                remove(Integer.valueOf(array[i]));
            }
        }
        for (int eachElement : array) {
            if (eachElement == element) {
                return false;
            }
        }
        return true;
    }

    boolean isEmpty() {
        return size == 0;
    }

    List<Integer> subList(int startIndex, int endIndex) {
        List<Integer> subList = new ArrayList<>();
        if (checkIndex(startIndex, endIndex)) {
            for (int i = startIndex; i <= endIndex; i++) {
                subList.add(array[i]);
            }
        }
        return subList;
    }

    private boolean checkIndex(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > size) {
            throw new ArrayIndexOutOfBoundsException("Start index is wrong");
        }
        if (endIndex < 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException("End index is wrong");
        }
        if (startIndex >= endIndex) {
            throw new IllegalArgumentException("Start index should be greater than end index.");
        }
        return true;
    }

    int set(int index, Integer newElement) {
        int oldElement = array[index];
        array[index] = newElement;
        return oldElement;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                sortingProcess(array, j);
            }
        }
    }

    private void sortingProcess(int[] array, int j) {
        int tempValue;
        if (array[j] > array[j + 1]) {
            tempValue = array[j];
            array[j] = array[j + 1];
            array[j + 1] = tempValue;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int eachValue : array) {
            stringBuilder.append(" ").append(eachValue).append(" |");
        }
        stringBuilder.append("]");
        return String.valueOf(stringBuilder);
    }

    void trimToSize() {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    void removeRange(int startIndex, int endIndex) {
        if (checkIndex(startIndex, endIndex)) {
            for (int i = startIndex; i <= endIndex; i++) {
                remove(i);
            }
        }
    }

    void replaceAll(int[] newArray) {
        if (newArray.length == size) {
            for (int i = 0; i < size; i++) {
                array[i] = newArray[i];
            }
        } else {
            System.err.println("The count of elements should be equal to array's length");
        }
    }

    public int[] getArray() {
        return array;
    }
}