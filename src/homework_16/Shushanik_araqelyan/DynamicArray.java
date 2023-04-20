package homework_16.Shushanik_araqelyan;

import java.util.Arrays;

public class DynamicArray {
    private int array[];
    private int size = 0;
    private final int DEFAULT_CAPACITY = 4;


    public DynamicArray(int array[]) {

        this.array = array;
    }

    public DynamicArray(int capacity) {
        this.array = new int[capacity];

    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public void add(int value) {
            if (size == array.length) {
                extend();
            }
            array[size++] = value;
        System.out.println(value);
        }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];

        }
        array = newArray;
    }

    public Object clone() {
        DynamicArray clone = new DynamicArray();

        clone.array = Arrays.copyOf(this.array, this.array.length);
        clone.size = this.size;

        System.out.println("here is cloned array");
        return clone;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("the array is empty");
            return true;
        }
        System.out.println("the array contains element");
        return false;
    }

    public boolean contains(int item) {
        for (int i = 0; i < size; i++)
            if (array[i] == item) {
                System.out.println("The item contains in array");
                return true;
            }
        System.out.println("There is no similar item");
        return false;
    }
}











