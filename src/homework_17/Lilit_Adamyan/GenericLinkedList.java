package homework_17.Lilit_Adamyan;

import java.util.*;

public class GenericLinkedList<T> {

    public static class Node <T>{
        public T data;
        Node<T> next;

        public Node(T data){
            this.data =data;
            this.next= null;
        }
    }

    Node<T> head;
    Node<T> tail;
    int size;

    public GenericLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(T t) {
        if (t == null || head == null) {
            return false;
        }
        Node<T> current = head;
        while (current != null) {
            if (t.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;

    }
    public boolean containsAll(T[] values) {
        for (T value : values) {
            if (!this.contains(value)) {
                return false;
            }
        }
        return true;
    }


    public boolean add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        size++;
        tail = newNode;
        return true;
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;

    }


    public void sort(Comparator<? super T> c) {

    }


    public void addAll(T[] values) {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        for (T data : values) {
            current.next = new Node<>(data);
            current = current.next;
            size++;
        }
    }


    public boolean addAll(int index, T[] values) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node<T> node = current.next;
        for (T data : values) {
            Node<T> newNode = new Node<>(data);
            current.next = newNode;
            newNode.next = node;
            current = newNode;
            size++;
        }
        return true;
    }


    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index" + index + "size" + size);
        }
        Node<T> current = head;
        if (current != null) {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

        }return current.data;
    }

    public T set(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        T oldData = current.data;
        current.data = element;
        return oldData;

    }

    public boolean remove(T t) {
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.data, t)) {
                if (current == head) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                if (current == tail) {
                    tail = previous;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }


    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<T> current = prev.next;
        prev.next = current.next;
        size--;
        return current.data;
    }


    public boolean removeAll(T[] values) {
        boolean removed = false;
        for(T value :values){
            while (contains(value)){
                remove (value);
                removed = true;
            }
        }
        return removed;
    }

    public int indexOf(T t) {
        int index = 0;
        Node<T> current = head.next;
        while (current != null) {
            if (Objects.equals(t, current.data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    public int lastIndexOf(T t) {
        int index = -1;
        int i = 0;
        for (Node current = head; current != null; current = current.next) {
            if (Objects.equals(current.data, t)) {
                index = i;
            }
            i++;
        }
        return index;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data.toString());
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


    public List subList(int fromIndex, int toIndex) {
        return null;
    }




}
