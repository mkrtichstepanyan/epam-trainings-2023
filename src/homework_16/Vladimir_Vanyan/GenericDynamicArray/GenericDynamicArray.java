package homework_16.Vladimir_Vanyan.GenericDynamicArray;

import java.util.Arrays;

public class GenericDynamicArray<T> {
    private T[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


    public GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = (T[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public GenericDynamicArray() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
        System.out.println("Tne value was added in array.");
    }

    public T[] addByIndex(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return array;
    }

    public T[] addAllByIndex(int index, T[] values) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (size == array.length) {
            extend();
        }
        int oldSize = array.length;
        int newSize = oldSize + values.length;
        T[] tempArray = Arrays.copyOf(array, newSize);
        System.arraycopy(tempArray, index, tempArray, index + values.length, oldSize - index);
        System.arraycopy(values, 0, tempArray, index, values.length);
        array = tempArray;
        return tempArray;
    }


    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    public void addAll(T[] elements) {
        if (size == array.length) {
            this.extend();
        }
        for (T element : elements) {
            this.array[this.size++] = element;
        }
        System.out.println("All elements was added in Array.");
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        System.out.println("The array was cleared.");
    }

    public T[] clone(T[] array) {
        T[] newArray = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println("The array was cloned.");
        return newArray;
    }

    public boolean contains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(element + " exists in array.");
                return true;
            }
        }
        System.out.println(element + " does not exist.");
        return false;
    }

    public boolean containsAll(T[] arr) {
        for (T i : arr) {
            boolean containedElement = false;
            for (T j : array) {
                if (i == j) {
                    containedElement = true;
                    break;
                }
            }
            if (!containedElement) {
                System.out.println("The Array does not contain All elements from given array.");
                return false;
            }
        }
        System.out.println("The Array contains All elements from given array.");
        return true;
    }

    public int indexOf(T value) {
        int index = 0;
        if (contains(value) == true) {
            for (int i = 0; i < array.length; i++) {
                index = i;
                if (array[i] == value) {
                    System.out.println("Index of " + value + " is: " + index);
                    return index;
                }
            }
        } else {
            System.out.println(value + " does not exist in array.");
        }
        return index;
    }

    public void remove(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element does not exist.");
            return;
        }
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        size--;
        System.out.println(value + " was deleted.");
    }

    public void removeAll(T[] elements) {
        for (T element : elements) {
            remove(element);
        }
        System.out.println("All elements were deleted.");
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("The array is empty.");
            return true;
        } else {
            System.out.println("The array isn't empty.");
        }
        return false;
    }

    public T[] subList(int startIndex, int endIndex) {
        T[] subArray = (T[]) new Object[endIndex - startIndex];
        if (startIndex < 0 || endIndex > size || startIndex >= endIndex) {
            System.err.println("Illegal indexes, please try again.");
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                subArray[i - startIndex] = array[i];
            }
            for (T i : subArray) {
                System.out.print(" [" + i + "] ");
            }
        }
        return subArray;
    }

    public void set(int index, T value) {
        if (index >= size || index < 0) {
            System.err.println("Illegal index.");
            return;
        }
        this.array[index] = value;
        System.out.println("In index " + index + " was changed. New element is: " + value);
    }

    public int[] sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public String toString(T[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i != arr.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public void trimToSize() {
        if (array.length > size) {
            T[] newArray = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public T[] removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size || startIndex > endIndex) {
            System.err.println("Illegal indexes, please try again.");
        }
        int removeNum = endIndex - startIndex;
        System.arraycopy(array, endIndex, array, startIndex, size - endIndex);
        size -= removeNum;
        for (int i = size; i < size + removeNum; i++) {
            array[i] = null;
        }
        return array;
    }

    public void replaceAll(int index, T[] elements) {
        if (index >= size || index < 0) {
            System.err.println("Illegal indexes, please try again.");
            return;
        }
        if (index + elements.length > size) {
            System.err.println("Size is not correct.");
            return;
        }
        for (T element : elements) {
            array[index++] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
