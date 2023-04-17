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

    public void add(int element) {
        if (size == array.length) {
            System.out.println("The array is already full");
            return;
        }
        array[size++] = element;
    }

    private void extand() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];

        }
        array = newArray;
    }
    public Object clone(){
        DynamicArray clone=new DynamicArray();

clone.array = Arrays.copyOf(this.array , this.array.length);
clone.size = this.size;

        System.out.println("here is cloned array");
        return clone;
    }
    public boolean isEmpty(){
        if(size==0);
        System.out.println("the array is empty");
        return false;
    }
    {
        System.out.println("the array contains ellement");
    }
    public boolean Contains(){
        if(size!=0);
        System.out.println("Array contains ellement");
        return true;
    }

}









