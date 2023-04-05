package homework_16.Zara_Avetyan;


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

    public void addAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int[] clone() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public boolean contains(int value) {
        for (int i : array) {
            if (i == value) return true;
        }
        return false;
    }

    public boolean containsAll(int[] arrayCollection) {
        for (int i : arrayCollection) {
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

    public int indexOf(int o) {
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

    public void remove(Integer value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (((int) value) == array[i]) {
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

    public void removeAll(int[] values) {
        for (Integer val : values) {

            remove(val);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String subList(int fromIndex, int toIndex) {
        String str = new String("[");
        for (int i = fromIndex; i < toIndex - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[toIndex - 1] + "]";
        return str;
    }

    public int set(int index, int value) {
        int oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    public void sort() {
        for (int i = 1; i < size; i++) {
            int temp = array[i];
            int j = i;
            while (j - 1 >= 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
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
        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void removeRange(int fromIndex, int toIndex) {
        for (int i = fromIndex; i < size + toIndex - fromIndex; i++) {
            array[i] = array[i + toIndex - fromIndex];
        }
        size += toIndex - fromIndex;
    }

    public void replaceAll(int regex, int replacement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == regex) {
                array[i] = replacement;
            }
        }
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
