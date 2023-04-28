package homework_16.Argishti_Mesropyan;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist +
   clear() -> removes all the elements from arraylist +
   clone() -> makes a copy of the array list +
   contains() -> checks if the element is present in the arraylist +
   containsAll() -> checks if a collection is a subset of arraylist +
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

    public void addAll(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
        size = 0;
    }

    public DynamicArray clone() {
        DynamicArray clone = new DynamicArray(this.array.length);
        for (int i = 0; i < this.size; i++) {
            clone.add(this.array[i]);
        }
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

    public boolean containsAll(int[] elements) {
        for (int element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    public boolean remove(int element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public void removeAll(int[] elements) {
        for (int element : elements) {
            remove(element);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DynamicArray subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        DynamicArray subList = new DynamicArray(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("wrong index");
        }
        array[index] = value;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void trimToSize() {
        if (size < array.length) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index range");
        }
        System.arraycopy(array, toIndex, array, fromIndex, size - toIndex);
        size -= toIndex - fromIndex;
    }

    public void replace(int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }

}
