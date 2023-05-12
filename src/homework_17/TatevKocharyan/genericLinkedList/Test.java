package homework_17.TatevKocharyan.genericLinkedList;

import homework_17.TatevKocharyan.genericLinkedList.GenericLinkedList;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<String> linkedList = new GenericLinkedList<>();
        String s = "barev";
        String s1 = "Hello";
        String s2 = "Hi";
        String s3 = "He";
        String s4 = "ok";
        String s5 = "ooooooo";
        String s6 = "yes";
        String s7 = "Nooooooo";
        linkedList.addNode(s);
        linkedList.addNode(s1);
        linkedList.addNode(s2);
        linkedList.addNode(s3);
        linkedList.addNode(s4);
        linkedList.addNode(s5);
        linkedList.addNode(s6);
        linkedList.addNode(s7);
       /* System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.tail.next);
        System.out.println(linkedList.toString());
        System.out.println("------------");

        System.out.println(linkedList.get(3));
        // linkedList.clear();
        System.out.println(linkedList);
        String a = "How are you,How are you, How are youHow are you";
        String b = "five";
        System.out.println("method set");
        linkedList.set(3, a);
        System.out.println(linkedList.toString());
        System.out.println("method contains");
        System.out.println(linkedList.contains(s7));
        System.out.println("method remove by data");

        linkedList.removeNode(s5);
        System.out.println(linkedList);
        System.out.println("method remove by index");
        String remove = linkedList.remove(2);
        System.out.println(linkedList);

        int index = linkedList.indexOf(s2);
        System.out.println(index);
        int index1 = linkedList.lastIndexOf(s7);
        System.out.println(index1);
        List list = linkedList.subList(3, 8);
        System.out.println(list);
        String[] array = {s2, s3, s7};
        System.out.println("size= " + linkedList.size());
        linkedList.removeAll(array);
        System.out.println(linkedList);
        System.out.println("size= " + linkedList.size());
        boolean b = linkedList.containsAll(array);
        System.out.println("contains "+b);
        Object[] objects = linkedList.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
*/
        System.out.println(linkedList.toString());

    }
}
