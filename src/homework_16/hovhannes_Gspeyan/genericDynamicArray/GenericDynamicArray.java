package homework_16.hovhannes_Gspeyan.genericDynamicArray;

import homework_15.hovhannes_gspeyan.sorting_algorithms.SelectionSort;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class GenericDynamicArray<T> implements Serializable {

    private T[] arr;

    private int size;

    private static final int DEFAULT_CAPACITY = 16;

    public GenericDynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = (T[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public GenericDynamicArray() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == -1;
    }

    public void add(T value) {
        if (this.size == this.arr.length) {
            extend();
        }
        this.arr[this.size++] = value;
    }
    public void addByIndex(int index, T value){
        if(index >= this.size || index < 0){
            throw new IndexOutOfBoundsException("Invalid index! ");
        } else if (this.size == this.arr.length) {
            this.extend();
        }
        for (int i = this.size - 1; i >= index; i--) {
           this.arr[i + 1] = this.arr[i];
        }
        this.arr[index] = value;
        this.size++;
    }
    public void addAllByIndex(int index, T []values){
        if(index >= this.size || index < 0){
            throw new IndexOutOfBoundsException("Invalid index! ");
        } else if (this.size == this.arr.length) {
            this.extend();
        }
        for (int i = this.size; i >= index; i--) {
            this.arr[i + values.length] = this.arr[i];
        }
        for (T value : values) {
            this.arr[index++] = value;
        }
        this.size += values.length;
    }

    public void addAll(T[] values) {
        if (this.size == this.arr.length) {
            this.extend();
        }
        for (T value : values) {
            this.arr[this.size++] = value;
        }
    }

    public T get(int index) {
        if (index < 0 || index < this.size - 1) {
            throw new IndexOutOfBoundsException("Illegal index! ");
        }
        return this.arr[index];
    }

    public void clear() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = null;
            this.size = 0;
        }
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] array) {
        for (T i : array) {
            boolean found = false;
            for (T j : this.arr) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T value) {
        int index;
        for (int i = 0; i < this.arr.length; i++) {
            index = i;
            if (this.arr[i] == value) {
                return index;
            }
        }
        return -1;
    }

    public void remove(T value) {
        int indexToRemove = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.arr[i] == value) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Element not found! ");
            return;
        }
        for (int i = indexToRemove + 1; i < this.arr.length; i++) {
            this.arr[i - 1] = this.arr[i];
        }
        this.size--;
    }

    public void removeAll(T[] values) {
        for (T value : values) {
            this.remove(value);
        }
        this.trimToSize();
    }

    public T[] subList(int startIndex, int endIndex) {
        T[] subArray = (T[]) new Object[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = this.arr[i];
        }
        for (T i : subArray) {
            System.out.print(i + " | ");
        }
        return subArray;
    }

    public void set(int index, T value) {
        if (index >= this.size || index < 0) {
            System.out.println("Array index error! ");
            return;
        }
        this.arr[index] = value;
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
            this.arr[index++] = value;
        }
    }

    public int[] sortArray(int[] array) {
        SelectionSort.selectionSort(array);
        for (int i : array) {
            System.out.print(i + " | ");
        }
        return array;
    }

    public String toString(T[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public T[] removeRange(int startIndex, int endIndex, T[] array) {
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
        if (this.arr.length > this.size) {
            T[] newArray = (T[]) new Object[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.arr[i];
            }
            this.arr = newArray;
        }
    }

    public void printArray() {
        for (T i : this.arr) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }
    public GenericDynamicArray<T> deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
        objectStream.writeObject(this);
        ByteArrayInputStream byteInStream = new ByteArrayInputStream(byteStream.toByteArray());
        ObjectInputStream objInStream = new ObjectInputStream(byteInStream);
        return (GenericDynamicArray<T>) objInStream.readObject();
    }
    public void writeObj(){
        try {
            File file = new File("dynamicArray.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deserializeObj(){
        try {
            FileInputStream fileInputStream = new FileInputStream("dynamicArray.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            GenericDynamicArray gda = (GenericDynamicArray) objectInputStream.readObject();
            System.out.println(gda.toString());
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public T[] deepClone(T[] originalArray) throws InstantiationException, IllegalAccessException {
        T[] clonedArray = (T[]) Array.newInstance(originalArray.getClass().getComponentType(), originalArray.length);
        for (int i = 0; i < originalArray.length; i++) {
            clonedArray[i] = cloneObject(originalArray[i]);
        }
        return clonedArray;
    }

    private <T> T cloneObject(T obj) throws IllegalAccessException, InstantiationException {
        Class<T> objClass = (Class<T>) obj.getClass();
        T clonedObj = objClass.newInstance();
        for (Field field : objClass.getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(obj);
            value = getObject(field, value);
            field.set(clonedObj, value);
        }
        return clonedObj;
    }

    private <T> T getObject(Field field, T value) throws IllegalAccessException, InstantiationException {
        if (value != null && field.getType().isArray()) {
            Class<?> componentType = field.getType().getComponentType();
            int length = Array.getLength(value);
            T newArray = (T) Array.newInstance(componentType, length);
            for (int i = 0; i < length; i++) {
                Array.set(newArray, i, Array.get(value, i));
            }
            value = newArray;
        } else if (value != null && !field.getType().isPrimitive() && !field.getType().getName().startsWith("java.")) {
            value = cloneObject(value);
        }
        return value;
    }

    private void extend() {
        T[] newArr = (T[]) new Object[this.arr.length * 2];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }
    @Override
    public String toString() {
        return Arrays.toString(arr) +
                '}';
    }
}
