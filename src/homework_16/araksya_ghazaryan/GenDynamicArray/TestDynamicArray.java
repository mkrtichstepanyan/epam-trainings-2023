package homework_16.araksya_ghazaryan.GenDynamicArray;


public class TestDynamicArray {
    public static void main(String[] args) {
        GenericDynamicArray<Object> array = new GenericDynamicArray<>(10);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(15);
        array.add(64);
        array.add(77);
        System.out.println("new array" + array);
        Object[] valuesToAdd = new Object[]{9, 10, 11};
        Object[] integers = array.addAllByIndex(2, valuesToAdd);
        GenericDynamicArray<Object> clone = array.clone();
        System.out.println(clone);

        GenericDynamicArray<Object> array2 = new GenericDynamicArray<>(10);
        array2.add(51);
        array2.add(6);
        array2.add(0);
        array2.add(51);
        array2.add(4);
        array2.add(5);
        System.out.println("Second Array items: " + array2);
        array2.clear();
        System.out.println(array2);

        GenericDynamicArray<Object> array3 = new GenericDynamicArray<>(10);
        array3.add(6);
        array3.add(75);
        array3.add(51);
        array3.add(4);
        array3.add(5);
        array3.contains(75);
        array3.contains(20);
        System.out.println("First array items: " + array);
        System.out.println("Third array items: " + array3);
        array3.containsAll(array);

        System.out.println("First array items: " + array);
        array.indexOf(0);
        array.indexOf(10);
        System.out.println("First array items: " + array);
        array.remove(5);
        array.remove(7);
        System.out.println("First array items: " + array);
        array.add(11);
        System.out.println("First array items: " + array);
        array.removeAll(11);
        System.out.println("First array items: " + array);
        array.isEmpty();
        GenericDynamicArray<Integer> emptyArray = new GenericDynamicArray<>();
        emptyArray.isEmpty();
        System.out.println("Second array items: " + array2);
        GenericDynamicArray<Object> dynamicArray = array2.subList(3, 10);
        System.out.println(dynamicArray);
        System.out.println("First array items: " + array);
        array.set(0, 20);
        System.out.println("First array items: " + array);

        System.out.println(array3.getSize());
        System.out.println(array3.getLength());
        array3.trim();
        System.out.println(array3.getLength());
        System.out.println(array);
        System.out.println("Third Array items: " + array3);
        array3.removeRange(3, 8);
        System.out.println("Second Array items: " + array);
    }
}