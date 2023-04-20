package homework_16.Argishti_Mesropyan;

public class DynamicTest {
    public static void main(String[] args) {
        DynamicArray arrayList = new DynamicArray();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(45);
        arrayList.add(100);
        System.out.println("addAll: >>> " + arrayList);
        int[] arrayElements = {2, 4, 9, 20, 6, 99, 87, 15, 23, 42, 8, 25, 47, 55, 21};
        arrayList.addAll(arrayElements);
        System.out.println("After: >>> " + arrayList);
        arrayList.contains(100);
        System.out.println("Contains: >>>" + arrayList);
        DynamicArray clonedArray = arrayList.clone();
        System.out.println("cloned array: " + clonedArray);
        arrayList.sort(arrayElements);
        System.out.println("Sorted: " + arrayList);
        arrayList.remove(4);
        System.out.println("Remove single element '4': " + arrayList);
        arrayList.trimToSize();
        System.out.println("TrimToSize: " + arrayList);
        arrayList.replace(100, 200);
        System.out.println("newValue is: " + arrayList);
        arrayList.removeAll(arrayElements);
        System.out.println("removeAll: " + arrayList);
        System.out.println("index of value: " + arrayList.indexOf(55));
        arrayList.clear();
        System.out.println("clear elements of array: " + arrayList);
    }
}
