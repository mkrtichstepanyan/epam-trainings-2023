package homework_16.Nona_Asatryan.dynamicArray;

public class Test {
    public static void main(String[] args) {
        int[] array = {55, 34, 4, 5, 27};
        DynamicArray dynArray = new DynamicArray(array.length);
        dynArray.addAll(array);
        System.out.println(dynArray.toString());

        dynArray.sort();
        System.out.println(dynArray.toString());

        dynArray.add(9);
        dynArray.add(7);
        System.out.println(dynArray.toString());

        dynArray.addByIndex(1, 22);
        System.out.println(dynArray.toString());

        dynArray.addAllByIndex(2, 7, 8, 11);
        System.out.println(dynArray.toString());

        System.out.println(dynArray.contains(5));
        System.out.println(dynArray.containsAll(array));
        System.out.println(dynArray.indexOf(34));
        System.out.println(dynArray.isEmpty());

        dynArray.set(2, 66);
        System.out.println(dynArray.toString());
        System.out.println();

        dynArray.remove(34);
        System.out.println(dynArray.toString());
        System.out.println();

        dynArray.removeAll(5, 7, 66);
        System.out.println(dynArray.toString());

        dynArray.replaceAll(55, 33);
        System.out.println(dynArray.toString());

        System.out.println(dynArray.clone().toString());


        dynArray.trimToSize();
        System.out.println(dynArray.toString());

        dynArray.subList(1, 4);
        System.out.println();

        dynArray.removeRange(1, 5);
        System.out.println(dynArray.toString());
        dynArray.clear();
        System.out.println(dynArray.toString());
    }
}
