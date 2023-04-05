package homework_16.garik_gharibyan.generic_dynamic_array;


import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
public class GenericDynamicArray<T extends Comparable<T>> {

    private Object[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;

    public GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.array =  new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public GenericDynamicArray() {
        this.array = new Object[DEFAULT_CAPACITY];
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

    public void addByIndex(int index, T value) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("The index must be in to range 0-" + size);
        }
        if (size == array.length) {
            extend();
        }
        Object[] tempArray = new Object[array.length];
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

    public void addAll(T[] values) {
        for (T i : values) {
            add(i);
        }
    }

    public void addAll(GenericDynamicArray<T> genericDynamicArray) {
        int size = genericDynamicArray.getSize();
        for (int i = 0; i < size; i++) {
            add(genericDynamicArray.get(i));
        }
    }

    public void addAllByIndex(int index, GenericDynamicArray<T> values) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("The index must be in to range 0-" + size);
        }
        GenericDynamicArray<T> tempDynamicArray = new GenericDynamicArray<>();
        for (int i = 0; i < index; i++) {
            tempDynamicArray.add((T)array[i]);
        }
        for (int i = 0; i < values.size; i++) {
            tempDynamicArray.add(values.get(i));
        }
        for (int i = index; i < size; i++) {
            tempDynamicArray.add((T)array[i]);
        }
        array = tempDynamicArray.array;
        size = tempDynamicArray.getSize();
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range of 0-" + (size - 1));
        }
        Object[] tempArray = new Object[array.length];
        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }
        for (int i = index + 1; i < size; i++) {
            tempArray[i - 1] = array[i];
        }

//        System.arraycopy(array, 0, newArray, 0, index);
//        System.arraycopy(array, index + 1, newArray, index, size - (index + 1));
        array = tempArray;
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
        Object[] tempArray = new Object[array.length];

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

    public boolean removeObject(T obj) {
        if (this.contains(obj)) {
            for (int j = 0; j < size; j++) {
                if (array[j].equals(obj)) {
                    remove(j);
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void removeAll(GenericDynamicArray<T> genericDynamicArray) {
        for (Object obj : array) {
            for (int j = 0; j < genericDynamicArray.getSize(); j++) {
                if (genericDynamicArray.get(j).equals(obj)){
                    this.removeObject(genericDynamicArray.get(j));
                }
            }
        }
    }

    public GenericDynamicArray<T> subList(int fromIndex, int toIndex) {

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
        GenericDynamicArray<T> tempGenericDynamicArray = new GenericDynamicArray<>();
        for (int i = fromIndex; i < toIndex; i++) {
            tempGenericDynamicArray.add((T)array[i]);
        }
        return tempGenericDynamicArray;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return(T) array[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int indexOf(T obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T obj) {
        if (indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    public boolean containsAll(T[] values) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (T t : values) {
                if (array[i].equals(t)){
                    index++;
                }
                if (index == values.length){
                    return true;
                }
//                if (array[i] == t) {
//                    if (++index == values.length) {
//                        return true;
//                    }
//                    break;
//                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range 0-" + (size - 1));
        }

        T temp;
        temp =(T) array[index];
        array[index] = value;
        return temp;
    }

    public void sort() {
        this.insertionSort();

    }

    public void replaceAll(GenericDynamicArray<T> genericDynamicArray) {
        array = genericDynamicArray.array;
        size = genericDynamicArray.getSize();

    }

    public void trimToSize() {
        Object[] tempArray = new Object[size];
        if (size < array.length) {
            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    public GenericDynamicArray<T> clone() {
        GenericDynamicArray<T> newGenericDynamicArray = new GenericDynamicArray<>(array.length);

        for (int i = 0; i < size; i++) {
            Object newObj = new Object();
            newObj = array[i];
            newGenericDynamicArray.add((T)newObj);

        }
        return newGenericDynamicArray;
    }


    public String sizeAndLength(){
        return " ,size: " + size +
                " ,length: "+ array.length;
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
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    private void insertionSort() {

        T temp;
        for (int k = 0; k < size; k++) {
            for (int i = k; i > 0; i--) {

                if (((T)array[i]).compareTo((T)array[i - 1]) < 0) {
                    temp =(T) array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
