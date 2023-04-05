package homework_16.melo_tutkhalyan.generic_dynamic_array;

public class Test {
    public static void main(String[] args) {
        DynamicArrayWithGeneric dynamicArrayWithGeneric = new DynamicArrayWithGeneric<Integer>();

        dynamicArrayWithGeneric.addAll(new Integer[]{5,9,3,4,9,7,1,8,15,7,21});
        System.out.println(dynamicArrayWithGeneric);
        System.out.println(dynamicArrayWithGeneric.contains(7));
        System.out.println(dynamicArrayWithGeneric.containsAll(new Integer[]{8, 9, 10}));
        System.out.println(dynamicArrayWithGeneric.indexOf(4));
        System.out.println(dynamicArrayWithGeneric.remove(12));
        System.out.println(dynamicArrayWithGeneric.getSize());
        System.out.println(dynamicArrayWithGeneric.removeAll(new Integer[]{9, 2}));
        System.out.println(dynamicArrayWithGeneric);
        System.out.println(dynamicArrayWithGeneric.getSize());
        dynamicArrayWithGeneric.trimToSize();
        System.out.println(dynamicArrayWithGeneric);
        System.out.println(dynamicArrayWithGeneric.subList(1, 3));
        System.out.println(dynamicArrayWithGeneric.set(2, 15));
        System.out.println(dynamicArrayWithGeneric);
        dynamicArrayWithGeneric.removeRange(2, 5);
        dynamicArrayWithGeneric.trimToSize();
        System.out.println(dynamicArrayWithGeneric);
        dynamicArrayWithGeneric.addByIndex(3,33);
        System.out.println(dynamicArrayWithGeneric);
        dynamicArrayWithGeneric.addAllByIndex(3,new Integer[]{44,55,77});
        System.out.println(dynamicArrayWithGeneric);

    }

}
