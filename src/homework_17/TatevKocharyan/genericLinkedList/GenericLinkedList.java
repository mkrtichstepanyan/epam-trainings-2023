package homework_17.TatevKocharyan.genericLinkedList;

import java.util.*;

public class GenericLinkedList<T> implements List<T>, Cloneable {

    Node<T> head;
    Node<T> tail;
    private static int size = 0;

    public GenericLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        if (size != 0) {
            return false;
        } else return true;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
            if (temp.data == o) {
                return true;
            }
        }
        if (tail.data == o) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        //not implement
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
            array[i] = temp.data;
        }


        return array;
    }

    public void addNode(T o) {
        Node<T> addedNode = new Node<T>();
        addedNode.setData(o);
        if (size == 0) {
            head = addedNode;
            head.data = addedNode.data;
            head.setIndex(0);
        } else if (size == 1) {
            head.next = addedNode;
            head.next.data = addedNode.data;
            tail = addedNode;
            head.next.setIndex(1);
        } else {
            tail.next = addedNode;
            tail = addedNode;
            tail.setIndex(size);

        }

        size++;
    }


    public void removeNode(Object o) {
        Node<T> temp = head;
        Node<T> temp1 = head;
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
            if (temp.data == o) {
                index = temp.getIndex();
                for (int j = 0; j < index; j++) {
                    temp1 = temp1.next;
                    if (temp1.getIndex() == index - 1) {
                        temp1.setNext(temp.next);
                    }
                }
            }
        }
        reorderingIndexes();

    }

    private void reorderingIndexes() {
        Node<T> temp = head;
        for (int i = 1; i <= size; i++) {
            temp = temp.next;
            if (temp != null) {
                temp.setIndex(i);
            } else {
                return;
            }
        }
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public T get(int index) {

        if (index > size || index < 0) {
            System.out.println("Index is out of bounds");
        }
        if (index == head.getIndex()) {
            return head.data;
        } else {
            Node<T> temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            return temp.next.data;
        }

    }


    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index > size) {
            System.out.println("index is out of bounds");
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        temp.setData((T) element);

        return temp.data;
    }

    @Override
    public void add(int index, Object element) {
        if (index > size || index < 0) {
            System.out.println("Index is out of bounds");
        } else {
            Node<T> toAdd = new Node<>();
            toAdd.setData((T) element);
            Node<T> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            toAdd.setNext(temp.getNext());
            temp.setNext(toAdd);
            toAdd.setIndex(temp.getIndex());
            for (int i = index + 1; i <= size; i++) {
                temp = temp.next;
                temp.setIndex(i);
            }
        }
    }

    @Override
    public T remove(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
            if (temp.getIndex() == index - 1) {
                temp.setNext(temp.next.getNext());
            }
        }
        reorderingIndexes();

        return temp.data;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> temp = head;
        int index = 0;
        int size1 = size - index;
        for (int i = 0; i < size1; i++) {
            temp = temp.next;
            if (temp.data == o) {
                index = temp.getIndex();
                size1 = size - index - 1;
            }
        }

        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<T> temp = head;
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
            if (temp.data == o) {
                index = temp.getIndex();
            }
        }
        if (tail.data == o) {
            index = tail.getIndex();
        }
        return index;
    }


    @Override
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > size) {
            System.out.println("index out of bounds");
        }
        if (toIndex > size || toIndex < 0) {
            System.out.println("index out of bounds");
        }
        Node<T> temp = head;

        for (int j = temp.getIndex(); j < toIndex; j++) {
            temp = temp.next;
            if (temp != null) {
                if (temp.index == fromIndex) {
                    head = temp;
                    head.data = temp.data;
                    head.setIndex(0);
                    if (temp.getIndex() == toIndex) {
                        temp = tail;
                    }
                }
            }
        }
        reorderingIndexes();
        return this;
    }

    public void removeAll(T[] c) {
        int index = 0;
        int previous = 0;
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
            for (int j = 0; j < c.length - 1; j++) {
                if (temp.data.equals(c[j])) {
                    index = temp.getIndex();
                    previous = index - 1;
                }
                Node<T> temp2 = head;
                for (int k = 0; k <= previous; k++) {
                    temp2 = temp2.next;
                    if (temp2.getIndex() == previous) {
                        temp2.setNext(temp.getNext());
                        size--;
                    }
                }

            }

        }
        reorderingIndexes();
        temp = head;
        if (tail.data.equals(c[c.length - 1])) {
            for (int j = 0; j < size - 1; j++) {
                temp = temp.next;
                if (temp.index == size - 1) {
                   removeNode(tail);
                }

            }
        }

        reorderingIndexes();
    }


    public boolean containsAll(T[] c) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (contains(c[i])) {
                count++;
            }
            if (count == c.length) {
                return true;
            }
        }

        return false;

    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(head.index);
        builder.append(" ");
        builder.append(head.data);
        builder.append(" | ");
        Node<T>temp=head;
        for (int i = 0; i < size-1; i++) {
            temp=temp.next;
            builder.append(temp.index);
            builder.append(" ");
            builder.append(temp.data);
            builder.append(" | ");
        }

        return builder.toString();
    }

    @Override
    public GenericLinkedList<T> clone() {
        try {
            GenericLinkedList clone = (GenericLinkedList) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }
    //changed parameters

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
    //changed parameters


    @Override
    public ListIterator listIterator() {
        // not implement
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // not implement
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    public boolean remove(Object o) {
        //changed return type and name of the method
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    @Override
    public boolean add(T t) {

        //I have changed return type and name of the method(addNode())
        return false;
    }
}
