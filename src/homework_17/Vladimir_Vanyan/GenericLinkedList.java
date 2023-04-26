package homework_17.Vladimir_Vanyan;

import java.util.*;

public class GenericLinkedList<T> implements Cloneable {

    Node head;
    Node tail;
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T value) {
        if (value == null) {
            throw new NullPointerException("Given object is null");
        }
        Node<T> tempNode;
        tempNode = head;
        while (tempNode.next != null) {
            if (tempNode.data.equals(value)) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return tempNode.data.equals(value);

    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[size];
        int i = 0;
        Node<T> tempNode = head;
        while (tempNode != null) {
            arr[i] = tempNode.data;
            tempNode = tempNode.next;
            i++;
        }
        return arr;
    }

    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    public boolean add(Object data) {
        Node<T> node = new Node<>();
        node.data = (T) data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node<T> tempNode;
            tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = node;
        }
        size++;
        return false;
    }

    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        Node<T> tempNode = head;
        if (head.data.equals(o)) {
            head = head.next;
            size--;
            return true;
        }
        while (tempNode.next != null) {
            if (tempNode.next.data.equals(o)) {
                tempNode.next = tempNode.next.next;
                size--;
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public boolean addAll(T[] c) {
        boolean added = false;
        for (Object element : c) {
            added = add((T) element);
        }
        return added;
    }


    public void addAll(int index, T[] addedArray) {
        indexChecker(index);
        if (addedArray == null || addedArray.length == 0) {
            return;
        }
        Node<T> tempNode = head;
        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.next;
        }
        Node<T> newNode;
        for (T data : addedArray) {
            newNode = new Node<>();
            newNode.data = data;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;
            tempNode = newNode;
        }
    }

    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public T get(int index) {
        indexChecker(index);
        Node<T> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.data;
    }

    public T set(int index, T element) {
        indexChecker(index);
        Node<T> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        T oldData = tempNode.data;
        tempNode.data = element;
        return oldData;
    }

    public T add(int index, T element) {
        indexChecker(index);
        Node<T> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        T oldValue = tempNode.data;
        tempNode.data = element;
        return oldValue;
    }


    public boolean remove(int index) {
        indexChecker(index);
        Node<T> tempNode = head;
        Node<T> prev = null;
        for (int i = 0; i < index; i++) {
            prev = tempNode;
            tempNode = tempNode.next;
        }
        if (prev == null) {
            head = tempNode.next;
        } else {
            prev.next = tempNode.next;
        }
        if (tempNode.next == null) {
            tail = prev;
        }
        size--;
        return true;
    }

    public int indexOf(T data) {
        int index = 0;
        Node<T> tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.data.equals(data)) {
                System.out.println(data + " is " + index + " index ");
                return index;
            }
            index++;
            tempNode = tempNode.next;
        }
        System.out.println("Data doesn't exist");
        return -1;
    }

    public ListIterator listIterator() {
        // not implement
        return null;
    }

    public ListIterator listIterator(int index) {
        // not implement
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > size || toIndex < fromIndex || toIndex > size) {
            throw new IndexOutOfBoundsException();
        }
        List<T> subList = new ArrayList<>();
        Node<T> tempNode = head;
        int index = 0;
        while (index < toIndex) {
            if (index >= fromIndex) {
                subList.add(tempNode.data);
            }
            tempNode = tempNode.next;
            index++;
        }
        return subList;
    }

    public boolean removeAll(T[] values) {
        boolean result = false;
        for (T value : values) {
            while (remove(value)) {
                result = true;
            }
        }
        return result;
    }

    public boolean containsAll(T[] values) {
        for (T value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        Node<T> node;
        if (head != null) {
            node = head;
            while (node.next != null) {
                System.out.println(node.data+" ");
                node = node.next;
            }
            System.out.println(node.data+" ");
        }
    }

    private void indexChecker(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index is wrong");
        }
    }
}