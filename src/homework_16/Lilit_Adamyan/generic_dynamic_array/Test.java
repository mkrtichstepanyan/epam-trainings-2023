package homework_16.Lilit_Adamyan.generic_dynamic_array;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> arr1 = new DynamicArray<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        System.out.println("arr1: " + arr1);

        DynamicArray<Integer> arr2 = new DynamicArray<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        System.out.println("arr2: " + arr2);

        Integer[] arr3 = {4, 5, 6};
        arr1.addAll(arr3);
        System.out.println("Added array: " + arr1);

        arr2.clear();
        System.out.println("Clear: " + arr2);

        DynamicArray<Integer> arr4 = arr1.clone();
        System.out.println("clone: " + arr4.toString());

        System.out.println("contains 1: " + arr1.contains(1));
        System.out.println("contains 8: " + arr1.contains(8));

        Integer[] arr5 = {4, 5};
        Integer[] arr6 = {6, 7, 8};
        System.out.println("containsAll arr5: " + arr1.containsAll(arr5));
        System.out.println("containsAll arr6: " + arr1.containsAll(arr6));

        System.out.println("IndexOf 5 ->" + arr2.indexOf(5));

        arr1.remove(2);
        System.out.println("Remove 5 " + arr1);

        arr1.removeAll(arr5);
        System.out.println("RemoveAll : " + arr1);

        System.out.println("Is arr2 isEmpty: " + arr2.isEmpty());

        arr4.set(1, 5);
        System.out.println("Set: " + arr4);

        DynamicArray<Integer> arr7 = new DynamicArray<>();
        arr7.add(3);
        arr7.add(1);
        arr7.add(2);
        arr7.sort();
        System.out.println("sort: " + arr7);

        DynamicArray<Integer> arr8 = new DynamicArray<>(10);
        arr8.add(1);
        arr8.add(2);
        arr8.add(3);
        arr8.trimToSize();
        System.out.println("trimToSize: " + arr8);


        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Before replacing: " + arr);
        arr.replaceAll(2, 6);
        System.out.println("After replacing: " + arr);

        DynamicArray<Object> subList = arr4.subList(1, 4);

        System.out.println("Original array: " + arr4);
        System.out.println("Sub-list: " + subList);

        DynamicArray<Integer> arr9 = new DynamicArray<>();
        arr9.add(1);
        arr9.add(3);
        arr9.add(5);
        System.out.println("Original array: " + arr9);

        arr9.addByIndex(1, 2);
        System.out.println("After adding 2 at index 1: " + arr9);

        Integer[] valuesToAdd = {4, 6};
        arr9.addAllByIndex(3, valuesToAdd);
        System.out.println("After adding 4 and 6 at index 3: " + arr9);
    }

}
