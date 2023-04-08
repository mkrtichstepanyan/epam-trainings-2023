package homework_16.yeghia_ansuryan.dynamicArray;


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

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void addAll(int[] dell) {
        for (int j : dell) {
            add(j);
        }
    }

    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int[] clone() {
        int[] clone = new int[size];
        System.arraycopy(array, 0, clone, 0, size);
        return clone;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] dell) {
        for (int j : dell) {
            if (!contains(j)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int indexOfRemove) {
        if (indexOfRemove < 0 || indexOfRemove >= size) {
            throw new IndexOutOfBoundsException("Index of remove " + indexOfRemove + " is not of bounds!");
        }
        int oldValue = array[indexOfRemove];
        for (int i = indexOfRemove; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return oldValue;
    }

    public boolean removeAll(int[] removeAllOfValue) {
        if (containsAll(removeAllOfValue)) {
            for (int i : removeAllOfValue) {
                remove(indexOf(i));
            }
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] dell;
        checkStartAndEndIndexes(startIndex, endIndex);
        dell = new int[endIndex - startIndex];
        int index = 0;
        for (int i = startIndex; i < endIndex; i++) {
            dell[index++] = array[i];
        }
        return dell;
    }

    public int set(int index, int element) {
        int oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    public void sort() {
        boolean temp = true;
        while (temp) {
            temp = false;
            for (int index = 0; index < size - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int number = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = number;
                    temp = true;
                }
            }
        }
    }

    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (int i = 0; i < size; i++) {
            toString.append(array[i]).append(" ");
        }
        return String.valueOf(toString);
    }

    public void trimToSize() {
        int[] dellTrimArray = new int[size];
        System.arraycopy(array, 0, dellTrimArray, 0, size);
        array = dellTrimArray;
    }

    public void removeRange(int startIndex, int lastIndex) {
        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = startIndex; i < lastIndex; i++) {
            remove(startIndex);
        }
    }

    public void replaceAll(int[] hp) {
        if (hp.length == size) {
            System.arraycopy(hp, 0, array, 0, size);
        } else {
            System.out.println("Wrong size of array");
        }
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private void checkStartAndEndIndexes(int startIndex, int endIndex) {
    }
}
