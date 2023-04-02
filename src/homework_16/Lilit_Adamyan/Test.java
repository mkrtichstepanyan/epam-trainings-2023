package homework_16.Lilit_Adamyan;

public class Test {
    public static void main(String[] args) {

        DynamicArray arr1 = new DynamicArray();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        System.out.println("arr1: " + arr1.toString());

        DynamicArray arr2 = new DynamicArray();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        System.out.println("arr2: " + arr2.toString());

        int[] arr3 = {4, 5, 6};
        arr1.addAll(arr3);
        System.out.println("Added array: " + arr1);

        arr2.clear();
        System.out.println("Clear: " + arr2);

        DynamicArray arr4 = arr1.clone();
        System.out.println("clone: " + arr4.toString());

        System.out.println("contains 1: " + arr1.contains(1));
        System.out.println("contains 8: " + arr1.contains(8));

        int[] arr5 = {4, 5};
        int[] arr6 = {6, 7, 8};
        System.out.println("containsAll arr5: " + arr1.containsAll(arr5));
        System.out.println("containsAll arr6: " + arr1.containsAll(arr6));

        System.out.println("IndexOf 5 ->" + arr2.indexOf(5));

        arr1.remove(2);
        System.out.println("Remove 5 " + arr1.toString());

        arr1.removeAll(arr5);
        System.out.println("RemoveAll : " + arr1.toString());

        System.out.println("Is arr2 isEmpty: " + arr2.isEmpty());

        arr4.set(1, 5);
        System.out.println("Set: " + arr4.toString());

        DynamicArray arr7 = new DynamicArray();
        arr7.add(3);
        arr7.add(1);
        arr7.add(2);
        arr7.sort();
        System.out.println("sort: " + arr7.toString());

        DynamicArray arr8 = new DynamicArray(10);
        arr8.add(1);
        arr8.add(2);
        arr8.add(3);
        arr8.trimToSize();
        System.out.println("trimToSize: " + arr8.toString());


        DynamicArray arr = new DynamicArray();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Before replacing: " + arr);
        arr.replaceAll(2, 6);
        System.out.println("After replacing: " + arr);

    }
}
