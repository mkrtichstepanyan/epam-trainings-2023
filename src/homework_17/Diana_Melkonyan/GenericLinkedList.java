package homework_17.Diana_Melkonyan;


import java.util.*;

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
        int count = 0;
        Node ref = head;
        while (ref != null) {
            count++;
            ref = ref.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public boolean contains(T o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        } else
            return true;
    }

    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {
        Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T item = current.data;
                current = current.next;
                return item;
            }
            return null;
        }
    }

    public Object[] toArray() {
        Object[] objects = new Object[size()];
        int i = 0;
        for (Node<T> item = head; item != null; item = item.next) {
            objects[i++] = item.data;
        }

        return objects;
    }


    public boolean add(Object o) {
        Node newNode = new Node(o);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }


        return true;
    }


    public void add(int index, T value) {
        if (index == 1) {
            addFirst(value);
            // add(value);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < index - 1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    private void addFirst(T value) {
        if (isEmpty()) {
            head = new Node(value);
            tail = head;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public boolean addAll(Collection c) {
        boolean add = false;
        for (Object o : c) {
            if (add((T) o)) ;
            add = true;
        }
        return true;
    }


    public Object remove(int index) {
        if (head == null) {
            return false;
        }
        else if (index == 1) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            Node temp = null;
            temp = current.next;
            current.next = temp.next;

        }
        return false;
    }

    public boolean remove(T o) {
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            T e = iterator.next();

            if (o == null ? o == null : o.equals(e)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }


    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
            return (T) head;
        Node<T> result = head;
        for (int i = 1; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

    public T set(int index, T e) throws IndexOutOfBoundsException {
        Node<T> current = head;
        Node<T> setNode = new Node<T>(e);
        if (index == 0 || index == size) {
            this.addFirst(e);
        } else {
            for (int j = 1; current != null && j < (index - 1); j++) {
                current = current.next;
            }
            Node<T> temp = current.next;
            current.next = setNode;
            setNode.next = temp;
        }
        return setNode.data;
    }

    public int indexOf(T item) {
        Node temp = head;
        int index = 1;
        while (item != temp.data) {
            temp = temp.next;
            index++;
            if (temp == null) {
                return -1;
            }
        }
        return index;
    }

    public int lastIndexOf(T item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == item) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public int compareTo(T o) {
        Node<T> node;
        for (node = head; node != null; node = node.next) {
            if ((Integer) node.data < (Integer) o) {
                return -1;
            } else {
                if ((Integer) node.data < (Integer) o)
                    return -1;
            }
        }
        return 0;
    }


    public List subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        List<T> result = new LinkedList<T>();
        Node<T> temp = this.head;
        int count = 0;
        while (temp != null) {
            if (count >= fromIndex && count < toIndex) {
                result.add(temp.data);
            }

            temp = temp.next;
            count++;
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

    public void print() {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.data + " ");
            ref = ref.next;
        }
        System.out.println();
    }


    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public String toString() {
        return Arrays.toString(this.toArray());
    }


}

