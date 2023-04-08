package homework_16.araksya_ghazaryan;

import homework_6.gohar_hakobyan.chapter_8.D;

public class Test {
    public static void main(String[] args) {

        DynamicArray array= new DynamicArray();
        array.add(1);
        array.add(9);
        array.add(3);
        array.add(0);
        array.add(4);
        array.add(8);
        System.out.println("array " +array.toString());
        int[] newArray = {4, 5, 6};
        array.addAll(newArray);
        System.out.println("addAll: " + array);
        DynamicArray clearedArray= new DynamicArray();
        array.add(15);
        array.add(99);
        array.add(4);
        clearedArray.clear();
        System.out.println("clear: " + clearedArray);
        System.out.println("Is array isEmpty: " + clearedArray.isEmpty());
        DynamicArray clonedArray = array.clone();
        System.out.println("cloned: " + clonedArray.toString());
        System.out.println("contains : " + array.contains(2));
        System.out.println("contains : " + array.contains(10));
        System.out.println("IndexOf 5 " + array.indexOf(5));
        clonedArray.set(1, 5);
        System.out.println("Set: " + clonedArray .toString());
        array.sort();
        System.out.println("sort: " + array.toString());
        array.trimToSize();
        System.out.println("trimToSize: " + array.toString());
        System.out.println("before replacing: " + array);
        array.replaceAll(2, 6);
        System.out.println("after replacing: " + array);
        array.remove(2);
        System.out.println("remove 5 " + array.toString());
        System.out.println("removeAll : " +array.toString());
    }
}
