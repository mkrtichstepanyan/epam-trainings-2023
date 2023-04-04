package homework_16.Diana_Melkonyan;


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

    public void addAll(int[] value) {
        for (int i = 0; i < value.length; i++) {
            add(value[i]);
        }
    }


    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }




    //--------------------------------------------------------------------
    public void clear() {
      for (int i=0;i<array.length;i++){
          array[i]=0;
      }
    }

    //--------------------------------------------------------------------
    public int[] clone() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    //--------------------------------------------------------------------
    public int[] remove(int value) {
        int index= indexOf(value);
        if(index>0){
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
        }
            size--;
        }
        return array;
    }

    //--------------------------------------------------------------------
    public boolean removeAll(int[] value) {
        boolean x = false;
        for (int j : value) {
            if (contains(j))
                remove(j);
            x = true;

        }
        return x;
    }

    //--------------------------------------------------------------------
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                string += array[i] + ", ";
            } else {
                string += array[i];
            }
        }
        return string;
    }

    //--------------------------------------------------------------------
    public void sort() {
        boolean curr = true;
        while (curr) {
            curr = false;
            for (int i = 0; i < size -1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    curr = true;
                }
            }
        }
    }

    //--------------------------------------------------------------------
    public boolean izEmpty() {
        return size == 0;
    }

    //--------------------------------------------------------------------
    public int[] subList(int startIndex, int endIndex) {
        int[] newArray = new int[endIndex - startIndex];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex];
            startIndex++;
        }
        return newArray;
    }


    //--------------------------------------------------------------------
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    //--------------------------------------------------------------------
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //-------------------------------------------------------------------
    public void set(int index, int newIndex) {
        array[index] = newIndex;
    }

    //------------------------------------------------------------------
    public int[] replaceAll(int value, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //------------------------------------------------------------------
    public void removeRange(int start, int end) {
        int a = end - start;
        for (int i = 0; i < size - a; i++) {
            array[i] = array[i + a];
        }
        size -= a;
    }

    //------------------------------------------------------------------
    public void trimToSize() {
        if (size < array.length) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
