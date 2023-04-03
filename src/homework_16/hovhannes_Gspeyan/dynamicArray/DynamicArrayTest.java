package homework_16.hovhannes_Gspeyan.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 3, 7, 9};
        DynamicArray dA = new DynamicArray();
        dA.add(35);
        dA.addAll(arr);
        dA.remove(2);
        dA.printArray();
        dA.indexOf(15);
        dA.contains(5);
        dA.containsAll(arr);
        dA.cloneArr(arr);
        dA.printArray();
        dA.trimToSize();
        System.out.println();
        dA.printArray();
        dA.removeAll(new int[]{3, 7});
        dA.printArray();
        System.out.println();
        dA.subList(1, 4);
        dA.set(1, 12);
        dA.printArray();
        dA.replaceAll(1, new int[]{18, 79});
        dA.printArray();
        dA.sortArray(arr);
        dA.toString(arr);
        dA.removeRange(1,4,arr);
        dA.clear();
    }
}
