package homework_17.gohar_hakobyan;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericLinkedList<E> implements Cloneable {

    private Node<E> next;
    private Node<E> head;
    private int size;


    public GenericLinkedList() {
        this.head = null;
        this.size = 0;
    }


    public GenericLinkedList(Node next, Node head) {
        this.next = next;
        this.head = head;
    }


    public int size() {
        return size;
    }


    private boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }


    public Iterator iterator() {
        return null;
    }


    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> elem = head; elem != null; elem = elem.next) {
            result[i++] = elem.item;
        }
        return result;
    }

    public void add(E elem) {
        Node<E> firstNode = new Node<>(elem);
        firstNode.next = null;
        if (head == null) {
            head = firstNode;
            return;
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = firstNode;
        size++;
    }


    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        Node<E> current = head;
        if (head.item.equals(o)) {
            head = head.next;
            size--;
            return true;
        }
        while (current.next != null) {
            if (current.next.item.equals(o)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public E[] addAll(E... items) {
        for (E item : items) {
            add((E) item);
        }
        size++;
        return items;
    }


    public boolean addAll(int index, E... items) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        for (Object o : items) {
            Node<E> node = new Node<>((E) o);
            node.next = current.next;
            current.next = node;
            size++;
        }
        return true;
    }


    public void clear() {
        for (Node<E> elem = head; elem != null; ) {
            elem.item = null;
            elem.next = null;
            elem = elem.next;
        }
        size = 0;
    }


    public Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }


    public Object set(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        E oldValue = current.item;
        current.item = (E) element;
        return oldValue;
    }


    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = new Node<>((E) element);
        Node<E> current = head;
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }


    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            Node<E> current = head;
            E removedNode = null;
            if (index == 0) {
                removedNode = current.item;
                head = current.next;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                    removedNode = current.next.item;
                    current.next = current.next.next;
                }
                if (current.next.next != null) {
                    throw new NullPointerException();
                }
                size--;
                return removedNode;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value is empty ");
        }
        return null;
    }


    public int indexOf(Object o) {
        if (head == null) {
            return -1;
        }
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.item.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        if (head == null) {
            return -1;
        }
        Node<E> current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.item.equals(0)) {
                lastIndex = index;
            }
            current = current.next;
        }

        return 0;
    }


    public GenericLinkedList<E> subList(int fromIndex, int toIndex) {
        if (head == null) {
            return null;
        }
        if (fromIndex < 0 || fromIndex > size || toIndex < 0 || toIndex > size) {
            throw new IndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        GenericLinkedList<E> subList = new GenericLinkedList<>();
        Node<E> current = head;
        for (int i = 0; i < fromIndex; i++) {
            current = current.next;
        }
        for (int i = 0; i < toIndex ; i++) {
            subList.add(current.item);
            current = current.next;
        }
        return subList;
    }


    public boolean removeAll(E... items) {
        if (head == null) {
            return false;
        }
        boolean modified = false;
        Node<E> previous = null;
        Node<E> current = head;
        while (current != null) {
            boolean found = false;
            for (E item : items) {
                if (item.equals(current.item)) {
                    if (current == head) {
                        head = head.next;
                    } else {
                        previous.next = current.next;
                        return false;
                    }
                    size--;
                    modified = true;
                } else {
                    if (current.item != null) {
                        previous = current;
                    }
                    current = current.next;
                }
            }
        }
        return modified;
    }


    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }


    public void print() {
        Node currentNode = head;
        System.out.print("LinkedList -> ");
        while (currentNode != null) {
            // Print  data at the current node
            System.out.print(currentNode.item + ", ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public Object clone() {
        GenericLinkedList<E> clone = superClone();

        clone.head = clone.next = null;
        clone.size = 0;

        for (Node<E> elem = head; elem != null; elem = elem.next)
            clone.add(elem.item);

        return clone;
    }

    private GenericLinkedList<E> superClone() {
        try {
            return (GenericLinkedList<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

        public Node(E item) {
            this.item = item;
        }
    }
}
