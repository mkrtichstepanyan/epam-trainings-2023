package homework_16.InesaMkrtchyan;

import homework_16.InesaMkrtchyan.DynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(7);
        arr.addAll(1,2,3);
        arr.remove(3);
        arr.addAll(4,5);
        arr.sort();
        for(int i = 0; i <= arr.getSize(); i++){
            System.out.println(arr.getByIndex(i));
        }
    }
}
