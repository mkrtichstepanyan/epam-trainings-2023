package homework_16.Varsik_Pijoyan.DynamicArray;

import java.util.Arrays;

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
        for (int i : values) {
            add(i);
        }
    }


    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("The size is empty");
            return true;
        }
        System.out.println("The size is not empty");
        return false;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void clear() {
        Arrays.fill(array, 0);

    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Given element contains in the array");
                return true;
            }
        }
        System.out.println("Given element doesn't contains in the array");
        return false;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index to set an element!");
        }
        this.array[index] = value;
    }

    public int[] clone(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Index of given element " + element + ", " + "is: " + i);
            }
        }
        System.out.println("Given element does not found");
    }


    public boolean containsAll(int[] array) {
        boolean isContainsAll = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array.length; j++) {
                if (contains(array[j])) {
                    isContainsAll = true;

                } else {
                    return false;
                }
            }
        }
        return isContainsAll;
    }

    public boolean remove(int element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    array[i] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeAll(int[] list) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < list.length; j++) {
                    if (array[i] == list[j]) {
                        array[i] = 0;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int[] subList(int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = array[i];
        }
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        return subArray;
    }

    public void replaceAll(int index, int[] values) {
        if (index >= this.size || index < 0) {
            System.out.println("Array index error! ");
            return;
        }
        if (index + values.length > this.size) {
            System.out.println("Array size error! ");
            return;
        }
        for (int value : values) {
            this.array[index++] = value;
        }
    }

    public int[] removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            System.out.println("Invalid range! ");
            return null;
        }
        int[] newArray = new int[array.length - (endIndex - startIndex + 1)];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < startIndex || i > endIndex) {
                newArray[j] = array[i];
                j++;
            }
        }

        return newArray;
    }

    public void trimToSize() {
        if (this.array.length > this.size) {
            int[] newArray = new int[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size - 1; i++) {
            builder.append(array[i]).append(", ");
        }
        builder.append(array[size - 1]).append("]");
        return builder.toString();
    }

}
