package homework_17.Lilit_Adamyan;

import java.util.*;

public class GenericLinkedList<T>  {

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




    public boolean add(T data) {
        Node<T> newNode = new Node<T>(data);
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


    public void sort(Comparator<? super T> c) {

    }


    public boolean addAll(Collection c) {
        return false;
    }


    public boolean addAll(int index, Collection c) {
        return false;
    }



    public void clear() {
        head = null;
        tail = null;
        size =0;

    }


    public T get(int index) {
        return null;
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public T remove(int index) {

        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }



    public List subList(int fromIndex, int toIndex) {
        return null;
    }



    public boolean removeAll(Collection c) {

        return false;
    }


    public boolean containsAll(Collection c) {
        return false;
    }


}
