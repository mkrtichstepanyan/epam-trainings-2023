package homework_17.hovhannes_gspeyan;

import homework_15.hovhannes_gspeyan.sorting_algorithms.SelectionSort;
import homework_16.hovhannes_Gspeyan.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericLinkedList<T> implements Cloneable {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void printList(){
        for (Node<T> current = this.head; current != null; current = current.next) {
            System.out.print(current.value + " | ");
        }
        System.out.println();
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addAll(T [] addedArray){
        for (T t : addedArray) {
            this.add(t);
        }
    }
    public void addAll(int index, T [] addedArray){
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (addedArray == null || addedArray.length == 0) {
            return;
        }
        Node<T> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node<T> newNode;
        for (T value : addedArray) {
            newNode = new Node<>(value);
            newNode.next = current.next;
            current.next = newNode;
            size++;
            current = newNode;
        }
        if (index == size) {
            tail = current;
        }
    }
    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println(current.value);
        return current.value;
    }
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        T oldValue = current.value;
        current.value = element;
        return oldValue;
    }
    public boolean removeByValue(T value) {
        Node<T> current = this.head;
        Node<T> prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    this.head = current.next;
                } else {
                    prev.next = current.next;
                }
                if (current.next == null) {
                    this.tail = prev;
                }
                this.size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
    public boolean removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> current = this.head;
        Node<T> prev = null;

        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            this.head = current.next;
        } else {
            prev.next = current.next;
        }
        if (current.next == null) {
            this.tail = prev;
        }
        this.size--;
        return true;
    }
    public boolean removeAll(T [] values) {
        boolean flag = false;
        for (T value : values) {
            while (this.removeByValue(value)) {
                flag = true;
            }
        }
        return flag;
    }
    public boolean contains(T value) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.value.equals(value)) {
                System.out.println("contains " + value);
                return true;
            }
            current = current.next;
        }
        System.out.println("does not contain " + value);
        return false;
    }
    public boolean containsAll(T...valuesToContain) {
        for (T value : valuesToContain) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[this.size];
        int i = 0;
        Node<T> curr = this.head;
        while (curr != null) {
            arr[i] = curr.value;
            curr = curr.next;
            i++;
        }
        for (T t : arr) {
            System.out.print(t + " | ");
        }
        return arr;
    }
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > this.size || toIndex < fromIndex || toIndex > this.size) {
            throw new IndexOutOfBoundsException();
        }
        List<T> subList = new ArrayList<>();
        Node<T> currentNode = this.head;
        int currentIndex = 0;
        while (currentIndex < toIndex) {
            if (currentIndex >= fromIndex) {
                subList.add(currentNode.value);
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        for (T t : subList) {
            System.out.print(t + " | ");
        }
        return subList;
    }

    public int indexOf(T value) {
        int index = 0;
        Node<T> current = this.head;
        while (current != null) {
            if (current.value.equals(value)) {
                System.out.println(value + " is " + index + " index ");
                return index;
            }
            index++;
            current = current.next;
        }
        System.out.println("index " + " of " + value + " not found! ");
        return -1;
    }

    public int lastIndexOf(T value) {
        int index = this.size - 1;
        Node<T> current = this.tail;
        while (current != null) {
            if (current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index--;
        }
        return -1;
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
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }
    public GenericLinkedList<T> clone() {
        try {
            GenericLinkedList<T> cloned = (GenericLinkedList<T>) super.clone();
            cloned.head = cloneList(this.head);
            cloned.tail = getTail(cloned.head);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private Node<T> cloneList(Node<T> node) {
        if (node == null) {
            return null;
        }
        Node<T> cloned = new Node<>(node.value);
        cloned.next = cloneList(node.next);
        return cloned;
    }

    private Node<T> getTail(Node<T> node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return node;
        }
        return getTail(node.next);
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private static class Node<T> {

        private Node<T> next;
        private T value;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public Node() {
        }
    }
}
