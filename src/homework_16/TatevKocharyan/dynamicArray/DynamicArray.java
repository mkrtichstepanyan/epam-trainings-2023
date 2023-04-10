package homework_16.TatevKocharyan.dynamicArray;


import java.util.ArrayList;
import java.util.Arrays;

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

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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

    public void addAll(ArrayList<Integer> array) {
        for (Integer integer : array) {
            add(integer);
        }


    }

    public void clear() {
        int[] clearArray = new int[DEFAULT_CAPACITY];
        array = clearArray;
    }

    public int[] clone() {
        int[] cloneArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            cloneArray[i] = array[i];
        }

        return cloneArray;
    }

    public void contains(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("element is present");
            }
        }

    }

    public void containsAll(DynamicArray array1) {
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

    public int indexOf(int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void remove(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = 0;
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = 0;
            }
        }
    }

    public void removeAll() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = 0;

                }
            }
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                empty = false;
            }
        }
        return empty;
    }


    public void subList(int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            DynamicArray sublisted = new DynamicArray(endIndex - startIndex);
            int endIndex1 = array.length - array[endIndex];
            int endIndex2 = array.length - endIndex1;
            for (int i = startIndex; i < endIndex2 - 1; i++) {
                sublisted.add(array[i]);

            }
            array = sublisted.array;

        } else {
            System.out.println("Illegal range");
        }
    }

    public void set(int index, int number) {
        if (index<0||index>array.length){
            System.out.println("There is no such  an index");
        }

            array[index]=number;

    }

    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
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


    public int[] trimToSize() {
        for (int i = 0; i < array.length; i++) {
            if (size != 0) {
                array = Arrays.copyOfRange(array, 0, size);
            }
        }
        return array;
    }

    public void removeRange(int[] array1) {
        if (array1.length > 0 && array1.length < array.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array1[i] == array[j]) {
                        array[j] = 0;

                    }
                }
            }
        }
        System.out.println("array's size is bigger");
    }

    void replaceAll(int[] array1) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;

        }
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
    }


    public void addByIndex(int index, int number) {
        int index2 = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                extend();
                for (int j = array[index2]; j >= array[index - 1]; j--) {
                    array[j + 1] = array[j];

                }
                break;
            }

        }

        array[index] = number;

    }


    public void addAllByIndex(int index, int[] array1) {
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