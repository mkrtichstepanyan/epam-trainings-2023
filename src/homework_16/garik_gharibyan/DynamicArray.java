package homework_16.garik_gharibyan;

import homework_15.garik_gharibyan.Sort;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

/* Please create methods below
+   addAll() -> adds all elements of a collection to arraylist
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

    public void addAll(int[] newArray) {
        for (int i : newArray) {
            add(i);
        }
    }

    public void addAll(DynamicArray dynamicArray) {
        int[] array = dynamicArray.array;
        int size = dynamicArray.getSize();
        for (int i = 0; i < size; i++) {
            add(array[i]);
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range of 0-" + (size - 1));
        }
        int[] newArray = new int[size - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index+1; i < size; i++) {
            newArray[i-1] = array[i];
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
        int[] newArray = new int[size - (toIndex - fromIndex)];

        for (int i = 0; i < fromIndex; i++) {
            newArray[i] = array[i];
        }
        int temp = fromIndex;
        for (int i = toIndex; i < size; i++) {
            newArray[temp++] = array[i];
        }

//        System.arraycopy(array, 0, newArray, 0, fromIndex);
//        System.arraycopy(array, toIndex, newArray, fromIndex, size - toIndex);

        array = newArray;
        size = size - (toIndex - fromIndex);
    }

    public boolean removeInt(int i){
        if (this.contains(i)){
            for (int j = 0; j < size; j++) {
                if (array[j] == i){
                    remove(j);
                    break;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public void removeAll(DynamicArray dynamicArray){
        for (int i:array) {
            for (int j: dynamicArray.array) {
                if (j == i){
                    this.removeInt(j);
                }
            }
        }
    }

    public DynamicArray subList(int fromIndex, int toIndex) {

        if (size == 0){
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
        DynamicArray newDynamicArray = new DynamicArray();
        for (int i = fromIndex; i < toIndex; i++) {
            newDynamicArray.add(array[i]);
        }
        return newDynamicArray;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            this.remove(i);
        }
        size = 0;
    }

    public DynamicArray clone() {
        DynamicArray newDynamicArray = new DynamicArray();
        for (int i = 0; i < size; i++) {
            newDynamicArray.add(array[i]);
        }
        return newDynamicArray;
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
            throw new IllegalArgumentException("The index must be in to range 0-" + (size-1));
        }

        int temp;
        temp = array[index];
        array[index] = value;
        return temp;
    }

    public void sort() {
        Sort.insertion(array);

    }

    public void replaceAll(DynamicArray dynamicArray){
       array = dynamicArray.array;
       size = dynamicArray.getSize();

    }

    public void trimToSize() {
        int[] newArray = new int[size];
        if (size < array.length) {
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
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
