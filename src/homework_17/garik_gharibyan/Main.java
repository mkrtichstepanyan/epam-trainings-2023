package homework_17.garik_gharibyan;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();
        genericLinkedList.add(10);
        genericLinkedList.add(11);
        genericLinkedList.add(12);
        genericLinkedList.add(13);
        genericLinkedList.add(14);
        genericLinkedList.add(14);
        genericLinkedList.add(13);
        System.out.println("First list:  " + genericLinkedList);
        System.out.println("1.size(): " + genericLinkedList.size() + "  " + genericLinkedList);
        System.out.println("2.get(5): " + genericLinkedList.get(5) + "  " + genericLinkedList);
        System.out.println("3.isEmpty(): " + genericLinkedList.isEmpty() + "  " + genericLinkedList);
        System.out.println("4.indexOf(2): " + genericLinkedList.indexOf(2) + "  " + genericLinkedList);
        System.out.println("5.contains(15): " + genericLinkedList.contains(15) + "  " + genericLinkedList);
        System.out.println("6.toArray(): " + arrayToString(genericLinkedList.toArray()) + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        System.out.println("7.remove(13): " + genericLinkedList.remove(Integer.valueOf(13)) + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        Integer[] integers = {1, 4, 7};
        System.out.println("8.addAll(new Integer[]): " + genericLinkedList.addAll(integers) + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        System.out.println("9.addAll(index = 0,new Integer[]): " + genericLinkedList.addAll(0, integers) + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        System.out.println("10.set(index = 0,100): " + genericLinkedList.set(0, 100) + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        genericLinkedList.addFirst(111);
        System.out.println("11.addFirst(111): " + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        genericLinkedList.add(5, 222);
        System.out.println("12.add(index = 5,222): " + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        System.out.println("13.remove(index = 5): " + "  " + genericLinkedList.remove(5) + genericLinkedList + " Size: " + genericLinkedList.size());
        System.out.println("14.lastIndexOf(4): " + "  " + genericLinkedList.lastIndexOf(4) + genericLinkedList + " Size: " + genericLinkedList.size());
        genericLinkedList = genericLinkedList.subList(2, 13);
        System.out.println("15.subList(2,13): " + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        genericLinkedList.removeAll(integers);
        System.out.println("17.removeAll(int[]): " + "  " + genericLinkedList + " Size: " + genericLinkedList.size());
        Integer[] integers1 = {11, 14, 7};
        System.out.println("18.containsAll(int[]): " + "  " + genericLinkedList.containsAll(integers1));
        System.out.println("19.clone(): " + "  " + genericLinkedList.clone() + " Size: " + genericLinkedList.size());
        System.out.println("20.iterator(): " + "  " + testIterator(genericLinkedList) + " Size: " + genericLinkedList.size());
        System.out.println("21.compareTo(): " + "  " + genericLinkedList.getFirst().compareTo(genericLinkedList.getFirst().next()));
        genericLinkedList.clear();
        System.out.println("22.clear(): " + genericLinkedList + " Size: " + genericLinkedList.size());

    }

    private static String arrayToString(Object[] objects) {
        StringBuilder stringBuilder = new StringBuilder("[");

        for (int i = 0; i < objects.length; i++) {
            stringBuilder.append(objects[i]);
            if (i != objects.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    private static <T extends Comparable<T>> String testIterator(GenericLinkedList<T> genericLinkedList){
        Iterator<T> iterator = genericLinkedList.iterator();
        StringBuilder stringBuilder = new StringBuilder("[");
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next());
            if (iterator.hasNext()){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
