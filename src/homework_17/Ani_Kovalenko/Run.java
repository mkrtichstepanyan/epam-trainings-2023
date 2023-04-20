package homework_17.Ani_Kovalenko;

public class Run {

    public static void main(String[] args) {

        GenericLinkedList<Integer> object = new GenericLinkedList<>();

        object.add(2);
        object.add(5);
        object.add(6);
        object.add(7);
        System.out.println("                      add(): " + object);
        object.add(1, 3);
        System.out.println("          add(index, value): " + object);
        object.add(0, 0);
        System.out.println("          add(index, value): " + object);
        Integer[] ints = {88, 88};
        Integer[] nulls = {null, null};
        object.addAll(ints);
        System.out.println("         addAll(T[] values): " + object);
//        object.addAll(nulls);
//        System.out.println("addAll(T[] values): " + object);
        object.addAll(7, ints);
        System.out.println("  addAll(index, T[] values): " + object);
        object.remove(0);
        System.out.println("              remove(index): " + object);
        object.remove(Integer.valueOf(0));
        System.out.println("     remove (Integer value): " + object);
        object.removeAll(ints);
        System.out.println("     removeAll (T[] values): " + object);
        System.out.println("                  isEmpty(): " + object.isEmpty());
        System.out.println("                     size(): " + object.size());
        System.out.println("                      get(): " + object.get(0));
        object.set(0, 2);
        System.out.println("        set(index, T value): " + object);
        System.out.println("           indexOf(T value): " + object.indexOf(2));
        //non existing element
        System.out.println("           indexOf(T value): " + object.indexOf(99));
        System.out.println("       lastIndexOf(T value): " + object.lastIndexOf(2));
        System.out.println("          contains(T value): " + object.contains(2));
        //non existing element
        System.out.println("          contains(T value): " + object.contains(222));
        Integer[] ints2 = {2, 6, 5};
        Integer[] ints3 = {2, 6, 555};
        System.out.println("       containsAll(T value): " + object.containsAll(ints2));
        //when just one element does not match
        System.out.println("       containsAll(T value): " + object.containsAll(ints3));
        System.out.println("                 iterator(): " + object.iterator());
        Object[] toArray = object.toArray();
        System.out.print("                  toArray(): ");
        for (Object o : toArray) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("subList(fromIndex, toIndex): " + object.subList(2, 4));
        object.clear();
        System.out.println("                    clear(): " + object);


    }
}
