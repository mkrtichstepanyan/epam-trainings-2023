package homework_17.Shushanik_araqelyan;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public  class Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer>GL = new GenericLinkedList<>() {
            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
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
        GenericLinkedList<Integer> newList = new GenericLinkedList<>() {
            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
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
        GenericLinkedList<Integer> removed = new GenericLinkedList<>() {
            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        removed.add(1);
        removed.add(23);
        System.out.println(GL);
        GL.removeAll(removed);
        System.out.println(GL);

        //containsAll method call
        GenericLinkedList<Integer> contains = new GenericLinkedList<>() {
            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        contains.add(2);
        contains.add(3);
        contains.add(10);
        GL.containsAll(contains);

    }
}

