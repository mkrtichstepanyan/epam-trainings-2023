package homework_16.Argishti_Mesropyan.Generic_Dynamic_Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(8);
        array.add(6);
        array.add(2);
        array.add(7);
        array.add(23);
        System.out.println("Added these elements " + array);

        DynamicArray<String> stringArray = new DynamicArray<>();
        stringArray.addAll(Arrays.asList("apple", "red"));
        System.out.println("String: " + stringArray);

        Integer[] array2 = new Integer[]{33, 21, 12, 10};
        array.addAllInt(array2);
        System.out.println("Integer array: " + array);

        DynamicArray<Integer> clone = array.clone();
        System.out.println("clone: " + clone);

        System.out.println(array.contains(99));

        Integer[] s = {8, 7, 2};
        System.out.println(array.containsAll(s));

        array.remove(23);
        System.out.println("remove the single element of array" + array);

        System.out.println("checks if the arraylist is empty: " + array.isEmpty());

        System.out.println("returns a portion of the arraylist :  " + array.subList(0, 4));

        array.sort();
        System.out.println(array);

        array.replaceAll(2, 111);
        System.out.println("oldValue replace newValue " + array);

    }
}
