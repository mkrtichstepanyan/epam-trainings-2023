package homework_16.garik_gharibyan.dynamic_array;

import homework_15.garik_gharibyan.Sort;

/* Please create methods below
+   addByIndex () -> added new value without replacing
+   addAll() -> adds all elements of a collection to arraylist
    addAllByIndex () -> added new values without replacing
+   clear() -> removes all the elements from arraylist
+   clone() -> makes a copy of the array list
+   contains() -> checks if the element is present in the arraylist
+   containsAll() -> checks if a collection is a subset of arraylist
+   indexOf() -> returns the position of the specified element
+   remove() -> removes the single element from the arraylist
+   removeAll() -> removes multiple elements from the arraylist
+   isEmpty() -> checks if the arraylist is empty
+   subList() -> returns a portion of the arraylist
+   set() -> replace the single element from an arraylist
+   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
+   toString() -> converts the arraylist into a String
+   trimToSize() -> trims the capacity of arraylist equal to the size
+   removeRange() -> removes a portion of the arraylist
+   replaceAll() -> replace all elements from the arraylist
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
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("The index must be in to range 0-" + size);
        }
        if (size == array.length) {
            extend();
        }
        int[] tempArray = new int[array.length];
        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }
        tempArray[index] = value;
        for (int i = index; i < size; i++) {
            tempArray[i + 1] = array[i];
        }
        array = tempArray;
        size++;

    }

    public void addAll(int[] newArray) {
        for (int i : newArray) {
            add(i);
        }
    }

    public void addAll(DynamicArray dynamicArray) {
        int size = dynamicArray.getSize();
        for (int i = 0; i < size; i++) {
            add(dynamicArray.get(i));
        }
    }

    public void addAllByIndex(int index, DynamicArray values) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("The index must be in to range 0-" + size);
        }
        DynamicArray tempDynamicArray = new DynamicArray();
        for (int i = 0; i < index; i++) {
            tempDynamicArray.add(array[i]);
        }
        for (int i = 0; i < values.size; i++) {
            tempDynamicArray.add(values.get(i));
        }
        for (int i = index; i < size; i++) {
            tempDynamicArray.add(array[i]);
        }
        array = tempDynamicArray.array;
        size = tempDynamicArray.getSize();
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range of 0-" + (size - 1));
        }
        int[] newArray = new int[size - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < size; i++) {
            newArray[i - 1] = array[i];
        }

//        System.arraycopy(array, 0, newArray, 0, index);
//        System.arraycopy(array, index + 1, newArray, index, size - (index + 1));
        array = newArray;
        size = size - 1;
        return true;
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex must be less  than toIndex");
        }
        if (fromIndex < 0) {
            throw new IllegalArgumentException("fromIndex must be bigger than 0");
        }
        if (toIndex > size) {
            throw new IllegalArgumentException("toIndex must be less  than " + size);
        }
        int[] tempArray = new int[size - (toIndex - fromIndex)];

        for (int i = 0; i < fromIndex; i++) {
            tempArray[i] = array[i];
        }
        int temp = fromIndex;
        for (int i = toIndex; i < size; i++) {
            tempArray[temp++] = array[i];
        }

//        System.arraycopy(array, 0, newArray, 0, fromIndex);
//        System.arraycopy(array, toIndex, newArray, fromIndex, size - toIndex);

        array = tempArray;
        size = size - (toIndex - fromIndex);
    }

    public boolean removeInt(int i) {
        if (this.contains(i)) {
            for (int j = 0; j < size; j++) {
                if (array[j] == i) {
                    remove(j);
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void removeAll(DynamicArray dynamicArray) {
        for (int i : array) {
            for (int j : dynamicArray.array) {
                if (j == i) {
                    this.removeInt(j);
                }
            }
        }
    }

    public DynamicArray subList(int fromIndex, int toIndex) {

        if (size == 0) {
            throw new IllegalArgumentException("DynamicArray is Empty");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex must be less  than toIndex");
        }
        if (fromIndex < 0) {
            throw new IllegalArgumentException("fromIndex must be bigger than 0");
        }
        if (toIndex > size) {
            throw new IllegalArgumentException("toIndex must be less  than " + size);
        }
        DynamicArray tmepDynamicArray = new DynamicArray();
        for (int i = fromIndex; i < toIndex; i++) {
            tmepDynamicArray.add(array[i]);
        }
        return tmepDynamicArray;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
        size = 0;
    }

    public DynamicArray clone() {
        DynamicArray tmepDynamicArray = new DynamicArray();
        for (int i = 0; i < size; i++) {
            tmepDynamicArray.add(array[i]);
        }
        return tmepDynamicArray;
    }

    public int indexOf(int obj) {
        for (int i = 0; i < size; i++) {
            if (array[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int obj) {
        if (indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    public boolean containsAll(int[] objs) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int obj : objs) {
                if (array[i] == obj) {
                    if (++index == objs.length) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range 0-" + (size - 1));
        }

        int temp;
        temp = array[index];
        array[index] = value;
        return temp;
    }

    public void sort() {
        Sort.insertion(array);

    }

    public void replaceAll(DynamicArray dynamicArray) {
        array = dynamicArray.array;
        size = dynamicArray.getSize();

    }

    public void trimToSize() {
        int[] tempArray = new int[size];
        if (size < array.length) {
            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (size == 0) {
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
        if (size == 1) {
            stringBuilder.append("[").append(array[0]).append("]");
            return stringBuilder.toString();
        }

        stringBuilder.append("[");
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.append(array[i]).append(", ");
        }
        stringBuilder.append(array[size - 1]).append("]");
        return stringBuilder.toString();
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

}
