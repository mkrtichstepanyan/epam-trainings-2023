package homework_16.Radik_Manasyan.generic_dynamic_array;


import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        GenericDynamicArray<String> gDA = new GenericDynamicArray<>(5);
        gDA.add("Hello");
        gDA.add("Java");
        System.out.println(gDA.get(0));
        System.out.println("gDA.getSize() ---> " +gDA.getSize());
        System.out.println("Generic dynamic array is empty? " + gDA.isEmpty());
        gDA.addByIndex(1, "abb by index");

        String[] s = {"one", "two"};
        gDA.addAllByIndex(3, s);

        String[] s1 = {"Generic", "Array"};
        gDA.addAll(s1);

        System.out.println("gDA.contains('one') " + gDA.contains("one"));
        System.out.println("gDA.containsAll(s) " + gDA.containsAll(s));

        System.out.println("gDA.indexOf('two') " + gDA.indexOf("two"));
        gDA.remove("Array");
        gDA.removeAll(s);
        System.out.println("gDA.isEmpty() " + gDA.isEmpty());

        Object[] x = gDA.subList(2);
        for (Object o : x) {
            System.out.print(o + " ");
        }
        System.out.println();

        Object[] objects = gDA.subList(1, 3);
        for (Object object : objects) {
            System.out.print(object + " ");
        }
        System.out.println();
        gDA.add("Blabla");
        gDA.print();

        gDA.set(1, "setIndex");
        gDA.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o1.compareTo(o2);
            }
        });
        gDA.print();

        gDA.trimToSize();
        gDA.removeRange(2);
        gDA.add("Blabla");
        gDA.replaceAll("Blabla", "replace");



        gDA.print();

    }
}
