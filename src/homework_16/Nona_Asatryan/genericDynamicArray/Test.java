package homework_16.Nona_Asatryan.genericDynamicArray;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {55, 34, 4, 5};
        GenericDynamicArray<Integer> dynArray = new GenericDynamicArray<Integer>(array.length);
        dynArray.addAll(array);
        System.out.println(dynArray.toString());

        dynArray.sort();
        System.out.println(dynArray.toString());

        dynArray.add(9);
        dynArray.add(7);
        System.out.println(dynArray.toString());
//
//        dynArray.remove(4);
//        System.out.println(dynArray.toString());
//        System.out.println();
//
//        dynArray.removeAll(5, 34);
//        System.out.println(dynArray.toString());

//        dynArray.addByIndex(1, 22);
//        System.out.println(dynArray.toString());

//        dynArray.addAllByIndex(2, 7, 8, 11);
//        System.out.println(dynArray.toString());

//        System.out.println(dynArray.contains(4));
//        System.out.println(dynArray.containsAll(array));
//        System.out.println(dynArray.indexOf(22));
//        System.out.println(dynArray.isEmpty());

//        dynArray.set(2, 66);
//        System.out.println(dynArray.toString());
//        System.out.println();

//        dynArray.replaceAll(55, 33);
//        System.out.println(dynArray.toString());
//
        System.out.println(dynArray.deepClone().toString());

//        dynArray.trimToSize();
//        System.out.println(dynArray.toString());
//
//        dynArray.subList(1, 4);
//        System.out.println();
//
//        dynArray.removeRange(1, 3);
//        System.out.println(dynArray.toString());
//        dynArray.clear();
//        System.out.println(dynArray.toString());
    }
}
