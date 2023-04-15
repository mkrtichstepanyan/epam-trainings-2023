package homework_16.Radik_Manasyan.generic_dynamic_array;


import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

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
public class GenericDynamicArray<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] objects;

    private int size = 0;


    public GenericDynamicArray(int capacity) {
        try {
            if (capacity > 0) {
                objects = new Object[capacity];
            } else {
                throw new IllegalArgumentException("Array length must be bigger than 0");
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    public GenericDynamicArray() {
        objects = new Object[DEFAULT_CAPACITY];
    }


    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == objects.length) {
            extend();
        }
        objects[size++] = value;
    }

    public void addByIndex(int index, T value) {
        Object[] tmp = new Object[size + 1];

        try {
            if (index > size || index < 0) {
                throw new IllegalArgumentException("Index can not bigger than object length and less 0");
            } else {
                for (int i = 0; i <= size; i++) {
                    if (i != index) {
                        tmp[i] = objects[i];
                    } else {
                        tmp[i] = value;

                        for (int j = index; j < size; j++) {
                            tmp[j + 1] = objects[j];
                        }
                        break;
                    }
                }
                objects = tmp;
                size++;
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    public void addAllByIndex(int index, T[] values) {
        Object[] tmp = new Object[size + values.length];
        size = 0;
        try {
            if (index > objects.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index can not bigger than array length and less 0");
            } else {
                for (int i = 0; i < index; i++) {
                    tmp[i] = objects[size++];
                }
                for (int j = 0; j < values.length; j++) {
                    tmp[size++] = values[j];
                }
                for (int j = index; j < objects.length; j++) {
                    tmp[size++] = objects[j];
                }
                objects = tmp;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
    }

    public void addAll(T[] objects) {
        for (T object : objects) {
            add(object);
        }
    }

    public void clear() {
        objects = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public GenericDynamicArray<T> cloneObjects() {
        String path = "src/homework_16/Radik_Manasyan/generic_dynamic_array/testClone/objects.txt";
        GenericDynamicArray<T> cloneArray = new GenericDynamicArray<>(size);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(path))) {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] != null) {
                    objectOutputStream.writeObject(objects[i]);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(path))) {
            Object object = objectInputStream.readObject();
            cloneArray.add((T) object);

        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
        return cloneArray;
    }

    public boolean contains(T object) {
        for (Object o : objects) {
            if (o == object) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] object) {
        if (object.length > size) {
            return false;
        }
        for (T element : object) {
            boolean contains = contains(element);
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T object) {
        try {
            for (int i = 0; i < size; i++) {
                if (objects[i] == object) {
                    return i - 1;
                }
            }
            throw new NullPointerException(object + " is not contains in the object.");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public void remove(T object) {
        Object[] tmp;

        if (contains(object)) {

            tmp = new Object[size - 1];
            for (int i = 0, j = 0; i < this.size; i++, j++) {
                if (objects[i] != object) {
                    tmp[j] = objects[i];
                } else {
                    j--;
                }
            }
            size = tmp.length;
            objects = tmp;
        } else {
            System.out.println("Object is not contains " + object);
        }
    }

    public void removeAll(T[] removeElements) {
        for (T removeElement : removeElements) {
            remove(removeElement);
        }
    }

    public boolean isEmpty() {
        return objects.length == 0;
    }

    public Object[] subList(int endIndex) {
        Object[] tmp;
        if (endIndex <= 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException("Sub list index must be bigger than object length and small 0");
        } else {
            try {
                tmp = new Object[endIndex];
                for (int i = 0; i < endIndex; i++) {
                    tmp[i] = objects[i];
                }
                return tmp;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public Object[] subList(int startIndex, int endIndex) {
        Object[] tmp;
        int indexForTem = 0;

        if (startIndex == endIndex) {
            subList(startIndex);
        } else if (endIndex < startIndex) {
            throw new IllegalArgumentException("last index can not be smaller than first index");
        } else {
            try {
                tmp = new Object[endIndex - startIndex];
                for (int i = 0; i < size; i++) {
                    if (i >= startIndex && i < endIndex) {
                        tmp[indexForTem++] = objects[i];
                    }
                }
                return tmp;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public void set(int index, T value) {
        if (isEmpty()) {
            System.out.println("Object is empty");
        } else if (index < 0 || index > size) {
            throw new IllegalArgumentException("Object length must be bigger than " + size + " or less than 0");
        } else {
            try {
                objects[index] = value;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }

    }

    public void sort(Comparator<T> comparator) {
    }

    public void trimToSize() {
        Object[] tmp = new Object[size];
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                tmp[i] = objects[i];
            }
        }
        objects = tmp;

    }

    public void removeRange(int index) {
        Object[] tmp;
        int indexTmp = 0;
        if (index <= 0 || index > size) {
            throw new IllegalArgumentException("Object length must be bigger than " + size + " or less than 0");
        } else {
            try {
                tmp = new Object[size - index];
                for (int i = index; i < size; i++) {
                    tmp[indexTmp++] = objects[i];
                }
                objects = tmp;
                size = objects.length;
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
    }

    public void replaceAll(T object, T replace) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(object)) {
                objects[i] = replace;
            }

        }

    }

    public T get(int index) {
        T obj = null;
        try {
            if (index < 0 || index > size) {
                throw new ArrayIndexOutOfBoundsException("Wrong index");
            }
            obj = (T) objects[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        return obj;
    }

    private void extend() {
        Object[] newArray = new Object[objects.length * 2];
        for (int i = 0; i < objects.length; i++) {
            newArray[i] = objects[i];
        }
        objects = newArray;
    }

    public void print() {
        for (Object object : objects) {
            if (object != null) {
                System.out.println(object);

            }
        }
    }

    public String toString() {
        return Arrays.toString(objects);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericDynamicArray<?> that = (GenericDynamicArray<?>) o;

        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(objects, that.objects);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(objects);
        result = 31 * result + size;
        return result;
    }
}
