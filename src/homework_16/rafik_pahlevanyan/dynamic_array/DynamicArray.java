package homework_16.rafik_pahlevanyan.dynamic_array;


import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


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

    public int[] addAll(Collection<Integer> c) {
        for (int element : c) {
            add(element);
        }
        return array;
    }

    public int[] replaceAll(int oldVal, int newVal) {
        boolean replaced = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == oldVal) {
                array[i] = newVal;
                replaced = true;
            }
        }
        if (replaced) {
            System.out.println("Replacements made: " + oldVal + " replaced with " + newVal);
        } else {
            System.out.println("No elements found with value " + oldVal);
        }
        return array;
    }


    public int[] removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        int numToRemove = toIndex - fromIndex;
        System.arraycopy(array, toIndex, array, fromIndex, size - toIndex);
        size -= numToRemove;
        for (int i = size; i < size + numToRemove; i++) {
            array[i] = 0;
        }
        return array;
    }

    public int[] trim() {
        if (size != 0) {
            array = Arrays.copyOfRange(array, 0, size);
        }
        return array;
    }

    public int[] set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
        System.out.println("In index - " + index + " is added - " + element);
        return array;
    }

    public void sort() {
        bubbleSort(array);
    }


    public DynamicArray subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex >= toIndex) {
            throw new IndexOutOfBoundsException();
        }
        DynamicArray sublist = new DynamicArray(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("Array is empty");
            return true;
        } else {
            System.out.println("Array is not empty");
        }
        return false;
    }

    public boolean removeAll(int element) {
        boolean removed = false;
        int dest = 0; // the index where the next element should be copied to
        for (int src = 0; src < size; src++) {
            if (array[src] != element) {
                // copy the element to the next available position in the array
                array[dest] = array[src];
                dest++;
            } else {
                removed = true;
            }
        }
        if (removed) {
            System.out.println("Elements removed");
        } else {
            System.out.println("Elements not found");
        }
        // set the remaining elements in the array to zero
        Arrays.fill(array, dest, size, 0);
        size = dest; // update the size of the array

        return removed;
    }

    public boolean remove(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("element does not found");
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        System.out.println("Element deleted");
        return true;
    }

    public void indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Index of element " + element + " is: " + i);
            }
        }
        System.out.println("element not found");
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Element contains in array");
                return true;
            }
        }
        System.out.println("Element does not found");
        return false;
    }

    public boolean containsAll(DynamicArray collection) {
        for (int i = 0; i < collection.size(); i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (array[j] == collection.get(i)) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.println("Is not subset");
                return false;
            }
        }
        System.out.println("Is subset");
        return true;
    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
        System.out.println("Array now is clear");
    }

    public Object clone() {
        DynamicArray clone = new DynamicArray();
        clone.array = Arrays.copyOf(this.array, this.array.length);
        clone.size = this.size;
        System.out.println("Array was clone");
        return clone;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return array.length;
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


    public int size() {
        return size;
    }

    private void bubbleSort(int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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


    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");

        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicArray that = (DynamicArray) o;
        return size == that.size && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

}
