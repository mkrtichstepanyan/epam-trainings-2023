package homework_16.melo_tutkhalyan;

public class Test {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.addAll(new int[]{8, 9, 2, 4, 3, 7, 1, 33, 11, 6, 22, 21, 25});


        System.out.println(dynamicArray);
        System.out.println(dynamicArray.contains(7));
        System.out.println(dynamicArray.containsAll(new int[]{8, 9, 10}));
        System.out.println(dynamicArray.indexOf(4));
        System.out.println(dynamicArray.remove(12));
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.removeAll(new int[]{9, 2}));
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getSize());
        dynamicArray.trimToSize();
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.subList(1, 3));
        System.out.println(dynamicArray.set(2, 15));
        System.out.println(dynamicArray);
        dynamicArray.sort();
        System.out.println(dynamicArray);
        dynamicArray.removeRange(2, 5);
        dynamicArray.trimToSize();
        System.out.println(dynamicArray);

    }
}
