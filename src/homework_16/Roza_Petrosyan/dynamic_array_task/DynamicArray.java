package homework_16.Roza_Petrosyan.dynamic_array_task;

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

    public int[] addAll(int[] addedArray) {
        int addedLength;
        if (array.length - size >= addedArray.length) {
            addedLength = array.length;
        } else {
            addedLength = array.length + addedArray.length;
        }
        int[] newArray = new int[addedLength];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        int addedIndex = size;
        for (int i = 0; i < addedArray.length; i++) {
            newArray[addedIndex++] = addedArray[i];
            if (size == array.length) {
                extend();
            }
            array[size++] = addedArray[i];
        }
        return array;
    }

    public void clear() {
        size = 0;
        array = new int[]{};
    }

    public int[] clone() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public boolean contains(int value) {
        return indexOf(value) > -1;
    }

    public boolean containsAll(int[] innerArray) {
        for (int value : innerArray) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        int removedElement = -1;
        int[] newArray = new int[array.length - 1];
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                removedElement = array[i];
                size -= 1;
            } else {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        return removedElement;
    }
    public boolean removeAll(int[] removalArray) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < removalArray.length; j++) {
                if (array[i] == removalArray[j]) {
                    remove(i);
                    result = true;
                    i--;
                }
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int[] subList(int fromIndex, int toIndex) {
        int[] newArray = new int[toIndex - fromIndex];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i >= fromIndex && i < toIndex) {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public int set(int index, int value) {
        int result = 0;
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                result = array[i];
                array[i] = value;
            }
        }
        return result;
    }

    public int[] sort() {
        trimToSize();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public void trimToSize() {
        int[] trimArray = new int[size];
        for (int i = 0; i < trimArray.length; i++) {
            trimArray[i] = array[i];
        }
        array = trimArray;
    }

    public void removeRange(int fromIndex, int toIndex) {
        int[] newArray = new int[array.length - (toIndex - fromIndex)];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i < fromIndex || i >= toIndex) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
    }

    public int[] replaceAll(int value, int replacement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = replacement;
            }
        }
        return array;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int item : array)
            if (item == array[array.length - 1]) {
                sb.append(item);
            } else {
                sb.append(item).append(" ");
            }
        return sb.append("]").toString();
    }
}
