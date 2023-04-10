package homework_16.Alina_Mkhoyan.generic_dynamic_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        GenericDynamicArray<Integer> dynamicArray = new GenericDynamicArray<>();
        GenericDynamicArray<String> arr = new GenericDynamicArray<>();
        arr.addAll(Arrays.asList("hello", "world"));
        System.out.println(arr); // [hello, world]
        arr.addByIndex(1, "Java");
        System.out.println(arr); // [hello, Java, world]
        arr.addAllByIndex(0, Arrays.asList("Java", "is", "cool"));
        System.out.println(arr); // [Java, is, cool, hello, Java, world]
        arr.clear();
        System.out.println(arr); // []
        arr.addAll(Arrays.asList("foo", "bar", "baz", "qux", "quux"));
        System.out.println(arr);

        System.out.println("-----Add method-----");
        dynamicArray.add(10);
        dynamicArray.add(90);
        dynamicArray.add(50);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(60);
        dynamicArray.add(20);
        System.out.println(dynamicArray.toString()); // Output: [10, 20, 30, 40,90]
        System.out.println("Before sorting: " + dynamicArray);
        dynamicArray.sort();
        System.out.println("After sorting: " + dynamicArray);

        System.out.println("---------------");

        System.out.println("-----addAll method-----");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 60, 70, 80));
        dynamicArray.addAll(list);
        System.out.println(dynamicArray.toString()); // Output: [10, 20, 30, 40, 50, 60, 70, 80]

        System.out.println("-----Clear method-----");
        dynamicArray.clear();
        System.out.println(dynamicArray.toString()); // Output: []

        System.out.println("-----clone method-----");
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        GenericDynamicArray clone = dynamicArray.clone();
        System.out.println(clone.toString()); // Output: [10, 20, 30]

        System.out.println("-----contains method-----");
        System.out.println(dynamicArray.contains(20)); // Output: true
        System.out.println(dynamicArray.contains(40)); // Output: false

        System.out.println("-----containsAll method-----");
        list = new ArrayList<>(Arrays.asList(10, 30, 50));
        System.out.println(dynamicArray.containsAll(list)); // Output: false
        dynamicArray.addAll(list);
        System.out.println(dynamicArray.containsAll(list)); // Output: true

        System.out.println("-----indexOf method-----");
        System.out.println(dynamicArray.indexOf(20)); // Output: 1
        System.out.println(dynamicArray.indexOf(40)); // Output: -1

        System.out.println("-----remove method-----");
        dynamicArray.remove(20);
        System.out.println(dynamicArray.toString()); // Output: [10, 30, 10, 30, 50]

        System.out.println("-----removeAll method-----");
        list = new ArrayList<>(Arrays.asList(10, 50, 70));
        dynamicArray.removeAll(list);
        System.out.println(dynamicArray.toString()); // Output: [30, 30]

        System.out.println("-----isEmpty method-----");
        System.out.println(dynamicArray.isEmpty()); // Output: false
        dynamicArray.clear();
        System.out.println(dynamicArray.isEmpty()); // Output: true

        System.out.println("-----subList method-----");
        dynamicArray.addAll(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80)));
        GenericDynamicArray subList = dynamicArray.subList(2, 6);
        System.out.println(subList.toString()); // Output: [30, 40, 50, 60]

        System.out.println("-----set method-----");
        dynamicArray.set(4, 55);
        System.out.println(dynamicArray.toString()); // Output: [10, 20, 30, 40, 55, 60, 70,80]

        System.out.println("-----removeRang method-----");
        dynamicArray.removeRange(2, 5);
        System.out.println(subList.toString());

        System.out.println("-----------------------");
        System.out.println(dynamicArray);

    }
}
