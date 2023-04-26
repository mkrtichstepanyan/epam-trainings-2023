package homework_17.Vladimir_Vanyan;

public class Main {
    public static void main(String[] args) {
        GenericLinkedList<String> list = new GenericLinkedList<>();
        System.out.println(list.isEmpty());
        list.add("Valera");
        list.add("Davit");
        list.add("Aghas");
        list.contains("Davit");
        String[] names={"Armen","Karen","Sipan"};
        list.addAll(names);
        list.print();
        list.containsAll(names);
        list.isEmpty();
        System.out.println("Element of index 1 is"+list.get(1));
        list.removeAll(names);

        list.print();
        System.out.println(list.indexOf("Valera"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.subList(0,3);
        list.toArray();
        list.add(2,"Armen");
        list.remove(2);
        list.clear();
    }
}
