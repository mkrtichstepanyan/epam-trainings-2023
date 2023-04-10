package homework_16.Ani_Barseghyan.generic_dynamic_array;

import java.util.Arrays;

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
public class GenericDynamicArray<Type> {
    private Type[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;


    GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = (Type[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array capacity must be bigger than 0");
        }
    }

    GenericDynamicArray() {
        this.array = (Type[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(Type value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void addAll(Type[] arr) {
        if (size == array.length) {
            extend();
        }
        for (Type j : arr) {
            array[size++] = j;
        }
    }

    public void addByIndex(int index, Type value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    public void addAllByIndex(int index, Type[] newArray) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + newArray.length, size - index);
        for (Type element : newArray) {
            array[index++] = element;
        }
        size += newArray.length;
    }

    public void clear() {
        Arrays.fill(array, 0);
        size = 0;
    }

    public Type[] cloneArr() {
        Type[] clonedArr = (Type[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            clonedArr[i] = array[i];
        }
        return clonedArr;
    }

    public boolean contains(Type value) {
        for (Type j : array) {
            if (value == j) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Type[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (contains(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Type value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) return i;
        }
        return -1;
    }

    public Type[] remove(Type value) {
        int index = indexOf(value);
        if (index > 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        return array;
    }

    public Type[] removeAll(Type[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (containsAll(arr)) {
                remove(arr[i]);
            }
        }
        return array;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public GenericDynamicArray subList(int startIndex, int lastIndex) {

        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        GenericDynamicArray subArr = new GenericDynamicArray(lastIndex - startIndex);
        for (int i = startIndex; i < lastIndex; i++) {
            subArr.add(array[i]);
        }
        return subArr;
    }

    public void set(int index, Type value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Array index can not be less than 0 and big than size");
        }
        array[index] = value;
    }

//    public void sort() {
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//        }
//    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i != size - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');

        return stringBuilder.toString();
    }

    public Type get(int index) {
        if (index < 0 || index > array.length - 1) {
            throw new IllegalArgumentException("Array index can not be less than 0 ");
        }
        return array[index];
    }

    public void trimToSize() {
        Type[] trimArr = (Type[]) new Object[size];
        for (int i = 0; i < size; i++) {
            trimArr[i] = array[i];
        }
        array = trimArr;
    }

    public void removeRange(int startIndex, int lastIndex) {
        if (startIndex < 0 || lastIndex > size || startIndex > lastIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        GenericDynamicArray arr = subList(startIndex, lastIndex);
        for (int i = startIndex; i < lastIndex; i++) {
            removeAll((Type[]) arr.cloneArr());
        }
    }

    public Type[] replaceAll(Type oldValue, Type newValue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    private void extend() {
        Type[] newArray = (Type[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
