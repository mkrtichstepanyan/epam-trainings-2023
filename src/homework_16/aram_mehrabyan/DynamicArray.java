package homework_16.aram_mehrabyan;


/* Please create methods below
   addAll() -> adds all elements of a collection to arraylist+
   clear() -> removes all the elements from arraylist+
   clone() -> makes a copy of the array list
   contains() -> checks if the element is present in the arraylist+
   containsAll() -> checks if a collection is a subset of arraylist
   indexOf() -> returns the position of the specified element+
   remove() -> removes the single element from the arraylist+
   removeAll() -> removes multiple elements from the arraylist+
   isEmpty() -> checks if the arraylist is empty+
   subList() -> returns a portion of the arraylist+
   set() -> replace the single element from an arraylist+
   sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
   toString() -> converts the arraylist into a String
   trimToSize() -> trims the capacity of arraylist equal to the size+
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

    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        if (size == array.length) {
            extend();
        }
        size = size + 1;
        for (int k = size; k > index; k--) {
            array[k] = array[k - 1];
        }
        array[index] = value;
    }

    public void addAll(int[] a) {
        for (int arr : a) {
            add(arr);
        }
    }

    public void addAllByIndex(int index, int[] a) {
        if ((size == array.length) || a.length > size) {
            extend();
        }
        size += a.length;
        for (int k = size; k > index; k--) {
            array[k] = array[k - 1];
        }
        for (int j = 0; j < a.length; j++) {
            array[index] = a[j];
            index++;
        }
    }

    public int[] clone() {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public void remove(int index) {
        int k;
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                size = size - 1;
                for (k = i; k < size; k++)
                    array[k] = array[k + 1];
            }
        }
    }

    public void removeAll(int[] a) {
        int k;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < a.length; j++) {
                if (array[i] == a[j]) {
                    size = size - 1;
                    for (k = i; k < size; k++)
                        array[k] = array[k + 1];

                }
            }
        }
    }

    public void removeRange(int ind1, int ind2) {
        if (ind1 < 0 || ind2 > size - 1 || ind1 > ind2) {
            throw new ArrayIndexOutOfBoundsException("Wrong indexes");
        }
        int[] arr1 = new int[ind1];
        int[] arr2 = new int[size - ind2];
        for (int i = 0; i < ind1; i++)
            arr1[i] = array[i];
        System.arraycopy(arr1, 0, array, 0, arr1.length);
        for (int i = ind2 + 1, j = 0; i < size; i++, j++)
            arr2[j] = array[i];
        System.arraycopy(arr2, 0, array, arr1.length, arr2.length);
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

    public void clear() {
        for (int i = 0; i < array.length; i++)
            array[i] = 0;
        size = 0;
    }

    public boolean contains(int val) {
        boolean a = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == val) {
                a = true;
                break;

            }

        }
        return a;
    }

    public boolean containsAll(int[] a) {
        if (size < a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        boolean res = false;
        int j = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == a[j]) {
                count++;
                if (count == a.length) {
                    res = true;
                    break;
                }
                if (j == a.length) {
                    j = 0;
                } else j++;

            } else count = 0;


        }
        return res;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int indexOf(int val) {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == val) {
                k = i;
                break;
            }
        }
        return k;
    }

    public int[] sublist(int low, int high) {
        if (low < 0 || high > size - 1 || low > high) {
            throw new ArrayIndexOutOfBoundsException("Wrong indexes");
        }

        int length = high - low + 1;
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = array[low + i];
        }
        return a;
    }

    public void set(int val, int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i = 0; i < size; i++) {
            if (i == index)
                array[i] = val;
        }
    }

    public void sort() {
        int temp;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void trimToSize() {
        if (size < array.length) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void replaceAll(int val, int newval) {
        for (int i = 0; i < size; i++) {
            if (array[i] == val)
                array[i] = newval;
        }
    }

    public String toString() {
        String str1 = "[ ";
        String str2 = "]";
        String str = "";
        for (int i = 0; i < size; i++) {
            str += array[i] + ", ";
        }

        return str1 + str + str2;
    }

}
