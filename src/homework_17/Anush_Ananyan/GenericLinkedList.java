package homework_17.Anush_Ananyan;

public class GenericLinkedList<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;


    public GenericLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFromHead(T item) {
        Node<T> newEl = new Node<T>(item);
        newEl.next = head;
        head = newEl;
        size++;
    }

    public void addFromTail(T item) {
        Node<T> newEl = new Node<T>(item);
        if (head == null) {
            head = newEl;
            tail = newEl;
        } else {
            tail.next = newEl;
        }
        tail = newEl;
        size++;
    }

    public void addAll(T[] items) {
        Node<T> currentEl = head;
        while (currentEl.next != null) {
            currentEl = currentEl.next;
        }
        for (T item : items) {
            currentEl.next = new Node<>(item);
            currentEl = currentEl.next;
            size++;
        }
    }

    public void addAllByIndex(int index, T[] items) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentEl = head;
        for (int i = 0; i < index - 1; i++) {
            currentEl = currentEl.next;
        }
        for (T item : items) {
            Node<T> newNode = new Node<>(item);
            newNode.next = currentEl.next;
            currentEl.next = newNode;
            currentEl = newNode;
            size++;
        }
    }

    public boolean contains(T item) {
        Node<T> currentEl = head;
        while (currentEl != null) {
            if (item.equals(currentEl.element)) {
                return true;
            }
            currentEl = currentEl.next;
        }
        return false;
    }

    public boolean containsAll(T[] items) {
        for (T item : items) {
            if (contains(item)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentEl = head;
        if (currentEl != null) {
            for (int i = 0; i < index; i++) {
                currentEl = currentEl.next;
            }
        }
        return currentEl.element;
    }

    public T set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentEl = head;

        for (int i = 0; i < index; i++) {
            currentEl = currentEl.next;
        }
        T OldElement = currentEl.element;
        currentEl.element = item;
        return OldElement;
    }

    public boolean remove(T item) {
        Node<T> removedEl = head;
        Node<T> previous = null;
        while (removedEl != null) {
            if (item.equals(removedEl.element)) {
                if (removedEl == head) {
                    head = removedEl.next;
                } else {
                    previous.next = removedEl.next;
                }
                size--;
                return true;
            }
            previous = removedEl;
            removedEl = removedEl.next;
        }
        return false;
    }

    public T removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentEl = head;

        for (int i = 0; i < index - 1; i++) {
            currentEl = currentEl.next;
        }
        Node<T> temp = currentEl.next;
        currentEl.next = temp.next;
        size--;
        System.out.print("The element with " + index + " index removed, the value of the element was: ");
        return temp.element;
    }

    public boolean removeAll(T[] items) {
        boolean isRemoved = false;
        for (T item : items) {
            while (contains(item)) {
                remove(item);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    public int indexOf(T item) {
        int index = 0;
        Node<T> currentEl = head;
        while (currentEl != null) {
            if (item.equals(currentEl.element)) {
                return index;
            }
            currentEl = currentEl.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(T item) {

        Node<T> currentEl = head;
        int count = 0;
        int index = -1;
        while (currentEl != null) {
            if (item.equals(currentEl.element)) {
                index = count;
            }
            currentEl = currentEl.next;
            count++;
        }
        return index;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentEl = head;
        while (currentEl != null) {
            sb.append(currentEl.element.toString());
            if (currentEl.next != null) {
                sb.append(", ");
            }
            currentEl = currentEl.next;
        }
        return sb.toString();
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        int i = 0;
        for (Node<T> currentEl = head; currentEl != null; currentEl = currentEl.next) {
            array[i++] = currentEl.element;
        }
        return array;
    }

    public GenericLinkedList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size || toIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        GenericLinkedList<T> sublist = new GenericLinkedList<>();
        Node<T> currentEl = head;
        for (int i = 0; i <= toIndex; i++) {
            if (i >= fromIndex) {
                sublist.addFromTail(currentEl.element);
            }
            currentEl = currentEl.next;
        }
        return sublist;
    }

}