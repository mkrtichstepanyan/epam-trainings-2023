package homework_16.Varsik_Pijoyan.GenericDynamicArray;

public class GenericDynamicArray<T> implements Cloneable{
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
    }

    public void addByIndex(int index, T element) {
        for (int i = size; i < index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public void addAllByIndex(int index, T[] list) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Wrong index!");
        }
        int listLength = list.length;
        for (int i = size; i < listLength; i--) {
            extend();
            array[i + listLength] = array[i];
        }
        for (int i = 0; i < listLength; i++) {
            array[index++] = list[i];
            size++;
        }
    }

    private void extend() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return (T) array[index];
    }

    public void addAll(T[] values) {
        for (T value : values) {
            add(value);
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
                Comparable<T> comp1 = (Comparable<T>) array[j];
                Comparable<T> comp2 = (Comparable<T>) array[j + 1];
                if (comp1.compareTo((T) comp2) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Given element contains in the array");
                return true;
            }
        }
        System.out.println("Given element doesn't contains in the array");
        return false;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index to set an element!");
        }
        this.array[index] = value;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

//    public T[] clone() {
//        T[] newArray = (T[]) new Object[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
//        return newArray;
//    }

    public void indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Index of given element " + element + ", " + "is: " + i);
            }
        }
        System.out.println("Given element does not found");
    }

    public boolean containsAll(T[] array) {
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

    public boolean remove(T element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        size--;
        return true;
    }

    public boolean removeAll(T element) {
        boolean removed = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != element) {
                array[index] = array[i];
                index++;

            } else {
                removed = true;
            }
        }
        size = index;
        return removed;
    }

    public T[] subList(int startIndex, int endIndex) {
        T[] subArray = (T[]) new Object[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = array[i];
        }
        for (T i : subArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        return subArray;
    }

    public void replaceAll(int index, T[] values) {
        if (index >= this.size || index < 0) {
            System.out.println("Array index error! ");
            return;
        }
        if (index + values.length > this.size) {
            System.out.println("Array size error! ");
            return;
        }
        for (T value : values) {
            this.array[index++] = value;
        }
    }

    public T[] removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            System.out.println("Invalid range! ");
            return null;
        }
        T[] newArray = (T[]) new Object[array.length - (endIndex - startIndex + 1)];
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
            T[] newArray = (T[]) new Object[this.size];
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
