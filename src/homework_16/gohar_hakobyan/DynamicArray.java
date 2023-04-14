package homework_16.gohar_hakobyan;


import java.util.Collection;

/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist
   clear() -> removes all the elements from arraylist
   addByIndex () -> added new value without replacing
   addAllByIndex () -> added new values without replacing
   clone() -> makes a copy of the array list
   contains() -> checks if the element is present in the arraylist
   containsAll() -> checks if a collection is a subset of arraylist ?
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


    public void addByIndex(int index, int value) {
        if (index > 0 && index < size) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
            size++;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void addAllByIndex(int index, int[] toAdd) {
        if (index > 0 && index < size) {
            int[] newArray = new int[size + toAdd.length];

            //Copy the part of array before the index
            System.arraycopy(array, 0, newArray, 0, index);

            //Copy the array toAdd
            System.arraycopy(toAdd, 0, newArray, index, toAdd.length);

            //Copy the part of array after the index
            System.arraycopy(array, index, newArray, index + toAdd.length, size - index);
            array = newArray;
            size += toAdd.length;
        } else {
            System.out.println("Invalid index.");
        }
    }


    public void addAll(Collection<? extends Integer> c) {
        for (Integer value : c) {
            add(value);
        }
    }


    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }


    //The method for removing all elements in array
    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            array[i] = 0;
    }


    //The method for removing a single element
    public void remove(int index) {
        if (index >= 0 && index < size) {
            if (size + 1 - index >= 0) {
                System.arraycopy(array, index + 1, array, index, size + 1 - index);
            }
            size--;
        }
    }

    //The method for removing whole list
    public void removeAll() {
        if (!isEmpty()) {
            int i = 0;
            while (i < size) {
                remove(i);
            }
        }
    }


    public DynamicArray clone() {
        DynamicArray cloned = new DynamicArray(array.length);
        cloned.size = size;
        System.arraycopy(array, 0, cloned.array, 0, array.length);
        return cloned;
    }


    //This method check if array contains an element
    public boolean contains(int element) {
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }


    //This method check if c a collection is a subset of arraylist
    public boolean containsAll(Collection<? extends Integer> c) {
        boolean isContains = false;
        for (Integer element : c) {
            if (!contains(element)) {
                return isContains;
            }
        }
        return true;
    }


    public int[] subList(int fromIndex, int toIndex) {
        if ((fromIndex < 0 || fromIndex > size) || (toIndex < 0 || toIndex > size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] result = new int[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            result[i - fromIndex] = array[i];
        }
        return result;
    }


    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public int indexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    //This method for integers insertion sorting
    public int[] sort() {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
        return array;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public void trimToSize() {
        if (array.length > size) {
            int[] result = new int[size];
            System.arraycopy(array, 0, result, 0, size);
            array = result;
        }
    }


    public void removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= size ||
                endIndex < 0 || endIndex >= size || startIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        int range = endIndex - startIndex + 1;
        int[] tempArray = new int[size - range];
        System.arraycopy(array, 0, tempArray, 0, startIndex);
        int i = endIndex;
        while (i < size - 1) {
            tempArray[startIndex++] = array[i];
            i++;
        }
        array = tempArray;
        size = size - range;
    }

    public void replaceAll(int[] newArray) {
        if (newArray.length < size) {
            System.arraycopy(array, 0, newArray, 0, newArray.length);
        } else throw new IndexOutOfBoundsException();
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
