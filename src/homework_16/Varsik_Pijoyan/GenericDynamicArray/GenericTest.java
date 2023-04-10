package homework_16.Varsik_Pijoyan.GenericDynamicArray;

public class GenericTest {
    public static void main(String[] args) {
        GenericDynamicArray<Integer> genericDynamicArray = new GenericDynamicArray<>();
        System.out.println("Calling add() method");
        genericDynamicArray.add(2);
        genericDynamicArray.add(7);
        genericDynamicArray.add(1);
        genericDynamicArray.add(3);
        genericDynamicArray.add(9);
        genericDynamicArray.add(0);
        genericDynamicArray.add(5);
        genericDynamicArray.add(8);
        genericDynamicArray.add(4);
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("The size is: " + genericDynamicArray.getSize());
        System.out.println("-------------------------------");

        System.out.println("Calling sort() method");
        genericDynamicArray.sort();
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("Calling addAll() method");
        genericDynamicArray.addAll(new Integer[]{16, 10, 13, 11, 12});
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("Calling sort method after addAll() method");
        genericDynamicArray.sort();
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("Calling set() method");
        genericDynamicArray.set(12, 15);
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("Calling contains() method");
        System.out.println("Answer");
        genericDynamicArray.contains(2);
        System.out.println("-------------------------------");

        System.out.println("Calling indexOf() method");
        genericDynamicArray.indexOf(45);
        System.out.println("-------------------------------");

        System.out.println("Calling addByIndex() method");
        genericDynamicArray.addByIndex(14, 17);
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");

        System.out.println("Calling remove() method");
        genericDynamicArray.remove(3);
        System.out.println(genericDynamicArray);
        System.out.println("-------------------------------");
    }
}
