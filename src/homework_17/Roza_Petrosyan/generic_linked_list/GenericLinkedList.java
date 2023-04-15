package homework_17.Roza_Petrosyan.generic_linked_list;

import java.util.*;

public class GenericLinkedList<T> implements Cloneable {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node.next != null;
            }

            @Override
            public T next() {
                T item = node.item;
                if (hasNext()) {
                    node = node.next;
                }
                return item;
            }
        };
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        Node<T> element = head;
        for (int i = 0; i < size; i++) {
            if (element.next != null) {
                result[i] = get(i);
            }
        }
        return result;
    }

    public void add(T element) {
        final Node<T> prev = tail;
        final Node<T> newNode = new Node<>(prev, element, null);
        tail = newNode;
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
    }

    public boolean remove(T value) {
        if (value == null) {
            for (Node<T> x = head; x != null; x = x.next) {
                if (x.item == null) {
                    unlinkElement(x);
                    return true;
                }
            }
        } else {
            for (Node<T> x = head; x != null; x = x.next) {
                if (value.equals(x.item)) {
                    unlinkElement(x);
                    return true;
                }
            }
        }
        return false;
    }

    public void addAll(GenericLinkedList<T> linkedList) {
        for (int i = 0; i < linkedList.size; i++) {
            add(linkedList.get(i));
        }
    }

    public boolean addAll(int index, GenericLinkedList<T> linkedList) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        int numNew = linkedList.size;
        if (numNew == 0) {
            return false;
        }
        Node<T> prevEl, nextEl;
        if (index == size) {
            nextEl = null;
            prevEl = tail;
        } else {
            nextEl = node(index);
            prevEl = nextEl.prev;
        }

        for (int i = 0; i < linkedList.size; i++) {
            Node<T> newNode = new Node<>(prevEl, linkedList.get(i), null);
            if (prevEl == null) {
                head = newNode;
            } else {
                prevEl.next = newNode;
            }
            prevEl = newNode;
        }

        if (nextEl == null) {
            tail = prevEl;
        } else {
            prevEl.next = nextEl;
            nextEl.prev = prevEl;
        }

        size += numNew;
        return true;
    }

    public void clear() {
        for (Node<T> x = head; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        head = tail = null;
        size = 0;
    }

    public T get(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) node(index).item;
    }

    public T set(int index, T element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        T oldValue = null;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                oldValue = node(i).item;
                node(i).item = element;
            }
        }
        return oldValue;
    }

    public void add(int index, T element) {
        GenericLinkedList<T> genList = new GenericLinkedList<>();
        genList.add(element);
        addAll(index, genList);
    }

    public T remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return unlinkElement(node(index));
    }

    public int indexOf(T value) {
        int index = 0;
        if (value == null) {
            for (Node<T> x = head; x != null; x = x.next) {
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<T> x = head; x != null; x = x.next) {
                if (value.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        int index = size;
        if (value == null) {
            for (Node<T> x = tail; x != null; x = x.prev) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<T> x = tail; x != null; x = x.prev) {
                index--;
                if (value.equals(x.item))
                    return index;
            }
        }
        return -1;
    }


    public GenericLinkedList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        GenericLinkedList<T> newGeneric = new GenericLinkedList<>();
        for (int i = 0; i < size; i++) {
            if (i >= fromIndex && i < toIndex) {
                newGeneric.add(node(i).item);
            }
        }
        return newGeneric;
    }


    public boolean removeAll(GenericLinkedList<T> linkedList) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (linkedList.contains(node(i).item)) {
                remove(i);
                result = true;
                if (i < size) {
                    i--;
                }
            }
        }
        return result;
    }

    public boolean containsAll(GenericLinkedList<T> linkedList) {
        for (int i = 0; i < linkedList.size; i++) {
            if (!contains(linkedList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (node(i).next == null) {
                sb.append(get(i));
            } else {
                sb.append(get(i)).append(", ");
            }
        }
        return sb.append("]").toString();
    }

    @Override
    public GenericLinkedList<T> clone() throws CloneNotSupportedException {
        GenericLinkedList<T> clone = superClone();
        clone.head = clone.tail = null;
        clone.size = 0;
        for (Node<T> x = head; x != null; x = x.next) {
            clone.add((T) x.item);
        }
        return clone;
    }

    private GenericLinkedList<T> superClone() {
        try {
            return (GenericLinkedList<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    private Node<T> node(int index) {
        Node<T> element;
        if (index < (size >> 1)) {
            element = head;
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
        } else {
            element = tail;
            for (int i = size - 1; i > index; i--) {
                element = element.prev;
            }
        }
        return element;
    }

    private T unlinkElement(Node<T> value) {
        final T element = value.item;
        final Node<T> next = value.next;
        final Node<T> prev = value.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            value.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            value.next = null;
        }

        value.item = null;
        size--;
        return element;
    }
}
