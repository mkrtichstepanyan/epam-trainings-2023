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

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(int[] dell) {
        for (int i = 0; i < dell.length; i++) {
            add(dell[i]);
        }
    }

    public void clear() {
        int[] newArray = new int[DEFAULT_CAPACITY];
        array = newArray;
        size = 0;
    }

    public int[] clone() {
        int[] clone = new int[size];
        for (int i = 0; i < size; i++) {
            clone[i] = array[i];
        }
        return clone;
    }

    public boolean contains(Integer checkElement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == checkElement) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] dell) {
        for (int i = 0; i < dell.length; i++) {
            if (!contains(i)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(Integer checkElement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == checkElement) {
                return i;
            }
        }
        return -1;
    }

    public Integer remove(int indexOfRemove) {
        Integer oldValue = array[indexOfRemove];
        for (int i = indexOfRemove; i < size; i++) {
            array[i] = array[i + 1];

            size--;
        }
        return oldValue;
    }

    public boolean removeAll(Integer removeAllOfValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == removeAllOfValue) {
                remove(i);
                size--;
            }
        }
        for (Integer perValue : array) {
            if (perValue == removeAllOfValue) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] dell = null;
        if (indexValidation(startIndex, endIndex)) {
            dell = new int[endIndex - startIndex];
            int index = 0;
            for (int i = startIndex; i < endIndex; i++) {
                dell[index++] = array[i];
            }
        }
        return dell;
    }

    private boolean indexValidation(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > size) {
            throw new IndexOutOfBoundsException("Please write positive start index" +
                    " for example 0 < and small than size");
        }
        if (endIndex < 0 || endIndex > size) {
            throw new IndexOutOfBoundsException("Please write positive end index" +
                    " for example 0 < and small than size");
        }
        if (startIndex > endIndex) {
            throw new IllegalArgumentException("Please write smaller start index than end index");
        }
        return true;
    }

    public Integer set(Integer element, int index) {
        Integer oldElement = array[index];
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
        for (int i = 0; i < size; i++) {
            dellTrimArray[i] = array[i];
        }
        array = dellTrimArray;
    }

    public void removeRange(int startIndex, int lastIndex) {
        if (indexValidation(startIndex, lastIndex)) {
            for (int i = startIndex; i < lastIndex; i++) {
                remove(i);
            }
        }
    }

    public void replaceAll(int[] hp) {
        if (hp.length == size) {
            for (int i = 0; i < size; i++) {
                array[i] = hp[i];
            }
        } else {
            System.out.println("Wrong size of array");
        }
    }

    public int[] getArray() {
        return array;
    }
}
