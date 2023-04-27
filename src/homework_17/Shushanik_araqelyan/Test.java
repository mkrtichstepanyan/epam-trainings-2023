package homework_17.Shushanik_araqelyan;



import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer>GL = new homework_17.Shushanik_araqelyan.GenericLinkedList<>();
        //add methods call
        for (int i = 0; i < 5; i++) {
            GL.add(i);
        }
        System.out.println(GL);
        GL.add(3, 15);
        System.out.println(GL);

        //isEmpty method call
        GL.isEmpty();

        //contains method call
        GL.contains(15);
        GL.contains(5);



        //remove method call
        System.out.println(GL);
        GL.remove(3);
        System.out.println(GL);

        //indexOf method call
        GL.indexOf(4);
        GL.indexOf(13);

        //addAll Methods call
        System.out.println(GL);
        GenericLinkedList<Integer> newList = new GenericLinkedList<>();
        newList.add(25);
        newList.add(28);
        newList.add(23);

        GL.addAll(newList);
        System.out.println(GL);

        GL.addAll(1, newList);
        System.out.println(GL);


        //retainAll method call
        System.out.println(GL);
        GL.retainAll(newList);
        System.out.println(GL);


        //removeAll method call
        GenericLinkedList<Integer> removed = new GenericLinkedList<>();
        removed.add(1);
        removed.add(23);
        System.out.println(GL);
        GL.removeAll(removed);
        System.out.println(GL);

        //containsAll method call
        GenericLinkedList<Integer> contains = new GenericLinkedList<>();
        contains.add(2);
        contains.add(3);
        contains.add(10);
        GL.containsAll(contains);

    }
}

