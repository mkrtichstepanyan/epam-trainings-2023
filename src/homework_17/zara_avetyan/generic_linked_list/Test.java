package homework_17.zara_avetyan.generic_linked_list;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<String> list = new GenericLinkedList<>();
        Node<String> node = new Node<>("54");
        System.out.println("add");
        list.add("54");
        list.add("14");
        list.add("85");
        list.display();
        System.out.println("-------------------------");

        System.out.println("isEmpty");
        System.out.println(list.isEmpty());
        System.out.println("-------------------------");

        System.out.println("contains");
        System.out.println(list.contains("54"));
        System.out.println("-------------------------");

        System.out.println("toArray");
        for (Object i : list.toArray()) {
            System.out.println(i);
        }
        System.out.println("-------------------------");

        System.out.println("add index");
        list.add(0, "Zara");
        list.display();
        System.out.println("-------------------------");

        System.out.println("remove index");
        list.remove(0);
        list.display();
        System.out.println("-------------------------");

        System.out.println("get index");
        System.out.println(list.get(1).getData());
        System.out.println("-------------------------");

        System.out.println("set");
        list.set(1, "41");
        list.display();
        System.out.println("-------------------------");

        System.out.println("add index");
        list.add(1, "31");
        list.display();
        System.out.println("-------------------------");

        System.out.println("indexOf");
        System.out.println(list.indexOf(list.get(1)));
        System.out.println("-------------------------");

        System.out.println("lastIndexOf");
        System.out.println(list.lastIndexOf(list.get(1)));
        System.out.println("-------------------------");

        System.out.println("subList");
        list.subList(1, 3).display();
        System.out.println("-------------------------");


        System.out.println("containsAll");
        System.out.println(list.containsAll(list.subList(1, 3)));
        System.out.println("-------------------------");


        System.out.println("addAll index");
        list.addAll(1, list.subList(1, 3));
        list.display();
        System.out.println("-------------------------");

        System.out.println("addAll");
        list.addAll(list.subList(1, 3));
        list.display();
        System.out.println("-------------------------");


        System.out.println("removeAll");
        list.removeAll(list.subList(1, 3));
        list.display();
        System.out.println("-------------------------");

        System.out.println("remove 54");
        list.remove("54");
        list.display();
        System.out.println("-------------------------");

        System.out.println("clear + isEmpty");
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("-------------------------");
    }
}
