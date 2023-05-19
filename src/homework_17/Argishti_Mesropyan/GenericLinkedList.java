package homework_17.Argishti_Mesropyan;

import java.util.*;

//import java.util.*;
public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;


    GenericLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int size() {
        return size;
    }


    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.item.equals(element)) {
                System.out.println("Contains " + element);
                return true;
            }
            current = current.next;
        }
        System.out.println("The List doesn't contain " + element);
        return false;
    }

    public boolean containsAll(T... elements) {
        for (T element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        int count = 0;
        for (Node<T> element = head; element != null && element.next != null; element = element.next) {
            result[count++] = element.item;
        }
        for (T value : result) {
            System.out.println(value);
        }
        return result;
    }

    public void add(T element) {
        Node<T> newNode = new Node<T>(element);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<T> node = head;
        while (node != null) {
            stringBuilder.append(node.item);
            node = node.next;
            if (node != null) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


    public T[] addAll(T... items) {
        for (T item : items) {
            add((T) item);
        }
        size++;
        return items;
    }


    public T  get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Element is not defined");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    public T set(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T oldValue = current.item;
        current.item = (T) element;
        return oldValue;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        T removedNode = null;
        if (index == 0) {
            removedNode = current.item;
            head = current.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = (T) current.next.item;
            current.next = current.next.next;
        }
        size--;
        if (index == size && current.next != null) {
            throw new NullPointerException();
        }
        return removedNode;
    }

    public int indexOf(Object o) {
        if (head == null) {
            return -1;
        }
        Node<T> current = head;
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

    public int lastIndexOf(T o) {
        return indexOf(o);
    }

    public GenericLinkedList<T> subList(int fromIndex, int toIndex) {
        if (head == null) {
            return null;
        }
        if (fromIndex < 0 || fromIndex > size || toIndex < 0 || toIndex > size) {
            throw new IndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        GenericLinkedList<T> subList = new GenericLinkedList<>();
        Node<T> current = head;
        for (int i = 0; i < fromIndex; i++) {
            current = current.next;
        }
        for (int i = 0; i < toIndex; i++) {
            subList.add(current.item);
            current = current.next;
        }
        return subList;
    }

    public boolean remove(Object o) {
        if (o == null || head == null) {
            return false;
        }
        if (Objects.equals(head.item, o)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head.next;
        Node<T> previous = head;
        while (current != null) {
            if (Objects.equals(current.item, o)) {
                previous.next = current.next;
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public boolean removeAll(T... items) {
        if (head == null || items.length == 0) {
            return false;
        }
        Set<T> itemSet = new HashSet<>(Arrays.asList(items));
        boolean modified = false;
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            if (itemSet.contains(current.item)) {
                if (current == head) {
                    head = head.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                modified = true;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return modified;
    }

    public Iterator iterator() {
        Node<T> current = head;
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                if (current != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public void clear() {
        for (Node<T> element = head; element != null; ) {
            element.item = null;
            element.next = null;
            element = element.next;

        }
        size = 0;

    }
}