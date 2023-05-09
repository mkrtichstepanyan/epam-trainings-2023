package homework_17.rafik_pahlevanyan.linked_list;

import java.util.Arrays;

public class
Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer> gl = new GenericLinkedList<>();
        //add methods call
        for (int i = 0; i < 5; i++) {
            gl.add(i);
        }
        System.out.println(gl);
        gl.add(3, 15);
        System.out.println(gl);

        //isEmpty method call
        gl.isEmpty();

        //contains method call
        gl.contains(15);
        gl.contains(5);


        //toArray method call
        Object[] arr = gl.toArray();
        System.out.println(Arrays.toString(arr));

        //toArray method call with T[] parameter
        GenericLinkedList<String> list = new GenericLinkedList<>();
        list.add("foo");
        list.add("bar");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println(Arrays.toString(array));

        //remove method call
        System.out.println(gl);
        gl.remove(3);
        System.out.println(gl);

        //indexOf method call
        gl.indexOf(4);
        gl.indexOf(13);

        //addAll Methods call
        System.out.println(gl);
        GenericLinkedList<Integer> newList = new GenericLinkedList<>();
        newList.add(25);
        newList.add(28);
        newList.add(23);

        gl.addAll(newList);
        System.out.println(gl);

        gl.addAll(1, newList);
        System.out.println(gl);


        //retainAll method call
        System.out.println(gl);
        gl.retainAll(newList);
        System.out.println(gl);

        //clear method call
        gl.clear();

        //get method call
        gl.add(1);
        gl.add(2);
        gl.add(3);
        gl.add(4);
        gl.add(5);
        gl.get(3);
        gl.get(10);

        //set method call
        gl.set(3, 23);
        System.out.println(gl);

        //lastIndexOf method call
        gl.add(1);
        System.out.println(gl);
        gl.lastIndexOf(1);

        //subList method call
        System.out.println(gl);
        gl.subList(3, 5);

        //removeAll method call
        GenericLinkedList<Integer> removed = new GenericLinkedList<>();
        removed.add(1);
        removed.add(23);
        System.out.println(gl);
        gl.removeAll(removed);
        System.out.println(gl);

        //containsAll method call
        GenericLinkedList<Integer> contains = new GenericLinkedList<>();
        contains.add(2);
        contains.add(3);
        contains.add(10);
        gl.containsAll(contains);

    }
}
