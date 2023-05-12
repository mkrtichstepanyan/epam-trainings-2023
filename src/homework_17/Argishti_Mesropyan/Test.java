package homework_17.Argishti_Mesropyan;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        list.add(44);
        list.add(2);
        list.add(6);

        System.out.println(list);

        System.out.println(list);

        list.addAll(3, 2, 4, 123);
        System.out.println(list);

        System.out.println("the index of " + list.indexOf(123) + " value is : " + list.get(6));

        System.out.println(list.size());

        System.out.println("is Array Empty: " + list.isEmpty());

        list.set(2, 88);
        System.out.println("Set: " + list);

        System.out.println("contains: " + list.contains(88));

        System.out.println("Contains All: " + list.containsAll(88, 2, 6, 3));
        System.out.println(list);

        System.out.println(list.lastIndexOf(44));

        list.clear();
        System.out.println(list);


    }
}
