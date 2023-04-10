package homework_16.Alina_Mkhoyan;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        System.out.println("-----Add method-----");
        array.add(10);
        array.add(90);
        array.add(50);
        array.add(30);
        array.add(40);
        array.add(60);
        array.add(20);
        System.out.println(array.toString()); // Output: [10, 20, 30, 40,90]
        System.out.println("Before sorting: " + array);
        array.sort();
        System.out.println("After sorting: " + array);

        System.out.println("---------------");

        System.out.println("-----addAll method-----");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 60, 70, 80));
        array.addAll(list);
        System.out.println(array.toString()); // Output: [10, 20, 30, 40, 50, 60, 70, 80]

        System.out.println("-----Clear method-----");
        array.clear();
        System.out.println(array.toString()); // Output: []

        System.out.println("-----clone method-----");
        array.add(10);
        array.add(20);
        array.add(30);
        DynamicArray clone = array.clone();
        System.out.println(clone.toString()); // Output: [10, 20, 30]

        System.out.println("-----contains method-----");
        System.out.println(array.contains(20)); // Output: true
        System.out.println(array.contains(40)); // Output: false

        System.out.println("-----containsAll method-----");
        list = new ArrayList<>(Arrays.asList(10, 30, 50));
        System.out.println(array.containsAll(list)); // Output: false
        array.addAll(list);
        System.out.println(array.containsAll(list)); // Output: true

        System.out.println("-----indexOf method-----");
        System.out.println(array.indexOf(20)); // Output: 1
        System.out.println(array.indexOf(40)); // Output: -1

        System.out.println("-----remove method-----");
        array.remove(20);
        System.out.println(array.toString()); // Output: [10, 30, 10, 30, 50]
        array.remove(40);
        System.out.println(array.toString()); // Output: [10, 30, 10, 30, 50]

        System.out.println("-----removeAll method-----");
        list = new ArrayList<>(Arrays.asList(10, 50, 70));
        array.removeAll(list);
        System.out.println(array.toString()); // Output: [30, 30]

        System.out.println("-----isEmpty method-----");
        System.out.println(array.isEmpty()); // Output: false
        array.clear();
        System.out.println(array.isEmpty()); // Output: true

        System.out.println("-----subList method-----");
        array.addAll(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80)));
        DynamicArray subList = array.subList(2, 6);
        System.out.println(subList.toString()); // Output: [30, 40, 50, 60]

        System.out.println("-----set method-----");
        array.set(4, 55);
        System.out.println(array.toString()); // Output: [10, 20, 30, 40, 55, 60, 70,80]

        System.out.println("-----removeRang method-----");
        array.removeRange(2, 5);
        System.out.println(subList.toString());

        System.out.println("-----------------------");
        System.out.println(array);

    }

}
