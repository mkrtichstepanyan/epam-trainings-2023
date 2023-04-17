package homework_17.yeghia_ansuryan;

public class Test {
    public static void main(String[] args) {

        GenericLinkedList<Number> linkedListObject = new GenericLinkedList<>();

        linkedListObject.add(1.1);
        linkedListObject.add(2);
        linkedListObject.add(3.3);
        linkedListObject.add(5);

        System.out.println("add(): " + linkedListObject);
        linkedListObject.add(2, 4);
        System.out.println("add(index, element): " + linkedListObject);
        linkedListObject.add(0, 1);
        System.out.println("add(index, element): " + linkedListObject);
        Integer[] ints = {42, 12};
        Integer[] nulls = {null, null};
        linkedListObject.addAll(ints);
        System.out.println("addAl(T[] element): " + linkedListObject);
//        linkedListObject.addAll(nulls);
//        System.out.println("addAll(T[] elements): "+ linkedListObject);
        linkedListObject.addAll(7, ints);
        System.out.println("addAll(index, T[] elements): " + linkedListObject);
        linkedListObject.remove(0);
        System.out.println("remove(index): " + linkedListObject);
        linkedListObject.remove(Integer.valueOf(0));
        System.out.println("remove(Integer element): " + linkedListObject);
        linkedListObject.removeAll(ints);
        System.out.println("removeAll(T[] elements): " + linkedListObject);
        System.out.println("isEmpty(): " + linkedListObject.isEmpty());
        System.out.println("size(): " + linkedListObject.size());
        System.out.println("get(): " + linkedListObject.get(0));
        linkedListObject.set(0, 2);
        System.out.println("set(index, T element): " + linkedListObject);
        System.out.println("indexOf(T, element): " + linkedListObject.indexOf(2));
        System.out.println("indexOf(T element): " + linkedListObject.indexOf(99));
        System.out.println("lastIndexOf(T element): " + linkedListObject.lastIndexOf(4));
        System.out.println("contains(T element): " + linkedListObject.contains(2));
        System.out.println("contains(T element): " + linkedListObject.contains(222));
        Integer[] ints2 = {2, 6, 5};
        Integer[] ints3 = {2, 6, 55};
        System.out.println("containsAll(T element): " + linkedListObject.containsAll(ints2));
        System.out.println("containsAll(T element): " + linkedListObject.containsAll(ints3));
        System.out.println("iterator(): " + linkedListObject.iterator());
        Object[] toArray = linkedListObject.toArray();
        System.out.println("toArray(): ");
        for (Object o : toArray) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("subList(fromIndex, toIndex): " + linkedListObject.subList(1, 3));
        linkedListObject.clear();
        System.out.println("clear(): " + linkedListObject);
    }
}
