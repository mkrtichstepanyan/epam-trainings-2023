package homework_16.Qnarik_Khachatryan;


import java.util.*;

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

    //addAll() -> adds all elements of a collection to arraylist
    public void addAll(Collection<Integer> collection) {
        for (int element : collection) {
            add(element);
        }
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
    public boolean contains(int element) {
        try {
            for (int elem : array) {
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
    public boolean containsAll(Collection<Integer> collection) {
        for (int element : collection) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    // indexOf() -> returns the position of the specified element
    public int indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // remove() -> removes the single element from the arraylist (find the index and move other elements back)
    public boolean remove(int element) {
        int index = indexOf(element);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    //removeAll() -> removes multiple elements from the arraylist
    public boolean removeAll(int[] elemsToRemove) {
        for (int val : elemsToRemove) {
            if (contains(val)) {
                remove(val);
            }
        }
        return true;
    }

    // clear() -> removes all the elements from arraylist
    public boolean clear() {
        int[] newArray = new int[0];
        array = newArray;
        return true;
    }

    // removeRange() -> removes a portion of the arraylist
    public boolean removeRange(int startIndex, int endIndex) {
        int[] newArr = new int[array.length - endIndex - startIndex];
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
    public int[] subList(int startIndex, int endIndex) {
        int[] sbList = new int[endIndex - startIndex];
        for (int i = 0; i < sbList.length; i++) {
            sbList[i] = array[startIndex];
            startIndex++;
        }
        return sbList;
    }

    // set() -> replace the single element from an arraylist
    public void set(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = value;
            }
        }
    }

    //sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
    public int[] sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //trimToSize() -> trims the capacity of arraylist equal to the size
    public void trimToSize(int size) {
        if (array.length > size) {
            int[] trimedArray = new int[size];
            for (int i = 0; i < size; i++) {
                trimedArray[i] = array[i];
            }
            array = trimedArray;
        }
    }

    //replaceAll() -> replace all elements from the arraylist
    public void replaceAll(int elementToReplace, int replacement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToReplace) {
                array[i] = replacement;
            }
        }
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
