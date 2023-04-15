package homework_16.Radik_Manasyan;


import java.util.Arrays;
import java.util.Random;

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
    private static final int DEFAULT_CAPACITY = 16;
    private final Random random = new Random();
    private int[] array;

    private int size = -1;


    public DynamicArray(int capacity) {
        try {
            if (capacity > 0) {
                this.array = new int[capacity];
            } else {
                throw new IllegalArgumentException("Array length must be bigger than 0");
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (size == array.length - 1) {
            extend();
        }
        array[++size] = value;
    }

    public void addByIndex(int index, int value) {
        int[] tmp = new int[size + 1];
        try {
            if (index > size || index < -1) {
                throw new IllegalArgumentException("Index can not bigger than array length and less 0");
            } else {
                for (int i = 0; i < size; i++) {
                    if (i != index) {
                        tmp[i] = array[i];
                    } else {
                        tmp[i] = value;
                        for (int j = index; j < size; j++) {
                            tmp[j + 1] = array[j];
                        }
                        break;
                    }
                }
                array = tmp;
                size += 1;
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    public void addAllByIndex(int index, int[] values) {
        int[] tmp = new int[size + values.length];
        size = 0;
        try {
            if (index > array.length || index < -1) {
                throw new IllegalArgumentException("Index can not bigger than array length and less 0");
            } else {
                for (int i = 0; i < index; i++) {
                    tmp[i] = array[size++];
                }
                for (int j = 0; j < values.length; j++) {
                    tmp[size++] = values[j];
                }
                for (int j = index; j < array.length; j++) {
                    tmp[size++] = array[j];
                }
                array = tmp;
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }

    public void addAll(int[] array) {
        for (int element : array) {
            add(element);
        }
    }

    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int[] clone() {
        int[] cloneArray = new int[size];
        System.arraycopy(array, 0, cloneArray, 0, size);
        return cloneArray;
    }

    public boolean contains(int digit) {
        for (int i : array) {
            if (i == digit) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(int[] array) {
        if (array.length > size) {
            return false;
        }
        for (int element : array) {
            boolean contains = contains(element);
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        try {
            for (int i = 0; i < size; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            throw new NullPointerException(value + " is not contains in the array.");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public void remove(int value) {
        int[] tmp;

        if (contains(value)) {

            tmp = new int[size - 1];
            for (int i = 0, j = 0; i < this.size; i++, j++) {
                if (array[i] != value) {
                    tmp[j] = array[i];
                } else {
                    j--;
                }
            }
            size = tmp.length;
            array = tmp;
        } else {
            System.out.println("Array is not contains " + value);
        }
    }

    public void removeAll(int[] removeElements) {
        for (int removeElement : removeElements) {
            remove(removeElement);
        }
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public int[] subList(int endIndex) {
        int[] tmp;
        if (endIndex <= 0) {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        } else {
            try {
                tmp = new int[endIndex];
                for (int i = 0; i < endIndex; i++) {
                    tmp[i] = array[i];
                }
                return tmp;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] tmp;
        int indexForTem = 0;

        if (startIndex == endIndex) {
            subList(startIndex);
        } else if (endIndex < startIndex) {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        } else {
            try {
                tmp = new int[endIndex - startIndex];
                for (int i = 0; i < size; i++) {
                    if (i >= startIndex && i < endIndex) {
                        tmp[indexForTem++] = array[i];
                    }
                }
                return tmp;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public void set(int index, int value) {
        if (isEmpty()) {
            System.out.println("Array is empty");
        } else if (index < 0 || index > size) {
            throw new IllegalArgumentException("Array length must be bigger than " + size + " or less than 0");
        } else {
            try {
                array[index] = value;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }

    }

    public void sort() {
        int tmp;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (array[j] < array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public void trimToSize() {
        if (size < -1) {
            throw new IllegalArgumentException("Array length must be bigger than 0");

        } else {
            try {
                int[] tmp = new int[size];
                for (int i = 0; i <= array.length - 1; i++) {
                    tmp[i] = array[i];
                }
                array = tmp;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
    }

    public void removeRange(int index) {
        int[] tmp;
        int indexTmp = 0;
        if (index <= 0 || index > size) {
            throw new IllegalArgumentException("Array length must be bigger than " + size + " or less than 0");
        } else {
            try {
                tmp = new int[size - index];
                for (int i = index; i < size; i++) {
                    tmp[indexTmp++] = array[i];
                }
                array = tmp;
                size = array.length;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
    }

    public void replaceAll() {
        for (int i = 0; i < size; i++) {
            int randomDigit = random.nextInt(array[i]);
            array[i] = randomDigit;
        }

    }

    public int get(int index) {
        if (index < 0 || index > size) {
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

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
