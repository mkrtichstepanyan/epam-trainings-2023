package homework_17.Alina_Mkhoyan;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericLinkedList<T> implements Cloneable {

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) Arrays.copyOf(toArray(), size, a.getClass());
        } else {
            System.arraycopy(toArray(), 0, a, 0, size);
            if (a.length > size) {
                a[size] = null;
            }
        }
        return a;
    }

    public boolean add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data.equals(o)) {
                if (prev != null) {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                } else {
                    head = current.next;
                    if (head == null) {
                        tail = null;
                    }
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public int compareTo(GenericLinkedList<T> o) {
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GenericLinkedList<T> clone = (GenericLinkedList<T>) super.clone();
        clone.head = null;
        clone.tail = null;
        clone.size = 0;

        Node current = head;
        while (current != null) {
            clone.add(current.data);
            current = current.next;
        }

        return clone;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}


